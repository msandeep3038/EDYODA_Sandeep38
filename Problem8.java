package javaAssignment;

public class Problem8 {

    String a = "Welcome To Java";

    public void count()
    {
String[] name=a.split(" ");
int count=0;
        System.out.println(name[0]);
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==' ')
            {
                count=count+1;
            }
        }
        System.out.println(count);

    }

    public static void main(String[] args)
    {
        Problem8 obj=new Problem8();
        obj.count();
    }
}
