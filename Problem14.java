package javaAssignment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Problem14 {
    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MMM/dd");
        LocalDateTime now = LocalDateTime.now();
        String Date_txt=dtf.format(now).toString();
        System.out.println("String format of Date is ===> " +Date_txt);
    }
}
