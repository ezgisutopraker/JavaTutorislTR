package ch23_AccessModifier.newpackage;

import ch23_AccessModifier.C01_AccessModifier;

public class C03_AccessModifier {

    private String privateName = "Meryem hanım";

    String defaultName = "zeynep hanım";
    public String publicName = "Ali bey";
    protected String protectedName = "hasan bey";

    public static void main(String[] args) {

        C01_AccessModifier obj1 = new C01_AccessModifier();
        System.out.println("obj1.publicYas = " + obj1.publicYas);

        //obj1.defaultYas =33;
        //obj1.protectedYas = 66;
        //'defaultYas' is not public in 'ch23_AccessModifier.C01_AccessModifier'.
        // Cannot be accessed from outside package


    }



}
