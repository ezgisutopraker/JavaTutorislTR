package ch14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_forEachLoop {
    public static void main(String[] args) {
        // task-> iki string array eleamanlarının ortak olmasını kontrol eden varsa
// ortaklari yazdirancode create ediniz.. with for-each

        String [] arr1 = {"zerrin" , "fatih" ,"mustafa" ,"zeynep","iclal" ,"musa" , "kasim" ,"john"};
        String [] arr2 = {"christina" , "bale" ,"mustafa" ,"zeynep","iclal" ,"moossa" , "reese" ,"angel"};


        List <String> ortakIsımler = new ArrayList<>();

        for (String str1: arr1) {

            for (String str2: arr2) {

                if (str1.equalsIgnoreCase(str2)){
                    ortakIsımler.add(str1);
                }

            }

        }

        if (ortakIsımler.isEmpty()){
            System.out.println("ortak isim yok");
        }else System.out.println("ortakIsımler = " + ortakIsımler);


    }
}
