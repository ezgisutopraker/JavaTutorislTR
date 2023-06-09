package ch07_StringManipulations;

import java.util.Scanner;

public class TASK01 {
    public static void main(String[] args) {

        //TASK giirlen sifrenin dogru ise erisim izni verin yanlis ise vermeyin
// ternary ile switch ile if ile yapiniz
//bug i bulunu
//contains methodu sifre kontrol islemlerinde KULLANILMAMALI

        String password = "12345";

        Scanner input = new Scanner(System.in);


        System.out.println("sifreni gir");
        String sifre = input.nextLine();

        if (sifre.contains(password)) {
            System.out.println("sifre doğru erişim izni verildi");

        }else System.out.println("şifre yanlış erişim izni verilmedi");

        //Buradaki bug; 1234567890 olarak girersem de sifreyi kabul eder ama contains old için
        //+ - karakter girildiginde de kabul eder

        String result2 = sifre.contains(password) ? "sifre doğru erişim izni verildi" :"by by happiness";

        System.out.println("result2 = " + result2);


        switch (sifre) {
            case "12345" :
                System.out.println("you can log in");
                break;

            default:
                System.out.println("you entered wrong value");
                break;


    }
}}
