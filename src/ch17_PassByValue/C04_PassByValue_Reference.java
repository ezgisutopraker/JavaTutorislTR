package ch17_PassByValue;

public class C04_PassByValue_Reference {

    static double etiketFiyat ; //gunes ay yildiz
    static double indirimOrani ; //gunes ay yildiz

    public static void main(String[] args) {
        // eger bir methodda yapılan değişiklik kalıcı olsun istenirse 1. değişiklik yapılan variablelar static olarak tanımlanır

        etiketFiyat = 100;
        System.out.println("method call öncesi etiket fiyat " + etiketFiyat );

        indirimOrani = 0.1;

        indir(); //method call 90.0
        indir(); //method call 81.0
        indir(); //method call 72.9

        System.out.println("method call sonrası etiket fiyat " + etiketFiyat );

    }

    private static void indir() {
        etiketFiyat *=(1-indirimOrani); //etiket fiyatı indirimli hale geldi
        System.out.println("etiket fiyatı method içinden " + etiketFiyat);




    }
}
