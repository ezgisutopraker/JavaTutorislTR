package ch09_Break_Continue;

import java.util.Scanner;

public class C04_PinKontrol {
    public static void main(String[] args) {
        // Task -> String data type bir pin datasının 3 giriş hakkına gore kontrol eden code create ediniz.
        Scanner input = new Scanner(System.in);

        String sifre = "12345.abs";
        int girishakki = 3;

        while (true){
            System.out.println("pin kodu gir");
            String password = input.nextLine();

            if (sifre.equals(password)){
                System.out.println("şifre doğru");
                break;
            }else {
                System.out.println("şifre yanlış tekrar dene");
                girishakki--;
                System.out.println("kalan deneme hakkın " + girishakki);

                if (girishakki==0){
                    System.out.println("bloke oldun");
                    break;
                }

        }
    }
}}
