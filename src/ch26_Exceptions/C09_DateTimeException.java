package ch26_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C09_DateTimeException {
    public static void main(String[] args) {

      //RTE   LocalDate date = LocalDate.of(2023,4,33);


        //xception in thread "main" java.time.DateTimeException: Invalid value for DayOfMonth (valid values 1 - 28/31): 33

        LocalDate date = null;
        try {
            date = LocalDate.of(2023,4,33);
            System.out.println("try sorunsuz çalıştı");
        } catch (DateTimeException e) {
            System.out.println("catch block yakaladı exceptionı ay sayısı fazla girdin");
            System.out.println(e.getMessage());
        }

        System.out.println("sorun çözüldü devam et");
    }
}
