package ch02_DataTypes_WrapperClass;

public class C01_DataTypes {

    public static void main(String[] args) {


        String name = "Ezgi Hanım";
        String yas = "23;" ;
        int yas2 = 35;
        int yil = 2023;
        boolean emekliMi = false;
        boolean testerMi = true;
        char ch = 'a';




    int dogum = 1998;
    int year = 2023;
    int age = year - dogum;

        System.out.println("age = " + age);


    float f1 = 12.45f ;
    float f2 = 15.45f ;

    double d = 25.5 ;

        System.out.println("f1*f2 = " + f1 * f2);

        byte sayi1= 100;
        byte sayi2= 29;
        byte toplam= (byte) (sayi1+sayi2);

        System.out.println("toplam = " + toplam);


        byte sayi3= 100;
        byte sayi4= 50;
        System.out.println(sayi3 - sayi4);


        int c =33;
        byte by = 120;
        System.out.println("c+by = " + (c + by));
        System.out.println("c+by = " + c + by);


        int sayi5 = 10;
        double sayi6 = 10.5;
        System.out.println("sayi5+sayi6 = " + (sayi5 + sayi6));


        int sayi7 = 45;
        char para = '$';
        System.out.println( sayi7 + para); //81

        System.out.println("sayi7+para = " + sayi7 + para);

        String name2 = "Ezgi Topraker";
        int age2 = 25;
        char cinsiyet = 'k';

        System.out.println("name2 = " + name2);
        System.out.println("age2 = " + age2);
        System.out.println("cinsiyet = " + cinsiyet);

        System.out.println("concatination");
        System.out.println(name2 + "\n"+age2 + "\n" + "\t"+ cinsiyet);


    }







}
