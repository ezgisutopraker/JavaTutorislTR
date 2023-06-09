package CodeChallenge_Task;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /*

		task->
		Kullanicinın  yas ve kilo bilgileri için
		18 yasindan kucuk ise kan bagisi yapamaz.
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
		print eden code create ediniz.

		 */

        Scanner input = new Scanner(System.in);

        System.out.println("yaşınızı giriniz");

        int age = input.nextInt();

        System.out.println("kilonuzu giriniz");

        int weight = input.nextInt();

        if (age < 18 || age >= 18 && weight < 50){
            System.out.println("kan bağısı yapamaz");
        } else System.out.println("kan bağışı yapabilir");



    }}
