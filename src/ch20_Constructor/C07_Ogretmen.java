package ch20_Constructor;

public class C07_Ogretmen {

    //fields

    String isim;

    int tecrube;

    int kidem;


    public C07_Ogretmen(String isim, int tecrube) { //2 pmli const
        this.isim = isim;
        this.tecrube = tecrube;
    }

    public void kidemHesapla (int kidem) {//int pm alan method
        System.out.println("kidem = " + kidem*2); //methoda gelen int degeri alır
        // 2 ile carpar

        System.out.println("this.kidem = " + this.kidem); //inst variable a islem ypaıldı
          //bu clastaki kidem variable in default degeri ile islem yapar


    }



}
