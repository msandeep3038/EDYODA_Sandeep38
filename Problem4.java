package javaAssignment;

public class Problem4 {
    public static void print_the_day(String action,int a, int b)
    {
        switch (action)
        {
            case "Add":
                System.out.println("Addition of two number "+(a+b));
                break;
            case "Sub":
                System.out.println("Subtraction of two number "+(a-b));
                break;
            case "Mul":
                System.out.println("multiplication of two number "+(a*b));
                break;
            case "Div":
                System.out.println("division of two number "+(a/b));
                break;
            default:
                System.out.println("Invalid action");

        }


    }

    public static void main(String[] args)
    {
        print_the_day("Add",20,10);
    }
}
