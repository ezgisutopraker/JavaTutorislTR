package ch06_SwitchStatement;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		TASK :
		Kullanıcıdan notunu alın ve aşağıdaki kurallara göre console'a A, B, C veya D yazdırın.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin

		 */

        Scanner input = new Scanner(System.in);
        System.out.println("not gir");

        int not = input.nextInt();




        switch (not /10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("D");
                break;
            case 5:
                System.out.println("C");
                break;
            case 6:
            case 7:
                System.out.println("B");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("A");
            break;

            default:
                System.out.println("geçersiz not girdiniz");




        }




    }


}
