package TASK06;

import java.util.Scanner;

public class Ifstatement04 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir sayi alin
		 sayi 3 basamakli ise console ' a 3 basamakli yazdirin
		 sayi 2 basamakli ise console'a 2 basmakli yazdirin
		 sayi 3 basamakli yada 2 basamakli degilse ikiside degil yazdirin

		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Sayı gir");

		int sayi = input.nextInt();

		int basamaksayi = String.valueOf(sayi).length();

		if (basamaksayi == 3) {

			System.out.println("a 3 basamaklı");

		}else if (basamaksayi == 2 ){

			System.out.println("a 2 basamaklı");

		}else System.out.println("ikisi de değil");



	}

}
