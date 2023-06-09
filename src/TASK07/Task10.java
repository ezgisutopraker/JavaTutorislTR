package TASK07;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner input = new Scanner(System.in);

        System.out.println("3 harfli kelime giriniz");

        String kelime = input.nextLine();

        String bir = kelime.substring(0,1);
        String iki = kelime.substring(1,2);
        String uc = kelime.substring(2,3);

        String result = !bir.equals(iki) && !iki.equals(uc) && !uc.equals(bir) || bir.equals(uc) && !bir.equals(iki)
                || bir.equals(iki) && !bir.equals(uc) || uc.equals(iki) && !bir.equals(uc)
                ? "kelime = " + kelime :"Girilen kelime unique değildir";

        System.out.println(result);


    }
}