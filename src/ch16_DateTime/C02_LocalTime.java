package ch16_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        // saat dakika saniye milisaniye

        LocalTime suan = LocalTime.now();

        System.out.println("suan = " + suan);

        System.out.println("suan.getHour() = " + suan.getHour());

        LocalTime suan2 = LocalTime.of(13,55,55);
        System.out.println("suan2 = " + suan2);

        System.out.println("suan2.plusNanos(1245352) = " + suan2.plusNanos(124535253753537575L));
        //suan2.plusNanos(1245352) = 13:55:55.001245352

        //for loop ile hız testi

        System.out.println("hız testi");

        LocalTime forLoopBasi = LocalTime.now();
        System.out.println("forLoopBasi = " + forLoopBasi);

        int toplam = 0;
        for (int i = 0; i < 1000000; i++) {
            toplam+= i;

        }
        System.out.println("toplam = " + toplam);
        LocalTime forLoopSonu = LocalTime.now();

        System.out.println("forLoopSonu.getNano() = " + forLoopSonu.getNano());

        System.out.println("fark nano " + (forLoopSonu.getNano() - forLoopBasi.getNano()));
        System.out.println("fark minute " + (forLoopSonu.getMinute() - forLoopBasi.getMinute()));
        System.out.println("fark second " + (forLoopSonu.getSecond() - forLoopBasi.getSecond()));




    }
}
