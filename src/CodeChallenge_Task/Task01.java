package CodeChallenge_Task;

import java.util.Locale;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* Task->
        Girilen jobTitle data için : Eger jobTitle
        qa ise print "is unvaniniz Quality Analyst."
        dev ise print "is unvaniniz Developer."
        ba ise print "is unvaniniz Business Analyst."
        pm ise print "is unvaniniz Project Manager."
        code create ediniz...
       */

        Scanner input = new Scanner(System.in);

        System.out.println("Job title giriniz");

        String unvan = input.nextLine().toUpperCase();

        if (unvan.equals("QA")){
            System.out.println("iş ünvanınız Quality Analyst");
        } else if (unvan.equals("DEV")) {
            System.out.println("iş ünvanınız Developer");
        }else if (unvan.equals("BA")){
            System.out.println("iş ünvanınız Business Analyst");
        } else if (unvan.equals("PM")) {
            System.out.println("iş ünvanınız Project Manager");


        }else System.out.println("yanlış job title girdiniz");

    }
}
