package ch10_MethodCreation;

import java.util.Scanner;

public class C03_MethodCreation {
    public static void main(String[] args) {
        //task -> girilen tam sayının rakamları toplamını print eden METHOD ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("1. notunu gir");
        int sayi = input.nextInt();


        System.out.println("rakamlarToplamı(sayi) = " + rakamlarToplamı(sayi));//method call

    } //METHOD CREATEİ İLK YAPTIK DİREK CALL'A TIKLAMADIK

    public static int rakamlarToplamı(int x) { //method create

        int rakamToplam = 0;

        while (x > 0) { //x 0dan büyük olduğu müddetçe çalış
            rakamToplam += x % 10;  //sayının son basamağı
            x /= 10;


        }
        return rakamToplam;
    }
}


