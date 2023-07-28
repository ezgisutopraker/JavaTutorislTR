package ch26_Exceptions;

public class C05_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {


    // arraylerde olmayan bir index elemanı ile işlem yapıldığnda oluşan RTE exception
    //yapıldığında oluşan RTE exception

    int [] arr = {22,55,35,34,33,63,21,72};

        System.out.println("arr[0] = " + arr[0]);
       //RTE  System.out.println("arr[8] = " + arr[8]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException


        try {
            System.out.println("arr[8] = " + arr[8]);
            System.out.println("bu kodu okuduysan hata yok");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ArrayIndexOutOfBoundsException hatası aldı");
        }

        System.out.println("hata handle edildi app uygun çalışmakta");


    }}
