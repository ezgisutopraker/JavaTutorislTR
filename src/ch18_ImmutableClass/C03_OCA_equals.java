package ch18_ImmutableClass;

public class C03_OCA_equals {
    public static void main(String[] args) {
        String a = "";

        String c = "2cfalse";

        a+= 2;
        a+= 'c';
        a+= false;
        System.out.println("a = " + a);

        String b = "2cfalse";
        System.out.println("b = " + b);

        if (a == b) {//BU ŞART ÇALIŞMAZ REFERENCE DEĞERLERİ FARKLI
            System.out.println("a == b çalışır");

        }


        if (a == "2cfalse") { //BU ŞART ÇALIŞMAZ 2. NİN REFERENCE I BİLE YOK
            System.out.println("a == 2cfalse çalışır");
        }

        if (c == b){ //ÇALIŞIR AYNI REF VE STRING CONSTANT POOLDA TUTULDUĞU İÇİN
            System.out.println("c == b çalışır");
        }

        if (a.equals("2cfalse")){ //ÇALIŞIR
            System.out.println("a.equals(\"2cfalse\" çalışır");
        }




}}
