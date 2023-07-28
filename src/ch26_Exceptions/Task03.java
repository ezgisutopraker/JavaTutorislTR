package ch26_Exceptions;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
//int v = vize
//int f = final

//Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
//Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.

//Diğer durumlarda ise,
//vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)

//Programın çalışmasını sağlayın. (handle edin)

        Scanner input = new Scanner(System.in);
        System.out.println("vize notu giriniz");
        int vize = input.nextInt();
         System.out.println("final notu giriniz");
        int final1 = input.nextInt();

        while (true){

            try {
                ortalama(vize,final1);

            } catch (ArithmeticException e) {
                System.out.println("e = " + e);
                System.out.println("e.getMessage() = " + e.getMessage());
            }
        }




    }

    public static void ortalama(int v, int f) throws ArithmeticException {
        int ortalama = 0;

        if (v > 100 || f > 100 || v < 0 || f < 0){
            throw new ArithmeticException ("vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük olamaz");
        }else{
            int ort = (v+f)/2;
            ortalama += ort;
            System.out.println("ortalama = " + ortalama);
        }
    }

}
