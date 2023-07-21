package ch16_DateTime;

import java.time.LocalDate;
import java.time.ZoneId;

public class C05_ZonedDateTime {
    public static void main(String[] args) {
        // herhangi bir ulke- sehir için tarih zaman tutar

        LocalDate tarihZone = LocalDate.now(ZoneId.of("Australia/Darwin"));
        System.out.println("tarihZone = " + tarihZone);
    }
}
