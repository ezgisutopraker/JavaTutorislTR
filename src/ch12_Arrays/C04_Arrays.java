package ch12_Arrays;

import java.util.Arrays;

public class C04_Arrays {
    public static void main(String[] args) {
        //Array eşitlik kontrolü... equals()-> methodu index ve value kontorlü yapar ve true false return eder

        int sayi1 []= {39,3,72,63,84};

        int [] sayi2 = {84,72,63,3,39};

        System.out.println("Arrays.equals(sayi1,sayi2) = " + Arrays.equals(sayi1, sayi2)); //FALSE

        Arrays.sort(sayi1);
        Arrays.sort(sayi2);

        System.out.println("Arrays.equals(sayi1,sayi2) = " + Arrays.equals(sayi1, sayi2)); //TRUE

        System.out.println(sayi1[0] == sayi2[0]); //TRUE

        String str = Arrays.toString(sayi1);

        System.out.println("Arrays.toString(sayi1) = " + Arrays.toString(sayi1));

        System.out.println("str = " + str);

        System.out.println("str.substring(3) = " + str.substring(3));


    }
}
