package ch08_Loops.L01_ForLoop;

public class C03_nested_foorLoop {
    public static void main(String[] args) {


/*
eger bir döngünün baody'sinde başka  bir döngü bulunuyorsa bu tür döngülere nested-loop->
içiçe döngü denir
İç döngü dış döngünün her adımda tekrar çalışır.
içiçe döngülerde en içteki döngü en önce çalışır..
 */

        //task kat daire örneği ile nested for loop yapınız 10 kat her katta 4 daire

        for (int kat = 0; kat <= 10 ; kat++) { //en dış döngü

            System.out.println("suan bulundugun kat = " + kat);

            for (int daire = 0; daire <=4; daire++) { // en içteki loop

                System.out.println("daire = " + daire);

            }

        }




    }
}
