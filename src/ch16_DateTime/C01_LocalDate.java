package ch16_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {


        //Local date - > sadece yil ay gun tutar

        LocalDate bugun = LocalDate.now();

        System.out.println("bugun = " + bugun);

        System.out.println("bugun.isLeapYear() = " + bugun.isLeapYear());

        System.out.println("bugun.getYear() = " + bugun.getYear());

        System.out.println("bugun.getEra() = " + bugun.getEra());
        //CE = COMMON ERA (MİLATTAN SONRA)

        System.out.println("bugun.getDayOfYear() = " + bugun.getDayOfYear());

        LocalDate date1 = LocalDate.of(1990, 8,23);
        LocalDate date2 = LocalDate.of(1996,5,14);
        LocalDate date3 = LocalDate.of(1998, Month.MARCH,17);

        System.out.println("date1 = " + date1);

        System.out.println("date1.plus(300) = " + date1.plusDays(300));

        System.out.println("date2.minus(3) = " + date2.minusMonths(3));

        System.out.println("date2.minusMonths(3).plusMonths(2).plus(25).minusWeeks(3) = "
                + date2.minusMonths(3).plusMonths(2).plusDays(25).minusWeeks(3));

        System.out.println("date2 = " + date2); //IMMUTABLE OLDUĞUNDAN EKLE ÇIKAR OLSA DA GENE İLK DATE2 DEĞERİ OLUR YAN 14 MAYIS 1996

        date2 = date2.plusYears(100);

        System.out.println("date2 = " + date2);


    }
}