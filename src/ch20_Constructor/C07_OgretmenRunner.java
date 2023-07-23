package ch20_Constructor;

public class C07_OgretmenRunner {
    public static void main(String[] args) {
        C07_Ogretmen ogretmen = new C07_Ogretmen("iclal hanim" , 25);

        System.out.println("ogretmen.isim = " + ogretmen.isim);
        //iclal hanim
        System.out.println("ogretmen.tecrube = " + ogretmen.tecrube);
        //25
        System.out.println("ogretmen.kidem = " + ogretmen.kidem);
        //0

        ogretmen.kidemHesapla(12);
        //kidem =24
        //this.kidem = 0

    }
}
