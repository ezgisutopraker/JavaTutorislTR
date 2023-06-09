package TASK06;

import java.util.Scanner;

public class _20_ticket_price {

    public static void main(String[] args) {

        /* Trafik cezasının değerini hesaplayın.
45 hız sınırıdır.

Eğer hızınız 55-74 arasında ise:
Ceza 100 $'dır.

Eğer hızınız 75 - 84 arasında ise:
Ceza 150 $'dır.

Eğer hızınız 85 -94 arasında ise:
Ceza 320 $'dır.

Eğer hızınız 94'den daha fazla ise:
Ceza 500 $'dır.

ve ayrıca,
Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.


-----------------------------------------


Örn;

currentSpeed(Hızınız) 87
ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

sonuç 320 olmalıdır.

currentSpeed(Hızınız) 65
ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

sonuç 300 olmalıdır.  */


        Scanner input = new Scanner(System.in);

        System.out.println("hız gir");

        int hiz = input.nextInt();

        System.out.println("ehliyeti var mı? \nvar ise true \n yok ise false yazınız");

        boolean ehliyet = input.nextBoolean();

        int ceza = 0;

        if (hiz >= 55 && hiz <= 74) {


            System.out.println("$ dolardır") ;

        }else if(hiz >=75 && hiz <= 84) {

            System.out.println("ceza = 150$");

        }else if (hiz >= 85 && hiz <= 94) {

            System.out.println("ceza = 320");

        } else if (hiz > 94) {

            System.out.println("ceza = 500$");

        }


//if (hiz>=55 && hiz<=74) ceza = 100;
//       if (hiz>=75 && hiz<=84) ceza = 150;
//       if (hiz>=85 && hiz<=94) ceza = 320;
//       if (hiz>=95 ) ceza = 500;
//       if (!ehliyet && ceza>0) ceza +=200;
//        System.out.println(ceza);



    }
}


