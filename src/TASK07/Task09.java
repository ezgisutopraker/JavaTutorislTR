package TASK07;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista

	    */


        Scanner input = new Scanner(System.in);

        System.out.println("kelime giriniz");

        String cumle = input.nextLine();

        int sayi = cumle.length()/2;

        if (sayi % 2 == 0){

            System.out.println("cumle.substring(0,sayi) = " + cumle.substring(0, sayi));
        }else System.out.println("kelime çift karakterden oluşmuyor");


    }
}
