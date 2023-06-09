package TASK06;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise ekrana
“Eşkenar üçgen�? yazdırın. Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen�?
yazdırın. Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen yazdırın�?
		 
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("ilk kenar gir");

		int kenar1 = input.nextInt();

		System.out.println("ikinci kenar gir");

		int kenar2 = input.nextInt();

		System.out.println("üçüncü kenarı gir");

		int kenar3 = input.nextInt();

		if (kenar1 == kenar2 && kenar2 == kenar3) {

			System.out.println("eşkenar üçgen");

		} else if (kenar1 == kenar2 || kenar2 == kenar3 || kenar3 == kenar1) {

			System.out.println("ikizkenar üçgen");

		}else System.out.println("çeşitkenar üçgen");


	}
	

}
