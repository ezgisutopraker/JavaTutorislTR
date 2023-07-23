package ch20_Constructor;

public class C06_Ogrenci { //POJO CLASS

    //fields

    String isim = "Zeynep Hanım";
    int yas;
    String name;
    int age;

    public C06_Ogrenci(String isim, int yas) {
      // this.isim = isim;
        // this.yas = yas;

      //  this'leri yoruma aldigimiz icin zeynep hanim (default deger) olur

        isim = isim;
        yas = yas;

        name = isim;
        age = yas;

        System.out.println("pojo içinden isim = " + isim); //furkan bey
        System.out.println("pojo içinden this.isim = " + this.isim); //zeynep hanım
        System.out.println("pojo içinden name = " + name);


    }


    public C06_Ogrenci() {
    }

}
