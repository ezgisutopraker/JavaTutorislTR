package ch01_Variables;

public class HelloWorld {

    public static void main(String[] args) {
        //JVM ilk once static yapilari bulur calistirir
        //eger static yapi sadece method da var ise once main methodu bulur run eder

        //konsola hello world yazdirin  comment line
        System.out.println("Hello World"); //bu code konsola yazdirma icin kullanilir

        /*
        yorumlariniz birden fazla satir olursa bu comment block u kullanabilirsiniz

ctrl + d bulundugunuz satiri bir alt satıra dublicate eder
ctrl + d bulundugunuz satiri bir alt satıra dublicate eder


         */

        //TASK: ad soyad yas memleket ve meslek print ediniz(console yazdiriniz)



        System.out.println("Ezgisu Topraker");
        System.out.println(25);
        System.out.println("Balıkesir");
        System.out.println("Mühendis");

        System.out.print("yanyana yazdırır");
        System.out.print("yanyana yazdırır");


        String name = "Ezgi";
        int yaş = 25;
        boolean ögrenciMİ = false ;

        System.out.println(name + " " +yaş + " " +ögrenciMİ);

        String isim = "Ezgi";
        System.out.println("isim = " + isim);
        System.out.println("yaş = " + yaş);
        System.out.println("ögrenciMİ = " + ögrenciMİ);


        int age = 28 ;
        double salary = 15.000;

        System.out.println("age = " + age);
        System.out.println("salary = " + salary);

        int boy;
        boy = 180;
        System.out.println("boy = " + boy);

        int yaş1, age2, count;
        yaş1= 43;
        age2= 36;
        count = 50;

        System.out.println(yaş1 + " " + age2 + " " + count);

       int not = 100, ucret =80, chapter = 2;




    }


}
