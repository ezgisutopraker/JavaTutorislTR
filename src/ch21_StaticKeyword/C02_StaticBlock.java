package ch21_StaticKeyword;

public class C02_StaticBlock {
    static String isim = "Şafak Hanım";
    static {
        System.out.println("static block çalıştı");
    }

    public static void main(String[] args) {
        System.out.println("main method başladı");
        isim = "Ali Bey";
        System.out.println("isim = " + isim);
    }


}
