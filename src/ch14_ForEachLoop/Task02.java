package ch14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Task02 {
    public static void main(String[] args) {
         /* TASK :
bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
input : 1,2,-3,4,-5,-6
output :-1,-2,3,-4,5,6

 */

        int [] arr = {1,2,-3,4,-5,-6};
        
        sayininTersIsareti(arr);
        System.out.println();
        isaretDegisimi(arr);
    }

    private static void isaretDegisimi(int[] array) {
        List <Integer> list = new ArrayList<>();

        for (int each: array) {

            each*= -1;

            list.add(each);

        }
        System.out.println("list = " + list);

    }

    private static void sayininTersIsareti(int[] array) {

        for (int w:
             array) {
            w*=-1;
            System.out.print(w + " ");

        }
    }
}
