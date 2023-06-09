package ch04_JavaOperators.jo01_ArithmeticOperators;

public class C02_IncrementDecrement {

    public static void main(String[] args) {

    int number = 7 ;

        System.out.println(++number); //8

        System.out.println(number++); //8 (hafızada 9)

        System.out.println(number++   +   ++number); //20
                          // 9        +    11

        System.out.println("number = " + number); //number =11

        System.out.println(number++ + number++); // 11+12=23
        //The value changed at 'number++' is never used











    }







}
