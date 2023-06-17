package ch10_MethodCreation.TASK10;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method
		create ediniz
		 */


		Scanner input = new Scanner(System.in);
		System.out.println("ifade gir");
		String str= input.nextLine();

		rakamSayisi(str);


	}

	private static void rakamSayisi(String x ) {
		int toplam = 0;

		for (int i = 0; i < x.length(); i++) {


			char harf = x.charAt(i);

			if(Character.isDigit(harf)){
				toplam ++;
			}

		}

		System.out.println("toplam = " + toplam);


	}

}
