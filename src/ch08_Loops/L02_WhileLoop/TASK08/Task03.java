package ch08_Loops.L02_WhileLoop.TASK08;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		/*

        task-> girilen  tamsayı için carpim tablosunu print eden code create ediniz.

		 Ornek input = 13
		 13x1=13 13x2=26  . . .. .  . 13x10=130
		 */

		Scanner input =new Scanner(System.in);

		System.out.println("sayı giriniz");

		int sayi = input.nextInt();

		int a = 1;


		while (a<=10 ){
			System.out.println(sayi + " x " + a + " = " + (sayi*a));
			a++;

		}



	}

}
