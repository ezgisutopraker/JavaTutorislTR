package ch07_StringManipulations;

import java.util.Scanner;

public class C05_start_endWhit {
    public static void main(String[] args) {

        /**
         * startsWith()
         *  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         *  String'in basladigi characteri dogrular
         * endsWith()
         * Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
         */

        String city = "Istanbul";

        System.out.println("city.startsWith(\"i\") = " + city.startsWith("i")); //false

        System.out.println("city.startsWith(\"Ist\") = " + city.startsWith("Ist")); //true

        System.out.println("city.startsWith(\"stanbul\") = " + city.startsWith("stanbul")); //false

        System.out.println("city.startsWith(\"t\" , 3) = " + city.startsWith("t", 3)); //false (2 olmalıdır)

        //endswhit

        System.out.println("city.endsWith(\"l\") = " + city.endsWith("l")); //true

        System.out.println("city.endsWith(\"bul\") = " + city.endsWith("bul")); //true

        //iki string kontrol

        String str = "asd";
        System.out.println("city.endsWith(str) = " + city.endsWith(str)); //false

        //Task -> girilen e-mail hesabının  @gmail.com ile bitmiyorsa "lütfen gmail hesabı giriniz"
// @gmail.com ile  bitiyorsa "hesabınız onaylandı" aksi durumda "geçerli hesap giriniz
// print edn code creae ediniz.

//note contains ile yaparsaniz true olur iceren herhangi bir karater girse true olur
//bunu endsWith() ile yapiniz

        String hesap = "yeniay13@gmail.com";

        Scanner input = new Scanner(System.in);

       // System.out.println("mail hesabınızı giriniz");

        //String mail = input.nextLine();

        //String result =mail.endsWith("gmail.com") ? "hesabınız onaylandı" : "geçerli hesap giriniz";

        //System.out.println("result = " + result);

        //or

        String kayitliMail = "yeniay13@gmail.com";

        System.out.println("mail hesabınızı giriniz");

        String gmail = input.nextLine();
        if (kayitliMail.endsWith(gmail)){
            System.out.println("hesabınız onaylandı");
        }else System.out.println("geçerli hesap giriniz.");


    }
}
