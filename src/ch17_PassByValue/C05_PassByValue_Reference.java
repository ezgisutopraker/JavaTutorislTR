package ch17_PassByValue;

public class C05_PassByValue_Reference {
    public static void main(String[] args) {
        // eger bir methodda yapılan değişiklik kalıcı olsun istenirse 2. değişiklik yapılan variablelar atama tanımlanır

        double etiketFiyat = 100;
        double indirimOrani = 0.1;
        System.out.println("indirim oncesi etiiket fiyatı " + etiketFiyat); //100

        etiketFiyat = indirim(etiketFiyat,indirimOrani); //method içinden 90

        System.out.println("indirim sonrası etiket fiyatı " + etiketFiyat); //90



        }

    private static double indirim(double etiketFiyat, double indirimOrani) {
        etiketFiyat*= (1-indirimOrani);
        System.out.println("method içinden fiyat " + etiketFiyat );
        return etiketFiyat;
    }
}

