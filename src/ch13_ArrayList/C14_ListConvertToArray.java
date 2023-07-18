package ch13_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C14_ListConvertToArray {
    public static void main(String[] args) {
        //listi Arraye çevirmek için

        ArrayList<String> city = new ArrayList<>(Arrays.asList("balıkesir" , "izmir" , "aydın" , "kocaeli" , "ısparta"));

        //1.yol donen deger Object class a atanırsa

        Object[] arrCity = city.toArray();

        System.out.println("Arrays.toString(arrCity) = " + Arrays.toString(arrCity)); //Arrays.toString(arrCity) = [balıkesir, izmir, aydın, kocaeli, ısparta]

        //2. yol toArray

        String [] arrCity2 = city.toArray(new String[0]);

        System.out.println("Arrays.toString(arrCity2) = " +
                Arrays.toString(arrCity2));//Arrays.toString(arrCity) = [balıkesir, izmir, aydın, kocaeli, ısparta]









    }
}
