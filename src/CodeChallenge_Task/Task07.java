package CodeChallenge_Task;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {
        /* Task ->
       0 ~ 9 arasındaki sayilari ENG translate eden  code create ediniz.
       sayı 9'dan buyuk veya sifirdan kucukse, "Gecersiz" print ediniz.
      NestedIf ve Ternary kullanarak 2 yolla da cozunuz
    */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 9) {
            System.out.println("Geçersiz");
        } else {
            String translate;
            if (number == 0) {
                translate = "Zero";
            } else if (number == 1) {
                translate = "One";
            } else if (number == 2) {
                translate = "Two";
            } else if (number == 3) {
                translate = "Three";
            } else if (number == 4) {
                translate = "Four";
            } else if (number == 5) {
                translate = "Five";
            } else if (number == 6) {
                translate = "Six";
            } else if (number == 7) {
                translate = "Seven";
            } else if (number == 8) {
                translate = "Eight";
            } else {
                translate = "Nine";
            }
            System.out.println("Translate: " + translate);

  //TERNARY
            System.out.print("Sayıyı giriniz: ");
            int number2 = scanner.nextInt();

            String result = (number2 < 0 || number2 > 9) ? "Geçersiz" :
                    (number2 == 0) ? "Zero" : (number2 == 1) ? "One" : (number2== 2) ? "Two" :
                            (number2 == 3) ? "Three" : (number2 == 4) ? "Four" : (number2 == 5) ? "Five" :
                    (number2 == 6) ? "Six" : (number2 == 7) ? "Seven" : (number2 == 8) ? "Eight" : "Nine";

            System.out.println("result = " + result);
        }
            }



        }




