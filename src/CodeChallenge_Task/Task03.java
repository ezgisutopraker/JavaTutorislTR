package CodeChallenge_Task;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
   Task->
   Girilen not değeri için
              A => 90 ~100
              B => 80 ~ 89
              C => 70 ~ 79
              D => 60 ~ 69
              F =>  0 ~ 59
              sartlari aralik belirterek yaziniz
​
     Girilen saat değeri için
	 	0 ~12 ==> good morning
		12 ~ 15 ==> good afternoon
		15 ~ 23 ==> good night
		12 ==> good noon
		print eden code create ediniz.

	 */

        Scanner input = new Scanner(System.in);

        System.out.println("not giriniz");


        int not = input.nextInt();

        if (not >= 90 && not <= 100) {

            System.out.println("not = A");

        }else if(not >= 80 && not < 90) {

            System.out.println("not = B");

        }else if (not>= 70 && not < 80) {

            System.out.println("not = C");

        } else if (not>= 60 && not < 70) {

            System.out.println("not = D");

        } else if (not>= 0 && not < 60) {

            System.out.println("not = F");

        }else System.out.println("geçersiz not girdiniz");


    }


}
