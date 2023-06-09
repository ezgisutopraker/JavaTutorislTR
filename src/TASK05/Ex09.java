package TASK06;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {


         /*
            Verilen yilin "Leap Year"(Artik Yil) olup olmadigini kontrol eden kodu yaziniz.
                i)Yil 100 e bolunurse 400 e de bolunmelidir ==> 1600+    1800-
                ii)Yil 100'e bolunmezse 4 e bolunmelidir ==> 1996+    2001-
         */


        Scanner input = new Scanner(System.in);
        System.out.println("yıl gir");
        int yil = input.nextInt();


        if ( (yil % 100 == 0) && (yil % 400== 0) || (yil % 100 !=0 && yil % 4 == 0) ) {

            // || (yil % 400 == 0) ) bu kod eklenmezse 2000 gibi yıllar için yanlış sonuç verir

            System.out.println("girdiğin yil " + yil + " artık (leap) yıldır");


        }else System.out.println("girdiğin yil " + yil + " artık (leap) yıl değil");






    }
}
