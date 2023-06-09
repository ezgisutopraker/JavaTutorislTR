package TASK06;

import java.awt.event.KeyAdapter;
import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		/*
		 Kullanicidan bir character alin.
		 Bu character buyuk harf ise "Buyuk Harf" yazdirin
		 Bu character kucuk harf ise "Kucuk Harf" yazdirin
		 Bu character harf degil ise "Harf Degil" yazdirin
		*/


		Scanner input = new Scanner(System.in);

		System.out.println("karakter gir");

		char karakter = input.next().charAt(0);

		if (Character.isUpperCase(karakter)) {

			System.out.println("Büyük harf");

		}else if (Character.isLowerCase(karakter)) {

			System.out.println("Küçük harf");

		}else System.out.println("harf değil");


} 

}
