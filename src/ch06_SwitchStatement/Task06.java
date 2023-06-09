package ch06_SwitchStatement;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// kullanicidan VIP (Very Important Person) kisaltmasinda hangi harfin anlamini
		// istedigi soralim
		// girilen harfin aciklamasini yazdiralim

		Scanner input = new Scanner(System.in);

		System.out.println("VIP kısaltmasında hangi harf ne anlam içeriyor öğrenmek için \nV için V harfine \nI için I harfine \nP için P harfine basınız.");
		String kelime = input.nextLine().toUpperCase();

		switch (kelime){
			case "V" :
				System.out.println(kelime + " means 'VERY'");
				break;

			case "I" :
				System.out.println(kelime + " means 'IMPORTANT'");
				break;

			case "P" :
				System.out.println(kelime + " means 'PERSON'");
				break;


			default:
				System.out.println("Yanlış harf girişi");



		}





	}
}
