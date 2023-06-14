package TASK08;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /*
        girilen iki sayı arasındaki çift sayıları yanyana  print eden code create ediniz..
         */

        Scanner input =new Scanner(System.in);

        System.out.println("1den büyük birinci tam sayı giriniz");

        int j = input.nextInt();

        System.out.println("1den büyük ikinci tam sayı giriniz");

        int i = input.nextInt();

        for (int k = j; k < i ; k++) {

            if (k%2==0){

                System.out.print(k + " ");
            }

        }

        }

    }






















