package ch06_SwitchStatement;

import java.io.CharArrayReader;
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		/*
		 Kullanizi ay ismini girdiginde o ayin kac cektigini ekrana yazan bir program yapiniz

		 */

		Scanner input = new Scanner(System.in);

		System.out.println("ay ismini gir");

		String ayismi = input.nextLine().toUpperCase();

		switch (ayismi){
			default:
				System.out.println("yanlış kelime girdiniz");
				break;
			case "OCAK":
			case "MART":
			case "MAYIS":
			case "TEMMUZ":
			case "AĞUSTOS":
			case "EKİM":
			case "ARALIK":

				System.out.println("girdiğiniz ay 31 gün içerir");
				break;

			case "NİSAN":
			case "HAZİRAN":
			case "EYLÜL":
			case "KASIM":

				System.out.println("girdiğiniz ay 30 gün içerir");
				break;

			case "ŞUBAT":
				System.out.println("yıl giriniz gir");

				int yil = input.nextInt();
				if ( (yil % 4 == 0 && yil % 100 != 0 )  || yil % 400 == 0 ){
					System.out.println("girdiğiniz ay 29 gün içerir");

				}else System.out.println("girdiğiniz ay 28 gün içerir");


			break;
		}




	}

}
