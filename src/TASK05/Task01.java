package TASK06;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        //Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu asagidaki tabloya gore ekrana yazdiriniz
        //0 - 4 => bebek
        //5 - 12 => cocuk
        //13 - 20 => genc
        //21 - 30 => yetiskin
        //Tanimlanmamis evre


        Scanner input = new Scanner(System.in);

        System.out.println("Yas gir");

        int yas = input.nextInt();

        if (yas >= 21 && yas <= 30) {

            System.out.println("yetişkin");

        }else if(yas >=13 && yas < 21) {

            System.out.println("genç");

        }else if (yas >= 5 && yas < 13) {

            System.out.println("çocuk");

        } else if (yas <= 4 && yas>= 0) {

            System.out.println("bebek");

        }else System.out.println("tanımlanmamış evre");







    }
}
