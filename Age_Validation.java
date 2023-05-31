package javaAssignment;

public class Age_Validation
{

    public static void Age(int a)
    {

        if(a>=25 && a<=55)
        {
            System.out.printf("entered valid age group");
        }
        else
        {
            throw new ArithmeticException("entered invalid age group");
        }
    }

    public static void main(String[] args)
    {
        Age_Validation.Age(55);

    }

}
