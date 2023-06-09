package ch07_StringManipulations;

import java.util.Scanner;

public class C07_indexOf_lastIndexOf {
    public static void main(String[] args) {
        /** indexOf()
       * char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
       * Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
        contains den farkı indexini verir, contains ise true false

      */

        String str = "all is well";

        System.out.println("str.indexOf(\"a\") = " + str.indexOf("a")); // 0

        System.out.println("str.indexOf(\"l\") = " + str.indexOf("l")); // 1

        System.out.println("str.indexOf(\"L\") = " + str.indexOf("L")); // -1

        System.out.println("str.indexOf(\"all\") = " + str.indexOf("all")); // 0

        System.out.println("str.indexOf(\"is\") = " + str.indexOf("is")); // 4

        System.out.println("str.indexOf(\"All\") = " + str.indexOf("All")); // -1


        /** lastIndexOf()
         *  String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
         *  indexOf un sondan olan hali fakat index numaraları değişmez.
         *  lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
         *  indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
         */

        String name = "Jack Nicholson";

        System.out.println("name.indexOf(\"o\") = " + name.indexOf("o")); //9
        System.out.println("name.lastIndexOf(\"o\") = " + name.lastIndexOf("o")); //12

        System.out.println("name.indexOf(\"k\") = " + name.indexOf("k")); //3
        System.out.println("name.lastIndexOf(\"k\") = " + name.lastIndexOf("k")); //3 (sondan arar fakat index no değişmez o yüzden 3)

        /*
task
 Girilen cümlenin aşağıdaki durumları sağlayacak code create ediniz

 1-Girilen cumle java icermiyor
 2-Girilen cumle 1 tane java iceriyor
 3-Girilen cumlede birden fazla java var

 */

        Scanner input = new Scanner(System.in);

        System.out.println("cümle gir");

        String cumle = input.nextLine().toLowerCase();

        if (cumle.indexOf("java") == -1){
            System.out.println("girilen cümle java içermiyor");
        } else if (cumle.indexOf("java")== cumle.lastIndexOf("java")) {
            System.out.println("java bir tane var");
            
        }else System.out.println("java birden fazla var");


    }
}
