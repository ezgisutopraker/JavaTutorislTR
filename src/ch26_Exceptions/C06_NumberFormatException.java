package ch26_Exceptions;

public class C06_NumberFormatException {
    public static void main(String[] args) {
        // NumberFormatException -> Sayi formatın olmayan bir datayı parseInt() method runn ederek ınteger'e
// cevirildiğinde oluşan RTE exception
// java'da String içinde ki rakam karakterler parseInt() method ile ınt değere atanabilir

        String str = "1516";
        System.out.println("str = " + (str+53));

        int sayi = Integer.parseInt(str);

        System.out.println("sayi = " + (sayi+53));

        String id = "id12345";

        //int sayi2 = Integer.parseInt(id);
        //System.out.println("sayi2 = " + sayi2);
        //Exception in thread "main" java.lang.NumberFormatException

        try {
            int sayi2 = Integer.parseInt(id);
            System.out.println("bu mesaj hatasız kod mesajıdır");
        } catch (NumberFormatException e) {
            System.err.println("Exception in thread \"main\" java.lang.NumberFormatException");
        }

        //exception olmayan kod

        try {
            int sayi3 = Integer.parseInt(str);
            System.out.println("bu mesaj hatasız kod mesajıdır");
        } catch (NumberFormatException e) {
            System.err.println("Exception in thread \"main\" java.lang.NumberFormatException");
        }


    }
}
