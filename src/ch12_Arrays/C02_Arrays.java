package ch12_Arrays;

import ch04_JavaOperators.A;

import javax.naming.PartialResultException;
import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        //Array eleamnı varlığını kontrol etme
        //istenen sayiyi arrayda varmi yokmu kontrol ediniz

        int [] numbers = {12,13,55,66,35,3,4,34,33,63,72};

        int istenenSayi = 35;

        int count = 0;
        boolean flag = false;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == istenenSayi){
                count++;
                flag = true;
                break;
            }

        }

        //count mantığı ile bulma

        if (count >= 1){
            System.out.println("senin sayi var "+ istenenSayi);
        }else System.out.println("senin sayı YOK");

        System.out.println("senin sayının adeti " + count);

        //flag mantığı

        if(flag){ //flag true ise çalışır
            System.out.println("senin sayi var array de "+ istenenSayi);
        }else System.out.println(" sayı array de YOK");


        Arrays.sort(numbers);
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));

        System.out.println("Arrays.binarySearch(numbers,istenenSayi) = " + Arrays.binarySearch(numbers, istenenSayi));
        //Arrays.toString(numbers) = [3, 4, 12, 13, 33, 34, 35, 55, 63, 66, 72]

        Arrays.binarySearch(numbers,istenenSayi); // Arrays.binarySearch(numbers,istenenSayi) = 6


    }
    }

