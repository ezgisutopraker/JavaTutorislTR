package ch20_Constructor;

public class C05_Arac {
    //Fields-> obj'nin uretilirken alacgı değer variables
//bir class'da bir den çok cons tanımlanabilir
 /*   1) Constructor icinden baska bir Constructor cagirmak icin "this()"
  kullanirsaniz mutlaka ilk satira yazmalisiniz.
Aksi takdirde Compile Time Error alirsiniz.
        2) Bir Constructor icinden sadece bir tane Constructor cagirisi
        yapabilirsiniz.Cunku iki tane cagri yaprsaz
birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
        */


    int maxHiz ;
    String model;

    public C05_Arac(){
        this(30); // pm si int olan tek pmli cons.call ediyor
        System.out.println("pm siz constructor çalıştı");

    }


    public C05_Arac(int i) { //1 pmli constructor
        this(340,"tesla"); //1.pmsi int, 2. pmsi string olan iki pmli cons. call eder
        this.maxHiz = i; //bu classtaki maxHiz variableına i değerini atar
        System.out.println("2 pmli constructor çalıştı");

    }

    public C05_Arac(int i, String marka) { //2 pmli constructor
        this("AUDI",400);  //1.pmsi string, 2. pmsi int olan iki pmli cons. call eder
        System.out.println("2 pmli constructor çalıştı int ve String");
        this.maxHiz=i; ///bu classtaki model variableına marka değerini atar
        this.model= marka; //bu classtaki model variableına marka değerini atar
    }

    public C05_Arac(String marka, int i) { //2 pmli constructor
        System.out.println("2 pmli constructor çalıştı String ve int");
        this.maxHiz=i; //yine bu classtaki maxhiz variableına i değerini atar
        this.model= marka;//yine  bu classtaki model variableına marka değerini atar


    }
}
