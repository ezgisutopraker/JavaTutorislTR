package ch06_SwitchStatement;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi hafta başlangıcı

        Scanner input = new Scanner(System.in);

        System.out.println("yaşadığınız günü giriniz");
        String gun = input.nextLine().toLowerCase();



        switch (gun) {
            case "pazartesi" :

                System.out.println("100 gün sonra = Çarşamba");
                break;
            case "salı" :

                System.out.println("100 gün sonra = Perşembe");
                break;
            case "çarşamba" :

                System.out.println("100 gün sonra = Cuma");
                break;
            case "perşembe" :

                System.out.println("100 gün sonra = Cumartesi");
                break;
            case "cuma" :

                System.out.println("100 gün sonra = Pazar");
                break;
            case "cumartesi" :

                System.out.println("100 gün sonra = Pazartesi");
                break;
            case "pazar" :

                System.out.println("100 gün sonra = Salı");
                break;
            default:
                System.out.println("geçersiz kelime girişi");


        }

       // gun=(gun+100)%7;g



    }
}

