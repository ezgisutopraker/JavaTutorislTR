package ch20_Constructor;

public class C05_AracRunner {
    public static void main(String[] args) {


      //new C05_Arac();  cons call eder obje olmaz
      C05_Arac arac = new C05_Arac();

        System.out.println("arac.maxHiz = " + arac.maxHiz);

        C05_Arac arac2 = new C05_Arac(120); //tek pmli cons call edilir
        System.out.println("arac2.maxHiz = " + arac2.maxHiz);
        System.out.println("arac2.model = " + arac2.model);


    }
}
