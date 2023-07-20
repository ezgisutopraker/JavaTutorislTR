package ch14_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_forEachLoop {
    public static void main(String[] args) {
        /*
for-each loop for loop'un gelilmş halıdir.
1. clean code- yazım kolaylığı
2. code okuma kolaylıgı
3. hata yapma riskini azaltır.
 */

        List <Integer> sayiList = new ArrayList<>(List.of(1,2,55,65,33,35,34,72));

        System.out.println("**** task01 ****");

        // task list elemanlarını ayrı satırlara print ediniz.

        for (Integer i:
             sayiList) {
            System.out.println(i);

        }


        System.out.println("**** task02 ****");
        //task list elemanlarının ilk 3 eleman hariç tek olanları print

        for (Integer w:
             sayiList.subList(3,sayiList.size())) {

            if(w % 2 == 1){
                System.out.println("w = " + w);
            }

        }

        System.out.println("**** task03 ****");
        
        //task list elemanlarının 2 ile 5 dahil indexler arasındaki (2,3,4,5) elemanlarının toplamını

        int toplam = 0;

        for (Integer a:
             sayiList.subList(2,6)) {
            toplam += a;


        }
        System.out.println("toplam = " + toplam);


    }

    }

