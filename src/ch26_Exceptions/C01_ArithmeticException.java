package ch26_Exceptions;

import java.util.Scanner;

public class C01_ArithmeticException {
    //Matematik işlemlerde oluşan RTE exceptiondır

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("1. sayı gir");
        int sayi1 = input.nextInt();

        System.out.println("2. sayı gir");
        int sayi2 = input.nextInt();

       // RTE int sonuc = sayi1/sayi2;
        //Exception in thread "main" java.lang.ArithmeticException: / by zero

        System.out.println("uygulama çalışmaya devam ediyor");


        //CTRL ALT T YE BAS TRY-CATCH GELİYOR
        try { //kodu ilk derleyen block burasıdır

            /*
1- try-catch kullanıldıgında try block hatasız çalışırsa catch block asla çalışmaz catch block, try
block exception  yakalarsa calışır
2- try block catch veya finally block olmadan CTE verir. try block'tan sonra birden fazla catch
block tanımlanabilir.
   aynıa anda  sadece bir catch block çalışabilir hiç bir catch block çalışmaya da bilir
3- parent - child ilişkisi olan catch'lerde child önce yazılmalı aksi halde CTE
 */
            int sonuc = sayi1/sayi2;
            System.out.println("sonuc = " + sonuc);
            System.out.println("try block içerisinden geliyor");
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("StringIndexOutOfBoundsException sayi sifira bölünmez");
            System.out.println("ex.getMessage() = " + ex.getMessage());
        }catch (ArithmeticException e) { //birden fazla catch de aşağıya doğru class level artmalı
            System.out.println("ArithmeticException sayi sifira bölünmez");

        }catch (Exception e){
            System.out.println("Exception eger bir exception varsa yukardakiler dışında çalışacak yer burası");


    }
        finally {
            System.out.println("finally blocktan selamlar her zaman çalışır");
             /*
try - catch içinde yapılna işlemlerden sonra mutlaka çalışması gerekn block vatsa finally tanımlanır.
ama finaly tanımlanırsa catch çalışmasa bile
pr akışı devam eder.finally block hata olsa da olmasa da calışır.
Cloud database ortamlarında bağlantı kesmek için kullanılır.cloud ile connection yazdıgınızda code
başarılı bir şekilde çalışırsa işlem bitiiğinde finally block ile connection kapanmazsa maliyet pahalı olur :(
 */
        }
        System.out.println("classin en son kodu bakalım konsolda görür müyüz");
}}
