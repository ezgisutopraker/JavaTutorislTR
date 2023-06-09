package TASK07;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */


        Scanner input = new Scanner(System.in);
        System.out.println("ifade giriniz");

        String str = input.nextLine();

        System.out.println("index giriniz");

        int index = input.nextInt();

        System.out.println("str.charAt(index) = " + str.charAt(index));


    }
}
