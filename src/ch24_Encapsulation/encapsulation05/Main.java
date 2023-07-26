package ch24_Encapsulation.encapsulation05;

import java.util.Scanner;

public class Main {
    /*
 step 1 ->  Burada iki adet class olsun. Biri Main, diğeri ise student ,
   student classı içinde;
 step 2 -> String name(isim) ve int age(yaş)  variables(değişkenler) encapsulated ediniz.

   Main classın içinde;
 step 3 ->  girilen değerleri aşagıdaki gibi print eden code create ediniz
   Örnek:
   age 12'dir.
   name Steven'dır.

   name(isim) olarak;
   "Student name is Steven"
   ve
   age(yaş) olarak da;
   "He is 12 years old"


*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("isminizi girin");
        String name = input.nextLine();

        System.out.println("yaşınızı girin");
        int yas = input.nextInt();

        Student obj = new Student(name,yas);
        System.out.println("obj = " + obj);


    }
}//class son

class Student{

    private String name ;
    private int yas ;

    public Student(String name, int yas) {
        this.name = name;
        this.yas = yas;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "Student name is " + name + "\n" +
                "he/she is " + yas + "years old";
    }

    /*"Student name is Steven"
    ve
    age(yaş) olarak da;
   "He is 12 years old"

     */
}
