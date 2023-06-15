package ch08_Loops.L02_WhileLoop.TASK08;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */


				Scanner input = new Scanner(System.in);

				System.out.print("İsim: ");
				String isim = input.nextLine();

				System.out.print("Soyisim: ");
				String soyisim = input.nextLine();

				char ilkHarf = isim.charAt(0);
				char sonHarf = soyisim.charAt(soyisim.length() - 1);

				int baslangic = (int) ilkHarf;
				int bitis = (int) sonHarf;

				System.out.print("Harfler: ");
				int i = baslangic;
				while (i <= bitis) {
					System.out.print((char) i + " ");
					i++;
				}
			}
		}






