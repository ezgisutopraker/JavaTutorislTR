package TASK07;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner input = new Scanner(System.in);

        System.out.println("cümle giriniz");

        String cumle = input.nextLine();

        System.out.println("cumle.contains(\" \") = " + cumle.contains(" "));


    }
}

