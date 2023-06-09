package ch03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

     // 1- System.out.println("ismini gir");

     // 1- String isim = input.nextLine();

     // 1- System.out.println("isim = " + isim);


     // 2-  System.out.println("sayiyi gir");

     // 2-  int sayi = input.nextInt();

     // 2-  System.out.println("sayi = " + sayi);


     // 3-  System.out.println("sevdiğin meyve nedir?");

     // 3-  String sevdiginmeyve = input.nextLine();

     // 3-  System.out.println("sevdiginmeyve = " + sevdiginmeyve);


     //  4-  System.out.println("arabadaki kapı sayısını gir");

     //  4-  int sayi = input.nextInt();

     //  4-  System.out.println("sayi = " + sayi);


     //  5-  System.out.println("10 sene önce nerede yaşıyordun?");

     //  5-  String sehir = input.nextLine();

     //  5-  System.out.println("sehir = " + sehir);


     // 6-  System.out.println("Banka hesabınız var mı?");

     // 6-  Boolean answer = input.nextBoolean();

     // 6-  System.out.println("answer = " + answer);


     // 7-  System.out.println("boyunuzu giriniz");

     // 7-  float boy = input.nextFloat();

     // 7-  System.out.println("boy = " + boy);


          /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 74"

		 */

     // 8- System.out.println("Write your mid-term grade");
     // 8- int midterm = input.nextInt();

     // 8- System.out.println("Write your final grade");
     // 8- int final1 = input.nextInt();

     // 8- System.out.println("Write your project grade");
     // 8- int project = input.nextInt();

     // 8- System.out.println("General grade = " + ((midterm*30) + (project*20)+ (final1*50))/100  );


        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */


     // 9- System.out.println("boyunuzu cm olarak giriniz");
     // 9- float boy = input.nextFloat();

     // 9- System.out.println("kilonuzu kg olarak giriniz");
     // 9- float kilo = input.nextFloat();

     // 9- System.out.println("Vücut kütle indeksi = " + (kilo/ ((boy*boy)/10000) ) );


        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

     // 10- System.out.println("Günde kaç saat uyuyorsun?");
     // 10- int saat = input.nextInt();

     // 10- System.out.println("bir ayda uykuda geçen gün sayısı = " + ((saat*30)/24) + "\n" + "bir yılda uykuda geçen gün sayısı = "
     // 10-         + ((saat*365)/24) + "\n" + "40 yılda uykuda geçen gün sayısı = " +((saat*365*40)/24) );


        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */

     // 11-  System.out.println("isim giriniz");
     // 11-  String isim = input.nextLine();

     // 11-  System.out.println("soy isim giriniz");
     // 11-  String soyisim = input.nextLine();

     // 11-  System.out.println("kilo giriniz");
     // 11-  int kilo = input.nextInt();

     // 11- System.out.println("boy giriniz");
     // 11- int boy = input.nextInt();

     // 11- System.out.println("salona devam edilecek ay süresi");
     // 11- int ay = input.nextInt();

     // 11- System.out.println("toplam ücret = " + (ay*20) + " dolardır.");


      // kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.

     // 12-  System.out.println("ilk sayıyı girini<");
     // 12-  float sayi1 = input.nextFloat();

     // 12-  System.out.println("ikinci sayıyı giriniz");
     // 12-  float sayi2 = input.nextFloat();

     // 12-  System.out.println("çarpım = " + (sayi1*sayi2) + "\n" + "toplam = " + (sayi1+sayi2) + "\n" + "fark = " + (sayi1-sayi2) + "\n"
     // 12-  + "bölüm = " + (sayi1/sayi2));


        /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */


      // 13-  System.out.println("1. dik kenarı girin");
      // 13-  double kenar1 = input.nextDouble();

      // 13-  System.out.println("2. dik kenarı giriniz");
      // 13-  double kenar2 = input.nextDouble();

      // 1. yol  double hipotenus = Math.sqrt(Math.pow(kenar1, 2) + Math.pow(kenar2, 2 ));

       // System.out.println("hipotenus = " + hipotenus);

      // 2. yol  double hipotenus = (double) Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));

       // System.out.println("hipotenus = " + hipotenus);



          /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.

     */


     // 14-  System.out.println("mesafeyi giriniz");
     // 14-  int mesafeX = input.nextInt();40

     // 14-  System.out.println("hızı giriniz");
     // 14-  int hızV = input.nextInt();

     // 14-  System.out.println("varış süresi " + (mesafeX/hızV) + " saattir.");


        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */


     // 15-  System.out.println("vize1");
     // 15-  int vize1 = input.nextInt();

     // 15-  System.out.println("vize2");
     // 15-  int vize2 = input.nextInt();

     // 15-  System.out.println("final");
     // 15-  int fınal = input.nextInt();

     // 15-  System.out.println("geçme notu = " +    ( ((vize1+vize2)*30) + (fınal*70)  )/100      );


          /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */


     // 16-  System.out.println("a sayısı giriniz");
     // 16-  float a = input.nextFloat();

     // 16-  System.out.println("b sayısını giriniz");
     // 16-  float b = input.nextFloat();

     // 16-  System.out.println("c sayısını giriniz");
     // 16-  float c = input.nextFloat();

     // 16-  System.out.println("işlem = " +  ( (a*a) - (b*b)  ) / (c*3)     );



        // Write a Java program to convert temperature from Fahrenheit to Celsius degree.

// formula

        // c = (f-32)*5/9


      // 17-   System.out.println("Enter the temperature");
      // 17-   double temperature = input.nextDouble();

      // 17-   System.out.println("Celcius = " + ((temperature-32)*5)/9 );








    }
}
