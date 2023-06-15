package ch08_Loops.L02_WhileLoop.TASK08;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */

        Scanner input =new Scanner(System.in);

        System.out.println("1den büyük birinci tam sayı giriniz");

        int j = input.nextInt();

        System.out.println("1den büyük ikinci tam sayı giriniz");

        int i = input.nextInt();

        for (int k = j+1 ; k < i; k++) {
            System.out.println("k = " + k);

        }

        int baslangic = Math.min(i,j);
        int bitis = Math.max(i,j);
        int a = baslangic+1;

        while (a < bitis){
            System.out.println(a); 
            a++;
        }





    }
}
