import java.util.*;
import java.util.regex.*;

public class Summarizer {

    // A small stopword set — add more words if you want
    private static final Set<String> STOPWORDS = new HashSet<>(Arrays.asList(
            "a","an","the","and","or","but","if","while","with","for","to","of","in","on",
            "at","by","from","up","down","is","are","was","were","be","been","has","have",
            "had","do","does","did","this","that","these","those","as","it","its","so",
            "they","them","he","she","his","her","you","your","I","we","our","us"
    ));

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter paragraph (end input with an empty line):");

        // Read multiline paragraph until an empty line
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = sc.nextLine();
            if (line == null || line.trim().isEmpty()) break;
            sb.append(line).append(" ");
        }
        String paragraph = sb.toString().trim();
        if (paragraph.isEmpty()) {
            System.out.println("No input provided. Exiting.");
            return;
        }

        // Ask how many sentences desired (optional)
        System.out.print("How many sentences should the summary have? (enter 0 for auto): ");
        int k;
        try {
            k = Integer.parseInt(sc.nextLine().trim());
        } catch (Exception e) {
            k = 0;
        }

        String summary = summarize(paragraph, k);
        System.out.println("\n--- Summary ---");
        System.out.println(summary);
    }

    public static String summarize(String text, int requestedSentences) {
        // Split into sentences (basic splitter)
        String[] sentences = splitIntoSentences(text);
        if (sentences.length == 0) return "";

        // Tokenize and compute word frequencies
        Map<String, Integer> freq = new HashMap<>();
        for (String s : sentences) {
            for (String w : tokenize(s)) {
                String lw = w.toLowerCase();
                if (lw.length() < 2) continue;
                if (STOPWORDS.contains(lw)) continue;
                freq.put(lw, freq.getOrDefault(lw, 0) + 1);
            }
        }

        if (freq.isEmpty()) {
            // fallback: return first sentence(s)
            int take = Math.max(1, Math.min(sentences.length, requestedSentences > 0 ? requestedSentences : 1));
            return joinSentencesInOrder(sentences, take);
        }

        // Score each sentence
        double[] scores = new double[sentences.length];
        for (int i = 0; i < sentences.length; i++) {
            String s = sentences[i];
            List<String> words = tokenize(s);
            double score = 0;
            for (String w : words) {
                String lw = w.toLowerCase();
                if (freq.containsKey(lw)) score += freq.get(lw);
            }
            // normalize by length to avoid bias toward long sentences
            int len = Math.max(words.size(), 1);
            scores[i] = score / len;
        }

        // Determine how many sentences to pick
        int pick;
        if (requestedSentences > 0) {
            pick = Math.min(requestedSentences, sentences.length);
        } else {
            // Auto: pick roughly top 30% sentences (at least 1)
            pick = Math.max(1, (int) Math.round(sentences.length * 0.30));
        }

        // Select top sentence indices by score
        Integer[] idx = new Integer[sentences.length];
        for (int i = 0; i < sentences.length; i++) idx[i] = i;
        Arrays.sort(idx, (a, b) -> Double.compare(scores[b], scores[a]));

        // Choose top 'pick' indices, then sort them in original order
        Integer[] chosen = Arrays.copyOfRange(idx, 0, pick);
        Arrays.sort(chosen);

        // Build summary keeping original sentence order
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < chosen.length; i++) {
            out.append(sentences[chosen[i]].trim());
            if (!sentences[chosen[i]].trim().endsWith(".")) out.append(".");
            if (i < chosen.length - 1) out.append(" ");
        }
        return out.toString().trim();
    }

    private static String[] splitIntoSentences(String text) {
        // Basic sentence splitter using punctuation . ? !
        // Keeps the punctuation with sentence
        List<String> list = new ArrayList<>();
        Matcher m = Pattern.compile("[^.!?]+[.!?]?").matcher(text);
        while (m.find()) {
            String s = m.group().trim();
            if (!s.isEmpty()) list.add(s);
        }
        return list.toArray(new String[0]);
    }

    private static List<String> tokenize(String sentence) {
        List<String> words = new ArrayList<>();
        // Split on non-word characters; keep apostrophes inside words
        Matcher m = Pattern.compile("[a-zA-Z0-9']+").matcher(sentence);
        while (m.find()) {
            words.add(m.group());
        }
        return words;
    }

    private static String joinSentencesInOrder(String[] sentences, int take) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < take; i++) {
            sb.append(sentences[i].trim());
            if (!sentences[i].trim().endsWith(".")) sb.append(".");
            if (i < take - 1) sb.append(" ");
        }
        return sb.toString();
    }
}

