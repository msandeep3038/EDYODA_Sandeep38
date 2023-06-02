package javaAssignment;



public class Problem13 {
    static String str="Welcome To Java";
    static String temp="";
    public static void main(String[] args) {
        String[] ch=str.split("");
        for (int i=0;i<ch.length;i++) {
            //System.out.println("String charector ===>" +ch[i]);
            temp=ch[i]+temp;
        }
        System.out.println("String charector ===>" +temp);
    }
}
