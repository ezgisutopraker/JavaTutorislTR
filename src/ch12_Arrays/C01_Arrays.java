package ch12_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    /*
Array (Dizi): Java'da birden fazla variable store etmek icin kullanilan objelerden biridir
Array olusturulurken 2 seyi declare etmeliyiz:
1- data type (Bir array'in icerisinde sadece ayni data tipinden elemanlar omalıdır.)
2- uzunluk (uzunluk array'in icerisne konul max eleman sayisini belirtir ve bundan fazlasini koymak istersek RTE verir)
array= tepsiye benzer..
Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */
    public static void main(String[] args) {

        //Array tanımlama

        int a ; //primitive data type tanımlandı

        int [] arr ; //declare edilen ama değer atanmayan int data typeli ARRAY

      //  System.out.println("a = " + a);//variable 'a' might not have been initialized
        // System.out.println("arr = " + arr); //variable 'arr' might not have been initialized


        // task nameArray isminde isimleri tutan array create edinz

        String [] nameArray = {"ezgi" , "burak" , "bahattin" , "ceren" , "ecem"};
        //HEM ATAMA HEM DE TANIMLAMA YAPILAN ARRAY

        // task number tutan array create ediniz

        int [] numArray = {11,22,333,66,55,44,88,99,55,2,44,55,6}; //dublicate e izin veriyor

        // int [] sayiArr =  new int[]; //Array initializer expected

        int [] sayiArr =  new int[5]; //BU ARRAY 5 ELEMANLI
        //heap memoryde bunlar nasıl bulunur

        System.out.println("sayiArr = " + sayiArr);

        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));

        sayiArr [0] =13; //arrayin 0. indexteki elemanına 13 değeri atandı

        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));

        sayiArr [1] =34;
        sayiArr [2] =9;
        sayiArr [3] =25;
        sayiArr [4] =48;

        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));
        //Arrays.toString(sayiArr) = [13, 34, 9, 25, 48]

        System.out.println("sayiArr.length = " + sayiArr.length); //5

        System.out.println("nameArray.length = " + nameArray.length);
        System.out.println("numArray.length = " + numArray.length);


        //task her bir arrayin son elemanını print

        int soneleman = sayiArr[sayiArr.length-1];

        System.out.println("soneleman = " + soneleman);

        int son2 = numArray[numArray.length-1];

        System.out.println("son2 = " + son2);

       String nameSon = nameArray[nameArray.length-1];

        System.out.println("nameSon = " + nameSon);

        nameArray[nameArray.length-1]="ezgisu";

        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));

        //loop ile array in elemanları arasında gezinme

        for (int i = 0; i < nameArray.length; i++) {

            System.out.print(nameArray[i] + " ");

        }

        System.out.println();

        // task numArray deki çift index olan elemanları print edin

        for (int i = 0; i < numArray.length; i+=2) {
            System.out.print(numArray[i]+ " ");

        }

        //task name array elemanlarından 5 harfli elemanları print

        for (int i = 0; i < nameArray.length; i++) {

            if(nameArray[i].length() == 5){
                System.out.println(nameArray[i]);
            }

        }

        System.out.println(" // sort //");
        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
        System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));

        Arrays.sort(nameArray);
        Arrays.sort(numArray);
        Arrays.sort(sayiArr);

        System.out.println("Arrays.toString(nameArray) = " + Arrays.toString(nameArray));
        System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));





    }
}
