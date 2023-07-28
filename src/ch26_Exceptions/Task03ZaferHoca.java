package ch26_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task03ZaferHoca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vizeNot = 0;
        int finalNot = 0;

        while (true){
            try {
                System.out.println("vize gir");
                vizeNot = input.nextInt();
                if (vizeNot < 0 || vizeNot > 100){
                    throw new ArithmeticException();

                }else break;
            }catch (ArithmeticException e){
                System.out.println(" not 0 ile 100 arasinda olmaloi");
            }catch (InputMismatchException e){
                System.out.println("hatali giris yaptin");
            }
        }
        while (true){
            try {
                System.out.println("final gir");
                finalNot = input.nextInt();
                if (finalNot < 0 || finalNot > 100){
                    throw new ArithmeticException();

                }else break;
            }catch (ArithmeticException e){
                System.out.println(" not 0 ile 100 arasinda olmaloi");
            }catch (InputMismatchException e){
                System.out.println("hatali giris yaptin");
            }

        }

        ortalama(vizeNot,finalNot);
    }//main sonu
    private static void ortalama(int v , int f){
        double ortalama = (v*0.4 + f*0.6);
        System.out.println("ortalama = " + ortalama);

        if (ortalama >= 65 ) System.out.println("basarilisin");
        else System.out.println("kaldin");
    }
}
