package CodeChallenge_Task;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* Task ->
         * Girilen Y/N  degerlerini
         * print eden code create ediniz..
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */


        Scanner input = new Scanner(System.in);

        System.out.println("Print Y or N");

        String str = input.nextLine().toUpperCase();

        if (str.equals("Y")){
            System.out.println("YES");
        }else if (str.equals("N")){
            System.out.println("NO");
        }else System.out.println("wrong input");





    }
}
