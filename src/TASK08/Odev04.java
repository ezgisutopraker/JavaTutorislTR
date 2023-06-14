package TASK08;

public class Odev04 {

    public static void main(String[] args) {



//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15


        for (int i = 1; i <= 5; i++) {
            System.out.print(i+" ");
            int cikansayi=0;
            for (int j = 1; j < i; j++) {
                cikansayi +=j;

                System.out.print(((i+ (j*5))- cikansayi)+ " ");

            }

            System.out.println();

        }








    }
}
