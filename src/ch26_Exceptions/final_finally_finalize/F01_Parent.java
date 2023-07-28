package ch26_Exceptions.final_finally_finalize;

import javax.crypto.spec.PSource;

public class F01_Parent {

    public void testMethod (){
        System.out.println("guven kontrole mani değildir");

    }

    /**
     * Final method cannot be overriden
     */

    public final void finalMethod() {
        System.out.println("final method dan gelirlerse");

    }

}
