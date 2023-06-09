package ch07_StringManipulations;

public class C02_Length {
    public static void main(String[] args) {

        String str = "Clarusway ile Java";

        System.out.println("str.length() = " + str.length());


        int lengthOfStr = str.length();

        System.out.println("lengthOfStr = " + lengthOfStr);

        String str1 = "";
        System.out.println("str1.length() = " + str1.length());


        String str2 = " ";
        System.out.println("str2.length() = " + str2.length());

        String str3 = null;
       // RTE System.out.println("str3.length() = " + str3.length());

       // RTE System.out.println("str3.concat(str2) = " + str3.concat(str2));

        String str4 = "null";

        System.out.println("str4.length() = " + str4.length()); //4

        System.out.println("str4 = " + str4); //4


    }
}
