package javaAssignment;

import java.util.ArrayList;

public class Problem6 {

    public static void main(String[] args) {

        ArrayList<Integer> arr1=new ArrayList<Integer>();

        for(int i=200;i<=500;i++)
        {
        arr1.add(i);
        }
        System.out.println(arr1);
        System.out.println(arr1.get(0));
    }
}
