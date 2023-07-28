package ch26_Exceptions;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

    /*
Task -> Girilen password'un 6 karakterden az 10 karakterden fala olmamasını kontrol eden code create ediniz
 */

        Scanner input = new Scanner(System.in);
        System.out.println("password giriniz");
        String password = input.nextLine();

        try {
            if (password.length()<6 || password.length()>10){

                throw new IllegalArgumentException("Girilen password 6 karakterden az 10 karakterden fala olamaz");
            }else System.out.println("şifre doğru" + password);
        } catch (IllegalArgumentException e) {
            System.out.println("catch block çalıştı");
        }

        System.out.println("kod çalıştı");

        //try catch kullanmaktaki maksat exception ı kontrollü fırlatıp, akışı devam ettirmek
        //Kodun akışında başka şeyler de var. O hatadan bağımsız kod çalışsın istiyoruz


    }}
