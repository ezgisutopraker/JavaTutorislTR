package ch20_Constructor;

public class C04_Teacher {

    //fields

    int id ;
    String ad ;
    String soyad;
    String brans ;
    int tecrube ;
    int yas;
    double maas;
    boolean emekliMi;

    //POJO class create ettiğinizde fieldları yazdıktan sonra
    // mutlaka yapılması gerekenler

    //1 toString methodu
    //2 pmli ve pmsiz constructorlar
    //3





    //b SAĞ CLICK GENERATE- CONSTRUCTOR İSTEDİKLERİNİ SEÇ
    public C04_Teacher(String ad, String soyad, String brans) {
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;

    }

    public C04_Teacher() { //SELECT NONE
    }

    public void dersSaati(){
        System.out.println("haftada 15 saat sonrası extra olur");
    }

    public C04_Teacher(int id, String ad, String soyad,
                       String brans, int tecrube, int yas,
                       double maas, boolean emekliMi) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.brans = brans;
        this.tecrube = tecrube;
        this.yas = yas;
        this.maas = maas;
        this.emekliMi = emekliMi;
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", brans='" + brans + '\'' +
                ", tecrube=" + tecrube +
                ", yas=" + yas +
                ", maas=" + maas +
                ", emekliMi=" + emekliMi +
                '}';
    }
}
