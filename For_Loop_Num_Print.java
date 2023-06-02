package javaAssignment;

import javax.swing.*;

public class For_Loop_Num_Print
{
    int i=0;
    int a;

    public void printnumber()
    {
        for (int i=500;i<=1000;i++)
        {
            if(i==808)
            {
                System.out.println("the number found as===>" +i);
            }

        }
    }

    public static void main(String[] args)
    {
        For_Loop_Num_Print obj=new For_Loop_Num_Print();
        obj.printnumber();
    }
}
