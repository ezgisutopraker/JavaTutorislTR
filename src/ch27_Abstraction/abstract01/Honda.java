package ch27_Abstraction.abstract01;

public abstract class Honda { //parent
    abstract void motor(); //abs. method

    protected void sunRoof() {
        System.out.println("panoromik cam tavan harika seyir katar");

    }

    String name = "Fatih bey"; //abs classta variable tanımlanabilr

    // abstract  String name = "Fahih bey"; //abs classta variable tanımlanabilr
    // variable abs olamaz Modifier 'abstract' not allowed here

    abstract void koltuk();

    abstract void kapi();


}
