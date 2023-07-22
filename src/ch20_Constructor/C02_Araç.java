package ch20_Constructor;

public class C02_Araç {

    //fields

    String marka;
    String model;
    int km ;
    double motorHacmi;
    boolean vitesAuto;
    boolean ikinciEl;
    int yil;
    String tramer;

    public static <C02_Arac> void main(String[] args) {
        C02_Araç arac1 = new C02_Araç(); // pm siz constructor kullanılarak arac1 objesi create edildi

        arac1.ikinciEl = true;
        arac1.marka = "mercedes";
        arac1.km = 50000;
        arac1.model = "CLA";
        arac1.motorHacmi = 2.0;
        arac1.tramer = "5 kaza var";
        arac1.yil= 2022;

        System.out.println("arac1 = " + arac1); //arac1 = ch20_Constructor.C02_Araç@26ba2a48

        System.out.println(arac1.marka + " " + arac1.tramer + " " + arac1.ikinciEl + " " + arac1.km + " " + arac1.model + " " + arac1.motorHacmi
        + " " + arac1.yil);   //mercedes 5 kaza var true 50000 CLA 2.0 2022


        //TASK 2. bir aracın tum fieldlarını


        C02_Araç arac2 = new C02_Araç();
        arac2.ikinciEl=true;
        arac2.marka="nissan";
        arac2.km=165000;
        arac2.model="micra";
        arac2.motorHacmi=1.2;
        arac2.tramer="3 kaza var";
        arac2.yil=2004;
        System.out.println("arac2 = " + arac2);
        //arac2 = C02_Araç{marka='nissan', model='micra', km=165000, motorHacmi=1.2, vitesAuto=false, ikinciEl=true, yil=2004, tramer='3 kaza var'}





    }

    // SAĞ CLİCK GENERATE-TO STRING SEÇ HEPSİYLE UĞRAŞMADAN GELİYOR
    @Override
    public String toString() {
        return "C02_Araç{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", km=" + km +
                ", motorHacmi=" + motorHacmi +
                ", vitesAuto=" + vitesAuto +
                ", ikinciEl=" + ikinciEl +
                ", yil=" + yil +
                ", tramer='" + tramer + '\'' +
                '}';
    }
}
