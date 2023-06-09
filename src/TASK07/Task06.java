package TASK07;

import java.util.Scanner;
import java.util.StringJoiner;

public class Task06 {
    public static void main(String[] args) {

        /*
        Girilen String'in son karakterini silen code create ediniz...
         */

        Scanner input = new Scanner(System.in);
        System.out.println("bir ifade giriniz");

        String str = input.nextLine();

        int sonIndex = str.length()-1;

        System.out.println("str.substring(0, sonIndex) = " + str.substring(0, sonIndex));

    }
}
