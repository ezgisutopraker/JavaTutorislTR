package task26.task06;

import java.util.Random;

public class Task06_a {
    public static void main(String[] args) {
        //    randomSayi isminde static void bir method create ediniz.
        //    Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
        //    Bu iki random sayının toplamını yazdırın.
        //    Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
        //     ("Sayı 12'den küçük ise hata verir") print edin.


        randomSayi();

    }

    private static void randomSayi() {

        Random random = new Random();
        int sayi1 = random.nextInt(11);
        int sayi2 = random.nextInt(11);

        int toplam = sayi1 + sayi2;

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
        System.out.println("toplam = " + toplam);

        try {
            if (toplam < 12) {
                throw new ArithmeticException("Sayı 12'den küçük ise hata verir");
            } else System.out.println("12den büyük olduğu için hata yok");
        } catch (ArithmeticException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("catch block çalıştı");
        }


    }


}
