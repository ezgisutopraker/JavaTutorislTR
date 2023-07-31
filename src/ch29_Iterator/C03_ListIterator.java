package ch29_Iterator;

import java.util.*;

public class C03_ListIterator {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("Zeynep ", "Ahmet", "Eren", "Iclal", "Safak", "Fatih", "Ali"));
        System.out.println("list1 in ilk hali  = " + list1);

        //yukarıdaki list o ListIteratore atama yaparak SDET ekleyerek kalıcı ediniz

        ListIterator<String> list1Iterator = list1.listIterator();

        while (list1Iterator.hasNext()) {

            String name = list1Iterator.next();
            list1Iterator.set(name + " SDET");


        }

        System.out.println("List son hali: " + list1);

        List<String> list2 = new ArrayList<>(Arrays.asList("offerlarınız geliyor"));
        System.out.println("list2 in ilk hali  = " + list2);

        //task yeni list create edinizlist
        //list i iteratore atayın
        //list 2yi add methodu ile list1 e ekleyin
        //her bir elemanı print edin



    }
}
