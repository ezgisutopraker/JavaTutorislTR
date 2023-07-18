package CodeChallenge_Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Market_Project {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */

    static ArrayList<String> gunler = new ArrayList<>(Arrays.asList("pazartesi", "salı" ,"çarşamba","perşembe","cuma","cumartesi","pazar"));
    static ArrayList<Double> gunlukKazanclar = new ArrayList<>(); //2. adım

    static double haftaninToplamKazanci =0;
    static Scanner input  =new Scanner(System.in);
    public static void main(String[] args) {

        int gun = 0;

        while (gun<7){
            System.out.println("lütfen " + gunler.get(gun) + " günün hasılatını giriniz");

            double gununKazanci = input.nextDouble();
            gunlukKazanclar.add(gununKazanci); //tekrardan gelen her bir günun hasılatı gunlukKazanclar liste eklendi
            haftaninToplamKazanci+=gununKazanci;// tekrardan gelen her bir günün hasılatı haftalık toplam kazanca eklendi

            gun ++;
        }

      //  System.out.println(haftaninToplamKazanci);
        //System.out.println(gunlukKazanclar);

        System.out.println("haftanın ortalaması = " + getOrtalamaKazanc());
        System.out.println("Ortalamanin Ustunde Kazanc Günleri = " + getOrtalamaninUstundeKazancGünleri());
        System.out.println("getOrtalamaninAltind aKazanc Günleri = " + getOrtalamaninAltindaKazancGünleri());


    }//main sonu

    private static String getOrtalamaninAltindaKazancGünleri() {
        String ortalamaAltiGun= "";

        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if(gunlukKazanclar.get(i)>getOrtalamaKazanc())
              ortalamaAltiGun += gunler.get(i);

        }
        return ortalamaAltiGun;

    }

    private static String getOrtalamaninUstundeKazancGünleri() {
        String ortalamaUstuGun= "";

        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if(gunlukKazanclar.get(i)>getOrtalamaKazanc())
                ortalamaUstuGun += gunler.get(i);

        }
        return ortalamaUstuGun;

    }

    private static double getOrtalamaKazanc() {


        return haftaninToplamKazanci/7;

    }
}//class sonu
