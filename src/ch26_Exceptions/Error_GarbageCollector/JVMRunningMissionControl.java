package ch26_Exceptions.Error_GarbageCollector;

import java.util.Date;

public class JVMRunningMissionControl {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();

        System.out.println("foor loop öncesi rt.totalMemory() = " + rt.totalMemory());
        System.out.println("foor loop öncesi rt.freeMemory() = " + rt.freeMemory());

        Date d = null;

        for (int i = 0; i < 100000; i++) {
            d = new Date();
            d = null;
        }System.out.println("foor loop sonrası rt.totalMemory() = " + rt.totalMemory());
        System.out.println("foor loop öncesi rt.freeMemory() = " + rt.freeMemory());
        rt.gc();
        System.gc();

    }
}
