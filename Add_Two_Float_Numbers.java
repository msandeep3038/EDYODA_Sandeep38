package javaAssignment;

public class Add_Two_Float_Numbers {

    static float a;
    static float b;

    public static float Add(float a, float b)
    {

       return a+b;
    }

    public static void main(String[] args)
    {
        Add_Two_Float_Numbers obj =new Add_Two_Float_Numbers();
        System.out.println(obj.Add(8.6F,9.7F));
    }

}
