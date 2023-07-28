package ch27_Abstraction.abstract01;

public class Civic extends Lastik {
    /**
     * extend LASTİK yazılırsa Lastik class a concrete bir civic class tanımlanrdı
     * java CTE verdi
     * çözüm olarak
     * a -> unimplemented methodlar implement edildi
     * b -> parent lastik class dan abstract keyword kaldırılmalı
     * c -> concrete olan chil abstract class abstract edilmeli
     */

    //abs. clssta abs. method tanımlanır mı ? evet
    // concrete class ""      ""           ""? hayır

   // public abstract void absMethod();
    //Abstract method in non-abstract class

    @Override //ımplement edilen abs method
    void motor() {
        System.out.println("civic için ideal motor 1.6");

    }

    @Override
    void koltuk() {
        System.out.println("koltuklar kadife kumaş");

    }

    @Override
    void kapi() {
        System.out.println("4 kapı uzun kasa");

    }

    @Override
    public void lastikEbat() {
        System.out.println("lastikler 18 inç");

    }

    public int vites(){
        return 6;
    }
}
