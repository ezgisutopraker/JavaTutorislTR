package ch02_DataTypes_WrapperClass;

import javax.sound.midi.Soundbank;

public class C03_Concatination {

    public static void main(String[] args) {

        char ch = 'A';
        char ch2 = 'C';

        System.out.println(ch + ch2);
        System.out.println("ch+ch2 = " + ch + ch2);
        System.out.println('A'+'C');
        System.out.println("A"+"C");

        String name = "Zeynep Hanım";
        String lastname = "Fitnat";

        int a = 7 ;
        int b = 11;

        System.out.println(name + lastname + a + b ); //Zeynep HanımFitnat711
        //stringten sonra concat eder (tam sayı olsa dahi)

        System.out.println(a + b + name + lastname); //18Zeynep HanımFitnat

        System.out.println(name+ lastname + (a+b)); //Zeynep HanımFitnat18

        System.out.println(name + (a-b) + (a-b)); //Zeynep Hanım-4-4
        System.out.println(name+ (   (a-b)  + (a-b)    )         ); //Zeynep Hanım-8

        char num = '1'; //ASCİİ 1 = 49
        System.out.println(name+num); //ZeyneP Hanım1  (stringten sonra geliyor num)

        System.out.println(a+num+name); //56Zeynep Hanım

        System.out.println(name + (num+b));//Zeynep Hanım60
        System.out.println(a+ name + num ); //7ZeynepHanım1  (1 yazdık çünkü string)




















    }








}
