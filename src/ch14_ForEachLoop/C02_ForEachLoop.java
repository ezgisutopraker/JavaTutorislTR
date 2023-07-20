package ch14_ForEachLoop;

public class C02_ForEachLoop {
    public static void main(String[] args) {


    //task md array elemanlarının çarpımını print eden code

    int [] [] arr = { {2,5,6,8 }  , {9,2,5,8 } , {3,5,7,9}};

    int carpim = 1;

        for (int [] ictekiArrayler: arr) {

            for (int herBirEleman :ictekiArrayler) {
                //her bir elemana dokunabiliriz

                carpim *= herBirEleman;

            }

        }
        System.out.println("carpim = " + carpim);


    }}
