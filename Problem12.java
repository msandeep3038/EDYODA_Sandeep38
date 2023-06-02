package javaAssignment;

public class Problem12 {
    static int count;
    public Problem12() {
// increase the count variable by 1
        count++;
    }

    public static void main(String args[]) {
        Problem12 ob1 = new Problem12();
        Problem12 ob2 = new Problem12();
        Problem12 ob3 = new Problem12();
        Problem12 ob4 = new Problem12();
        Problem12 ob5 = new Problem12();
        Problem12 ob6 = new Problem12();
        System.out.print("Total Number of Objects: " + Problem12.count);
    }
}
