package ch10_MethodCreation;

import java.util.Scanner;

public class C09_UcusProject {
   /* A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$

    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,

            12 ve 24 yas arasindaysa 10% indirim,

            65 yasindan buyukse 30% indirim,

    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz

         */

    static Scanner input =new Scanner(System.in);
    static double fiyatAB = 500*0.1;
    static double fiyatAC = 700*0.1;
    static double fiyatAD = 900*0.1;

    static int yas1 =12;
    static int yas2 =24;
    static int yas3 =65;





    public static void main(String[] args) {

        menuUcus();

    }

    private static void menuUcus() {
        System.out.println("************************");
        System.out.println("******** sayfamıza hoşgeldiniz *********");
        System.out.println("gitmek istediğiniz rotayı seçiniz \nB şehri için B \n C şehri için C \nD şehri için D tuşuna basınız");

        String rotaNum = input.nextLine();

        System.out.println("sadece gidiş için 1 \ngidiş dönüş için 2 tuşlayınız");

        int secenek = input.nextInt();


        switch (rotaNum){
            case "B":
                age();
                gidisDonus();
                tutar();
                break;

            case "C":
                age();
                gidisDonus();
                tutar();
                break;

            case "D":
                age();
                gidisDonus();
                tutar();
                break;



            }
        }

    private static void tutar() {
    }

    private static void gidisDonus() {
    }

    private static void age() {
        System.out.println("yaşınızı giriniz");

        int yas = input.nextInt();
        //if (yas<12 && ){


        }


    }













