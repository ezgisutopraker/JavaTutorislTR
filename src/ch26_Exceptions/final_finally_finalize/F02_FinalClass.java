package ch26_Exceptions.final_finally_finalize;

public final class F02_FinalClass extends F01_Parent {
    //final class parent olamaz ama child olabilir

    /**
     * Final class cannot be overriden
     */

    public static void finalClassMethod () {
        System.out.println("final clasdan");
    }
}

