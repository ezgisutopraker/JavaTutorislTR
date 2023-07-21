package ch16_DateTime;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class C13_OCA05 {
    public static void main(String[] args) {
        /*
         What is the output of the following code?
        Asagidaki code'un  ciktisi  nedir?
        */

        LocalDateTime d = LocalDateTime.of(2015, 5, 10, 11, 22, 33);

        Period p = Period.ofDays(1).ofYears(2); //çoklu period parametresinde sonuncusu kullanılır diğerlerini ezer
        d = d.minus(p);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
        System.out.println(d.format(f));

        /*
            A. 5/9/13 11:22
            B. 5/10/13, 11:22 AM ***********
            C. 5/9/14
            D. 5/10/14
            E. The code does not compile.
            F. A runtime exception is thrown.
                /**
     * Full text style, with the most detail.
     * For example, the format might be 'Tuesday, April 12, 1952 AD' or '3:30:42pm PST'.
     */
          //    FULL,
          //    /**
          //     * Long text style, with lots of detail.
          //     * For example, the format might be 'January 12, 1952'.
          //     */
          //    LONG,
          //    /**
          //     * Medium text style, with some detail.
          //     * For example, the format might be 'Jan 12, 1952'.
          //     */
          //    MEDIUM,
          //    /**
          //     * Short text style, typically numeric.
          //     * For example, the format might be '12.13.52' or '3:30pm'.
          //     */
          //    SHORT;


    }
}
