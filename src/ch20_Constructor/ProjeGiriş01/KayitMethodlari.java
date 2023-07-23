package ch20_Constructor.ProjeGiriş01;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class KayitMethodlari {
    // step 2 a)

    static ArrayList < Kullanici > kullaniciList = new ArrayList<>();

    //Kullanici classındaki hem String hem LocalDateTime olan int değeri
    // girebilmek için içeri Kullanici classını girdik

    static Scanner input = new Scanner(System.in);

    //ste2 b)
    public ArrayList <Kullanici> kayitAl(){
        //kullanici classtan obje üretecek
        //kullanicidan aldığı ismi array liste ekleyecek
        System.out.println("ismini gir");
        String isim = input.nextLine();
        //LocalDateTime time = LocalDateTime.now();

        Kullanici kullanici = new Kullanici(isim,LocalDateTime.now());
        //kullanicidan aldıüımız isim 1. pm olarak const a verdik
        // 2. pm olarak da LocalDateTime.now i direk verdik

        kullaniciList.add(kullanici);

        return kullaniciList;
    }

    //ste3

    public void sansliKullanici (ArrayList<Kullanici> list){
        //bu method her dakikanın ilk 10  saniyesinde kaydolanları
        //bulacak

        for (Kullanici each: list) {
            if(each.kayitZamani.getSecond() <= 10){
                System.out.println("Sn. " + each.name + "bugün şanslı günündesin");
            }else System.out.println("bugün şanslı gününde değilsin tekrar dene");

        }



    }

    public void Listele(){
        System.out.println(kullaniciList);

    }

    public void cikis(){
        System.out.println("güle güle");
    }
}
