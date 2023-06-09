package ch06_SwitchStatement;

import java.util.Scanner;
import java.util.SortedMap;

public class C01_SwitchCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("rakam gir");

        int rakam = input.nextInt();

        if (rakam == 0) {
            System.out.println("sıfır");

        }else if (rakam == 1) {
            System.out.println("bir");

        } else if (rakam == 2) {
            System.out.println("iki");

        }else System.out.println("0 ile 2 arasında bir rakam girmelisin");

        //SWTCH

        System.out.println("swtich ile kodlar");

        switch (rakam) {

            case 0 :
                System.out.println("sıfır");
                break;
            case 1 :
                System.out.println("bir");
                break;
            case 2 :
                System.out.println("iki");
                break;
            default:
                System.out.println("0 ile 2 arasında bir rakam girmelisin");


        }


        System.out.println("ana menu için A \nürün göstermek için B \neklemek için C \nçıkış için Q ya basınız.");

        String islem = input. //scanner classa ulaşma
                        next(). //kullanıcıdan veri
                          toUpperCase(); //kullanıcının girdiği harf büyük harfe çevrildi

        switch (islem) {
            case "A" :
                System.out.println("ana menuye hoşgeldin");
                break;

            case "B" :
                System.out.println("hangi ürünleri görmek istersin");
                break;

            case "C" :
                System.out.println("hangi ürünleri eklemek istersin");
                break;

            case "Q" :
                System.out.println("çıkış işleminiz yapılıyor");
                break;


        }



    }





}
