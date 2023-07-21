package ch16_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        //Tarih ve zaman bilgilerini tutar

        LocalDateTime ldt = LocalDateTime.now();

        System.out.println("ldt = " + ldt);

        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        LocalDateTime dt = LocalDateTime.of(date,time);
        System.out.println("dt = " + dt);

        System.out.println("dt.plusYears(3) = " + dt.plusYears(3));

    }
}
