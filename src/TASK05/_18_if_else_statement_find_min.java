package TASK06;

public class _18_if_else_statement_find_min {

    public static void main(String[] args) {

    /*    Oluşturulan bu 3 int arasında en düşük değerdeki numarayı bulunuz.
          Bu numarayı yazdırınız.
          Not: Kodunuz her farklı senaryoda en küçük numarayı yazdırmalıdır.

          Örn: 10-11-12 > 10  */

        int num1 = 22;

        int num2 = 27;

        int num3 = 28;

        if (num1 < num2 && num1 < num3 ) {

            System.out.println("min value = num1");


        }else if (num2 < num1 && num2 < num3 ) {

            System.out.println("min value = num2");

        } else if (num3 < num2 && num3 < num1 ) {

            System.out.println("min value = num3");
        }






    }
}
