package TASK07;

public class Task13 {
    public static void main(String[] args) {

        //Example 1: Bir String'deki space haric kac tane character kullanildigini gosteren kodu yaziniz
        //           "Ali okula gitti." ==> 14


        //replace() method'u bir String'deki herhangi bir karakteri veya karakterleri degistirmek icin kullanilir.


        //Example 2: Bir String'deki tum 'a' harflerini 'A' ya ceviriniz.


        //Example 3: Bir String'deki tum "kara" kelimelerinin yerine "*" koyunuz


        //Example 4: Bir String'deki tum sayilari "*" a ceviriniz
        //           "AC202117004" ==> AC*********



        String str = "Ali okula gitti.";

        System.out.println("str.replace(\" \", \"\").length() = " + str.replace(" ", "").length());

        String str2 = "ali ata bindi";

        System.out.println("str2.replace(\"a\", \"A\") = " + str2.replace("a", "A"));

        String str3 = "kapkara karanlık karafatma karakter";

        System.out.println("str3.replace(\"kara\", \"*\") = " + str3.replace("kara", "*"));

        String str4 = "BO7348EZ7347AS";

        System.out.println("str4.replaceAll(\"\\\\d\", \"*\") = " + str4.replaceAll("\\d", "*"));

    }
}
