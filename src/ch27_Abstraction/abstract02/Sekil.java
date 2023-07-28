package ch27_Abstraction.abstract02;

public abstract class Sekil {
    private String name ;

    public Sekil() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alanHesapla ();
    public abstract double cevreHesapla ();

    public String ciz(){
        return name + "isimli şekliniz çiziliyor";
    }

    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                "\n şekil cevresi : " + this.cevreHesapla()+
                "\n şekil alanı : " + this.alanHesapla()+
                 "\n çizilecek şekil :" + this.ciz()+

                '}';
    }
}
