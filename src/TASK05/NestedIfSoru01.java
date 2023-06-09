package TASK06;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class NestedIfSoru01 {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan cinsiyetini girmesini isteyin.
Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */

			Scanner input = new Scanner(System.in);

		/*System.out.println("cinsiyet gir");

		String cinsiyet = input.nextLine().toLowerCase();

		System.out.println("yaş gir");

		int yas = input.nextInt();

		if (cinsiyet == "erkek") {

			if (yas < 18) {

				System.out.println("erkek çocuk");

			}else if (yas >= 18) {

				System.out.println("Adam");
			} else if (cinsiyet == "kadın") {

				if (yas < 18) {

					System.out.println("kız çocuk");

				}else if (yas >= 18) {

					System.out.println("Kadın");
				}
			}*/

			System.out.println("cinsiyet gir");

			String cinsiyet2 = input.nextLine().toLowerCase();

			System.out.println("yaş gir");

			int yas2 = input.nextInt();

			String str = (cinsiyet2 == "erkek" ? (yas2>18) ? "Adam":"erkek çocuk" :(yas2>18) ? "Kadın":"kız çocuk");

			System.out.println("str = " + str);


		}}

