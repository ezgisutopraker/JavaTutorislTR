package ch29_Iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01_Iterator {
    public static void main(String[] args) {

        Arrays Arrays = null;
        List<String> list1 = new ArrayList<>(Arrays.asList("Zeynep ", "Ahmet", "Eren", "Iclal", "Safak", "Fatih", "Ali"));


        System.out.println("list1 in ilk hali  = " + list1);

        //task list1in elemanlarını for loop ile yanyana

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i) + " ");

        }

        for (String w : list1) {
            System.out.println(w + " ");

        }

        System.out.println();
        System.out.println("***************");

        //task list1 in herbir elemani for loop ile isimlere SDET ekleryerek update ediniz

        for (int i = 0; i < list1.size(); i++) {
            String name = list1.get(i); //her elemanı getirir her dongude name isimli variablea atar
            list1.set(i     , name + " SDET");


        }

        System.out.println("**********");

        for (String w:list1) {
            w = w + "QA"; //The value w + "QA" assgined to 'w' is never used
           // System.out.println("list1 foreach loop içinde" + list1);


        }
        System.out.println("list1 in son hali" + list1);

        //list1 i  iteratore alıp update ediniz

        Iterator<String> list1Iterator =  list1.iterator(); //list den iterator metodu kullanılarak Iterator interfaceden list1Iterator
        // variable tanımlandı

        while (list1Iterator.hasNext()){
            System.out.println(" " + list1Iterator.next());
            //hasNext(); bir sonraki eleman var ise true return eder
            //next(); onunde olduğu elemanı getirir
        }

        System.out.println();
        System.out.println("list1Iterator in while sonrası hali = " + list1Iterator);
        // list1Iterator in while sonrası hali = java.util.ArrayList$Itr@1324409e


    }
}
