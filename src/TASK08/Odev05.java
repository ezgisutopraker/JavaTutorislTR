package TASK08;

public class Odev05 {

    public static void main(String[] args) {

        /*100'den 0'a kadar bütün tek sayıları yazdırınız.
        99-98-97-96....
        100 ve 0 dahil değildir.*/

        int i ;
        for (i= 100; i > 0; i--) {

            if (i%2==1){

                System.out.print(i + " ");
            }
        }

    }
}
