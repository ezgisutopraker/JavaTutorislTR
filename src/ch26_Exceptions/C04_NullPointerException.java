package ch26_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {


        // --> null ataması yapılan bir string te lenght() method run edildiğinde oluşan RTE exception

        String str = "";
        System.out.println("str.length() = " + str.length());


        String str1 = null;
        // RTE System.out.println("str1.length() = " + str1.length());
        //Exception in thread "main" java.lang.NullPointerException

        try {
            System.out.println("str1.length() = " + str1.length());
            System.out.println("bu mesajı okursan null ın lenghtini aldın demektir");
        } catch (NullPointerException e) {
            System.out.println("null in lenght i olurmu");
        }

        try {
            System.out.println("str.length() = " + str.length());
            System.out.println("bu mesajı okursan \"\" un lenghtini aldın demektir");
        } catch (Exception e) {
    }


    }}
