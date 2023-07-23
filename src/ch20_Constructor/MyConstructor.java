package ch20_Constructor;

public class MyConstructor {

    int x = 3;
    int y = 5;

    public MyConstructor() {
        x+=1; //instance variablea 1 eklendi
        System.out.println("x = " + x);
    }

    public MyConstructor(int i) {
        this(); //pm siz const call edildi
        this.y = i; //const a gelen i pmsi this.y ye atandi
        x+=y; // instance var x degerine y eklendi
        System.out.println("x = " + x);
    }

    public MyConstructor(int i, int i2) {
        this(i2); //int pmli const i2 verilerek call edildi
        this.x -= i;//inst var x degerinden i degeri cikarildi
        System.out.println("x = " + x);
    }

    public static void main(String[] args) {
        MyConstructor mc1 = new MyConstructor(4,3);
    }
}
