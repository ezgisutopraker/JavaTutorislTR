package ch16_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class C08_Period {
    public static void main(String[] args) {
        //period iki tarih arasındaki zamanı tutar

        LocalDate bugun = LocalDate.now();

        LocalDate birthDay = LocalDate.of(1998,3,17);

        Period fark = Period.between(birthDay,bugun);
        System.out.println("fark = " + fark);

        System.out.println("bugun.compareTo(birthDay) = " + bugun.compareTo(birthDay)); //25

        // task -> 2 mayıs 2023te başlayan kurs 9 ay old göre bitiş tarihi

        LocalDate kursBaslayis = LocalDate.of(2023,5,2);

        System.out.println("kursBaslayis.plusMonths(9) = " + kursBaslayis.plusMonths(9));

        Period period = Period.ofMonths(9);

        System.out.println("kursBaslayis.plus(period) = " + kursBaslayis.plus(period));
    }
}
