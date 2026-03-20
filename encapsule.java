
class human
{
    private int age;
    private String name;

    public int getAge(){
        return age;
    }

    public void setAge(int a)
    {
        age=a;
    }

    public String getName(){
        return name;
    }

    public void setName(String n)
    {
            name = n;
    }


}
public class encapsule {
    public static void main (String a[])
    {
        human obj = new human();
        obj.setAge(20);
        obj.setName("kartik");

        System.out.println(obj.getName()+":"+ obj.getAge()
        );
    }


}
