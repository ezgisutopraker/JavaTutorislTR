package TASK07;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        Scanner input = new Scanner(System.in);
        System.out.println("ad soyad giriniz");

        String str = input.nextLine();

        int boslukIndex = str.indexOf(" ");

        System.out.println(str.substring(0, boslukIndex));

        System.out.println(str.substring(boslukIndex));

    }
}
