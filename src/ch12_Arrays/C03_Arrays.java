package ch12_Arrays;

import java.util.Arrays;

public class C03_Arrays {
    public static void main(String[] args) {

        //String i array e çevirme ... split() -> girlen parametre değere göre String ifade parçalanır

            String str = " tam oturması için birkaç örnek daha gerekir  ";

           String [] yeniArr =  str.trim().split(" "); //string Array e çevrildi

        System.out.println("str = " + str);

        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));

        System.out.println("yeniArr.length = " + yeniArr.length);



        //task str objesinde kaç tane karakter sayisini kullanilmiştir print ettrin

        System.out.println("str.length() = " + str.length());

        // task str objesinde kaç harf kullanılmıştır print ettirin.

        String bosluksuz = str.replaceAll(" ", "");
        System.out.println("bosluksuz.length() = " + bosluksuz.length());

        System.out.println("bosluksuz.split().length = " + bosluksuz.split("").length);

        int harfSayisi1 = yeniArr[0].length();
        System.out.println("harfSayisi1 = " + harfSayisi1);


    }
}
