package ch21_StaticKeyword;

public class C01_Runner {
    public static void main(String[] args) {

       C01_Ogretmen.okul = "tayyar mehmet paşa okulu";

       C01_Ogretmen ogretmen = new C01_Ogretmen("Mustafa bey", 35);

        System.out.println("ogretmen = " + ogretmen);
        System.out.println("ogretmen.isim = " + ogretmen.isim);
        System.out.println("ogretmen.tecrube = " + ogretmen.tecrube);
        System.out.println("ogretmen.okul = " + ogretmen.okul);

        //okul static old için objeden call edilmemeli. class ismiyle
        System.out.println("C01_Ogretmen.okul = " + C01_Ogretmen.okul);

        C01_Ogretmen ogretmen2 = new C01_Ogretmen("Zeynep hanım", 25);
        C01_Ogretmen.okul = "yıldız teknik okulu";

        System.out.println("ogretmen = " + ogretmen2);
        System.out.println("ogretmen.isim = " + ogretmen2.isim);
        System.out.println("ogretmen.tecrube = " + ogretmen2.tecrube);

        System.out.println("C01_Ogretmen.okul = " + C01_Ogretmen.okul);

        //static method class name ile call edildi
        C01_Ogretmen.maasHesapla();
        //non static method obj ile call edildi
        ogretmen2.evlilikYilDonumu();

    }
}
