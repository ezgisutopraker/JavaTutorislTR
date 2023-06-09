package ch07_StringManipulations;

import java.util.Scanner;

public class C10_isEmpty {
    public static void main(String[] args) {

        /*
          StringIsEmpty
           String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
          isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
          Yani o String'in length() 0 demektir.
          length()==0 demek isEmpty() true verir demektir.
          Bir String'in bos olup olmadigini anlamak icin "length()==0" kullanmayin, "isEmpty()" kullanin
*/

        String hi = "hello";
        System.out.println("hi.isEmpty() = " + hi.isEmpty()); //false

        //Task->  2: Girilen  isim mutlaka space'den farkli en az 1 character icermediğini kontrol eden code
// create ediniz

        Scanner input = new Scanner(System.in);

        System.out.println("ismini gir");

        String isim = input.nextLine();

        if (isim.isEmpty()){ //boşluk kabul ediyor
            System.out.println("isminizi girmeden ilerleyemezsiniz");
        }else System.out.println("hoşgeldin " + isim);


        if (isim.isBlank()){ //boşluk kabul etmez
            System.out.println("isminizi girmeden ilerleyemezsiniz blank ile");

        }else System.out.println("hoşgeldin blank ile " + isim);
}}
