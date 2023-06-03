package javaAssignment;

public class Problem9 {

    String a="ABCDE12345";

    public void numbers()
    {
        //String[] ch=a.split("");
        //System.out.println(a.length());
        String temp="";

        for(int i=0;i<a.length();i++)
        {
            if(isNumeric(a.charAt(i)+""))
            {
                temp=temp+a.charAt(i);
            }

        }
        System.out.println("Number is ====>"+temp);
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Problem9 obj=new Problem9();
        obj.numbers();
    }
}
