package CodeChallenge_Task;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /* Task->
         * Girilen fiyat içinb
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * print eden code create ediniz
         */

        Scanner input = new Scanner(System.in);

        System.out.println("fiyat giriniz");

        int fiyat = input.nextInt();

       String result = fiyat < 10 ? "ucuz" : fiyat >= 10 && fiyat<20 ? "normal" : "pahalı";

        System.out.println("result = " + result);
    }
}
