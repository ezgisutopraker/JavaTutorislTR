package ch20_Constructor.ProjeGiriş01;

import java.util.Scanner;

import static ch20_Constructor.ProjeGiriş01.KayitMethodlari.kullaniciList;

public class GirisPaneli {

    public void giris(){

        KayitMethodlari obj = new KayitMethodlari();
        Scanner input = new Scanner(System.in);

        System.out.println("yapacağın işlemi seç" +
                " \n1 -> kayit ol \n2 -> şanslı kişi bul" +
                "\n3 -> tüm kullanıcıları listele \n4 -> çıkış");


        int secim = input.nextInt();

        switch (secim){
            case 1:
                obj.kayitAl();
                giris();
                break;
            case 2:
            obj.sansliKullanici(kullaniciList);
            giris();
                 break;
            case 3:
            obj.Listele();
            giris();
            break;
            case 4:
                obj.cikis();
                break;

            default:
                System.out.println("hatali tuşlama tekrar dene");
                giris();
                break;


        }






    }
}
