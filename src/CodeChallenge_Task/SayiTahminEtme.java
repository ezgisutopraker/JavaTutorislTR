package CodeChallenge_Task;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminEtme {
    /*
Sayı tahmin etme oyunu....
Bilgisayardan rastle(random class kullanılarak) 0-100 arasında bir sayı alıp kullanıcının
tahminini her defasından büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan code create ediniz .
*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        int pcSayi = rnd.nextInt(100)+1;
        System.out.println("pcSayi = " + pcSayi);

        System.out.println("*** tahmin oyununa hoşgeldiniz *** \n1-100 arası sayı giriniz");

        int tahmin = input.nextInt();

        if (tahmin < 100 && tahmin >0){
            while (tahmin!=pcSayi){
                if (tahmin<pcSayi){
                    System.out.println("sayıyı arttır");
                    tahmin = input.nextInt();
                }else {
                    System.out.println("sayıyı azalt");
                    tahmin = input.nextInt();
                }
            }System.out.println("bingo kazandınız");

        }else System.out.println("Hatalı sayı girdiniz");
    }
}
