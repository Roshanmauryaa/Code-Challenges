import java.util.Scanner;
public class Student_Grade_calculator {
    public static int getValidMarks(Scanner sc, String subject) {
        int marks;
        while (true) {
            System.out.println(subject + "(0-100); ");
            marks = sc.nextInt();

            if (marks >= 0 && marks <= 100) {
                return marks;

            } else {
                System.out.println("invalid marks enter the number between 0 to 100");
            }
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of students");
        int n = sc.nextInt();

        int[] mech = new int[n];
        int[] english = new int[n];
        int[] comm = new int[n];
        int[] math = new int[n];
        int[] phys = new int[n];


        double[] perecentage = new double[n];
        char[] grade = new char[n];


// For input Marks
        for (int i = 0; i < n; i++) {


            System.out.println("\n Enter marks for students " + (i + 1));

            mech[i] = getValidMarks(sc, "Mechanics");
            english[i] = getValidMarks(sc, "English");
            comm[i] = getValidMarks(sc, "Communication");
            math[i] = getValidMarks(sc, "Maths");
            phys[i] = getValidMarks(sc, "Physics");
            int total = mech[i] + english[i] + comm[i] + math[i] + phys[i];
            perecentage[i] = total / 5.0;


//.....
            // Grade calculation
            if (perecentage[i] >= 90)
                grade[i] = 'A';
            else if (perecentage[i] >= 80)
                grade[i] = 'B';
            else if (perecentage[i] >= 70)
                grade[i] = 'C';
            else if (perecentage[i] >= 60)
                grade[i] = 'D';
            else
                grade[i] = 'F';

        }
        // Print Table
        System.out.println("\n----------Student Result Table -----------");
        System.out.println("Stu\tMech\tEng\tComm\tMath\tPhy\t%\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + "\t" +
                    mech[i] + "\t" +
                    english[i] + "\t" +
                    comm[i] + "\t" +
                    math[i] + "\t" +
                    phys[i] + "\t" +
                    perecentage[i] + "\t" +
                    grade[i]);
        }
        sc.close();

    }
}

//
//input validation loop
//            while (true) {
//                    System.out.print("enter percentage of students " + (i + 1) + "(0-100):");
//marks[i] = sc.nextInt();
//
//                if (marks[i] >= 0 && marks[i] <= 100) {
//        break; // valid input
//        } else {
//        System.out.println("invalid marks ! please enter between 0-100 ;");
//                }
//                        }

