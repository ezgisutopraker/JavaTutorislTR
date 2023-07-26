package ch23_AccessModifier;

public class C01_AccessModifier {
    /*
     1      1) "private" class member'lar sadece icinde bulunduklari class'larda kullanilabilirler.
         Diğer class'lardan "private" class member'lari kullanamaz.

            2) Diğer package'lerden   olusturulan object için class'i import edilmeli

     2      3) Diğer package'lerden default class memberlara erişilemez.
           "default" ile "package private" es anlamlidir.

     3      4) public class member'lara herkes her yerden erişebilir.(farkli java projesi disinda).

     4      5) "protected" class member'lara ayni package'dan erişilebilir. Farkli package
          için : a)Child class erişebilir.     b)Child class degil ise erişilemez.

           6) Class'lar için  sadece "public" ve "default" access modifier kullanilir.
           Class tanımlanırken "private" veya "protected" access modifier kullanilmaz.

  */

    //fields

    private int privateYas;
    int defaultYas; //access modifier yazılmazsa default olur (package private)
    protected int protedtedYas;
    public int publicYas;

    public C01_AccessModifier(){
        System.out.println("pm siz const dan selamlar");
    }

    private C01_AccessModifier(int privateYas, int protedtedYas) {
        System.out.println("access modifierı private pm si private ve protected  olan const dan selamlar");
        privateMethod();
        this.privateYas = privateYas;
        this.protedtedYas = protedtedYas;
    }
    // C01_AccessModifier objePrivate = new C01_AccessModifier(25,55);

    public C01_AccessModifier(int privateYas, int protedtedYas, int publicYas) {
        this.privateYas = privateYas;
        this.protedtedYas = protedtedYas;
        this.publicYas = publicYas;
    }

    private void privateMethod (){
        System.out.println("private method çalıştı");
    }

    protected void protectedMethod (){
        System.out.println("protected method çalıştı");
    }

    @Override
    public String toString() {
        return "C01_AccessModifier{" +
                "privateYas=" + privateYas +
                ", defaultYas=" + defaultYas +
                ", protedtedYas=" + protedtedYas +
                ", publicYas=" + publicYas +
                '}';
    }


    public static void main(String[] args) {


    }
}
