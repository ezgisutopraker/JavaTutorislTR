package TASK06;

public class _17_if_else_if_statement_find_max {

    public static void main(String[] args) {

      /* Oluşturulan bu 3 int içinde en yüksek değerli olanı bulun.
         Bu en yüksek numarayı yazdırın.

         Not: Num1 = 18 veya Num2 = 25 değerini değiştirdiğinizde kodunuz maksimum değeri yazmalıdır.
         Tüm farklı senaryolarda maksimum sayıyı yazdırmalıdır  */

        int num1 = 22;

        int num2 = 27;

        int num3 = 28;

        if (num1 > num2 && num1 > num3 ) {

            System.out.println("max value = num1");


        }else if (num2 > num1 && num2 > num3 ) {

            System.out.println("max value = num2");

        } else if (num3 > num2 && num3 > num1 ) {

            System.out.println("max value = num3");
        }





    }
}
