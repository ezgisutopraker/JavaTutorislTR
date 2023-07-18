package ch12_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //Array copy... copyOf(arr,newLength); -> girilen arr'in newLength kadar ilk elemanını kopyalar

        int [] sayi  = {84,72,63,3,39,55,66,654,85,35};

        int yeniArr [] = Arrays.copyOf(sayi,15);

        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));


        int rangeArr [] = Arrays.copyOfRange(sayi, 5,15);

        System.out.println("Arrays.toString(rangeArr) = " + Arrays.toString(rangeArr)); //Arrays.toString(rangeArr) = [55, 66, 654, 85, 35, 0, 0, 0, 0, 0]

        //fill methodu update için kullanılır istenilen değerle fuller

        Arrays.fill(rangeArr,5);

        System.out.println("Arrays.toString(rangeArr) = " + Arrays.toString(rangeArr)); //Arrays.toString(rangeArr) = [5, 5, 5, 5, 5, 5, 5, 5, 5, 5]

        Arrays.fill(rangeArr,2,7,0);
                System.out.println("Arrays.toString(rangeArr) = " + Arrays.toString(rangeArr)); //Arrays.toString(rangeArr) = [5, 5, 0, 0, 0, 0, 0, 5, 5, 5]


    }
}
