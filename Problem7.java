package javaAssignment;

public class Problem7 {
    public static int returnNumber() {
        int c = 0;
        float a = 7.8f;
        //a=(int)a;
        float b = 4.4f;
        //b=(int)b;
        c=Math.round(a)+Math.round(b);
        return c;
    }
    public static void main(String[] args)
    {

        System.out.println(returnNumber());
    }
}
