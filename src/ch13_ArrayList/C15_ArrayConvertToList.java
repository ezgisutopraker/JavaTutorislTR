package ch13_ArrayList;

import ch04_JavaOperators.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C15_ArrayConvertToList {
    public static void main(String[] args) {

        String [] names = {"Ali", "Zeynep" , "Fatih" , "Şafak" , "Derya"};

        System.out.println("Arrays.toString(names) = " + Arrays.toString(names));

        List<String> namesList = Arrays.asList(names);
        System.out.println("namesList = " + namesList);

        //     RTE System.out.println("namesList.add(\"Zafer\") = " + namesList.add("Zafer"));
        //Exception in thread "main" java.lang.UnsupportedOperationException

      //RTE  ArrayList<String> nameArrayList = (ArrayList<String>)Arrays.asList(names);
      //Exception in thread "main" java.lang.ClassCastException
      //  System.out.println("nameArrayList = " + nameArrayList);

        ArrayList<String> nameArrayList = new ArrayList<>(Arrays.asList(names));

        System.out.println("nameArrayList = " + nameArrayList); //nameArrayList = [Ali, Zeynep, Fatih, Şafak, Derya]

        Collections.sort(nameArrayList);
        System.out.println("nameArrayList = " + nameArrayList); //nameArrayList = [Ali, Zeynep, Fatih, Şafak, Derya]





    }
}
