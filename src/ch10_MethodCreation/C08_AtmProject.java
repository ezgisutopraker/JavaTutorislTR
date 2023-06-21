package ch10_MethodCreation;

import java.util.Scanner;

import static ch10_MethodCreation.C05_Crud.cikis;

public class C08_AtmProject {

    static Scanner input = new Scanner(System.in);
    static String password ="1234a.";
    static double bakiye = 1000.25;
    static int count = 3; //kullanıcı yanlış girme hakkı
    public static void main(String[] args) {
        //basit bir atm prohgramı
        //switch case, method creation, diğer konuları kullnarak yazınız


        sifreKontrol();



    }

    private static void sifreKontrol() {
        System.out.println("****************************");
        System.out.println("****** Bankamıza hoşgeldiniz *******");
        System.out.println("hoşgeldiniz şifrenizi giriniz");

        String sifre = input.nextLine();

        while (count>0){
            if (sifre.equals(password)){
               anaMenu(); //şifre doğru ise ana menüye yönlendir
                break;
            }else {
                System.out.println("şifre eşleşmedi");
                System.out.println("tekrar deneyin");
                sifre=input.nextLine();

                count--;
                if(count==0){
                    System.out.println("kart bloke oldu");
                    break;
                }
            }
        }
    }

    private static void anaMenu() {
        System.out.println("bakiye sorgulamak için 1 \npara yatırma için2 \npara çekme için3 \nçıkıi için 4e basımız");

        int secim = input.nextInt();

        switch(secim){
            case 1:
                bakiyeSorgula();
                anaMenu();
                break;
            case 2:
                paraYatir();
                anaMenu();
                break;
            case 3:
                paraCekme();
                anaMenu();
                break;
            case 4:
                cikis();
                break;

            default:
                System.out.println("hatali seçim");
                anaMenu();
                break;
        }
    }

    private static void paraCekme() {
        System.out.println("çekmek istediğiniz tutarı giriniz");
        int cekilenPara = input.nextInt();
        System.out.println("bakiye = " + bakiye);

        if (cekilenPara<=bakiye){
            bakiye -=cekilenPara;
            System.out.println("kalan bakiye = " + bakiye);
        }else System.out.println("yetersiz bakiye çekim yapılamaz");
    }

    private static void paraYatir() {
        System.out.println("yatırmak istediğiniz tutarı girin");
        int girilenPara= input.nextInt();
         bakiye+= girilenPara;
        System.out.println("yeni bakiye = " + bakiye);
    }

    private static void bakiyeSorgula() {
        System.out.println("bakiyeniz"+ bakiye);


    }


}
