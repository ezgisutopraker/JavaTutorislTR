package ch26_Exceptions;

public class C03_ClassCastException {
    public static void main(String[] args) {
        //ClassCastException --> Birbirine dönüştürelemeyen data typelar birbirine dönüştürüldüğünde oluşan
        //RTE Exception olur

        Object obj ="javadan sudan konuşuyoruz";
        String str = (String) obj; //aslında parent class tanımlanmış String bir variable Stringe cast edildi
        System.out.println("str = " + str);

        Object sayi = 10;
        // String str2 = (String) sayi;
        // RTE   System.out.println("str2 = " + str2);
        //Exception in thread "main" java.lang.ClassCastException

        try {
            String str2 = (String) sayi;
        } catch (ClassCastException e) {
            System.out.println("int deger Stringe cast edilemez");
        }



        try {
            String str3 = (String) obj;
            System.out.println("bu kodu okuduysan kod hatasız çalışmış demektir");
        } catch (Exception e) {
            System.out.println("cast işlemi başarısız oldu");
        }
        System.out.println("bu kod çalışır mı");
    }
}
