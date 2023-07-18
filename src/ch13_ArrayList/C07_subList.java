package ch13_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C07_subList {
    public static void main(String[] args) {
        // sublist() -> listenen istenen list parçasını return eder

        ArrayList<String> country = new ArrayList<>(List.of("AMERİKA" ,"RUSYA" , "TÜRKİYE" , "MADAGASKAR"));
        System.out.println("country = " + country);

        System.out.println("country.subList(2,4) = " + country.subList(2, 4)); //country.subList(2,4) = [TÜRKİYE, MADAGASKAR]

        //yeni list oluşturup eski listten eleman çekme

        ArrayList<String> yeniList = new ArrayList<>(country.subList(1, 4));

        System.out.println("yeniList = " + yeniList); //yeniList = [RUSYA, TÜRKİYE, MADAGASKAR]
    }
}
