package CodeChallenge_Task;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ManavProject {
    /* TASK :
     * Basit bir 5 ürünlü manav alisveris programi yaziniz.
     *
     * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
     * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
     * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
     * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
     * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
     * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
     *
     * */

    static ArrayList<String> urunListesi = new ArrayList<>(Arrays.asList("domates","biber","patlıcan","muz","çilek"));
    static ArrayList<Double> urunFiyatListesi = new ArrayList<>(Arrays.asList(8.5,10.3,13.2,35.7,23.8));
    static Scanner input  =new Scanner(System.in);

    static double toplamOdenecekMiktar =0;
    public static void main(String[] args) {

        System.out.println(urunListesi);
        System.out.println(urunFiyatListesi);
        musteriSecim();




    }//main sonu

    private static void musteriSecim() {
        System.out.println("hangi ürünü istersiniz");
        int secim = input.nextInt();
        System.out.println("seçtiğin ürün miktarını gir");
        double kilo = input.nextDouble();

        toplamOdenecekMiktar += kilo*urunFiyatListesi.get(secim-1);
        System.out.println("seçtiğiniz ürün" + urunListesi.get(secim-1) + "\n" +"seçtiğiniz ürünün fiyatı" + urunFiyatListesi.get(secim-1));

        System.out.println("Alışverişe devam etmek için 1 Kasa için 2 girin");
        int karar = input.nextInt();
        if (karar ==1){
            musteriSecim();
        }else if (karar == 2) {
            kasa();
        }else System.out.println("yanlış tuşlama yeniden deneyin");

    }

    private static void kasa() {

        System.out.println("Ödemeniz gereken miktar" + toplamOdenecekMiktar+ "yine bkeleriz");
    }
}//class sonu
