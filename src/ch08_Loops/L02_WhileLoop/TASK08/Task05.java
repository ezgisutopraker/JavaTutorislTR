package ch08_Loops.L02_WhileLoop.TASK08;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */


				Scanner input = new Scanner(System.in);

				System.out.print("İsim soyisim: ");
				String isim = input.nextLine();


			//	int harfSayi = isim.length()-1;
			//	int i=0;
//
			//	while (i <= harfSayi) {
			//		String harf = String.valueOf(isim.charAt(i));
			//		//if (!(harf.equals(" "))){
			//			System.out.print(isim.charAt(i)+ " ");
//
			//			i++;
//
			//	}
//
		System.out.println("İsim: ");
		String isim1 = input.nextLine();
		System.out.print("Soyisim: ");
		String soyisim = input.nextLine();

		int i = 0;
		int j = 0;

		while (i < isim1.length()) {
			System.out.print(isim.charAt(i) + " ");
			i++;
		}

		while (j < soyisim.length()) {
			System.out.print(soyisim.charAt(j) + " ");
			j++;
		}


	}
}









