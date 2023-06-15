package ch08_Loops.L02_WhileLoop.TASK08;

public class Task04 {

	public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */

		int sayi =100;

		while (sayi < 1000){
			if (sayi %4 == 0 && sayi%6==0){
				System.out.println("sayi = " + sayi);
			}
			sayi++;

		}


		

		
			
	}

}
