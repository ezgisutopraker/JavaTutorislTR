package TASK07;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Ali Mert Yılmaz -> A.M.Y.  şeklinde print eden code create ediniz.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("3 kelimelik isim giriniz");

        String str = input.nextLine();

        int boslukIndex1 = str.indexOf(" ");
        int boslukIndex2 = str.lastIndexOf(" ");

        System.out.println("str.charAt(0) + \".\" + str.substring(boslukIndex1+1,boslukIndex2).charAt(0) + \".\" + str.substring(boslukIndex2+1).charAt(0) + \".\" = "
                + str.charAt(0) + "." + str.substring(boslukIndex1 + 1, boslukIndex2).charAt(0) + "." + str.substring(boslukIndex2 + 1).charAt(0) + ".");

    }
}
