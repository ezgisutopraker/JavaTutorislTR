package ch20_Constructor;

public class C04_TeacherRunner {
    public static void main(String[] args) {



    ////task pm li const kullanarak
    //// ogretmen objesi create ediniz tum field lari kullanma opsionel

    C04_Teacher teacher = new C04_Teacher("Ezgi", "Ozgen","matematik");

        System.out.println(teacher);

        C04_Teacher teacher1 = new C04_Teacher();



    C04_Teacher ogretmen = new C04_Teacher();

    ogretmen.ad= "zeynep";
    ogretmen.soyad= "Aytop";
    ogretmen.brans = "kimya";
    ogretmen.id = 123654;
    ogretmen.emekliMi= false;
    ogretmen.maas = 15000;
    ogretmen.tecrube= 15;
    ogretmen.yas=37;


        System.out.println("ogretmen= " + ogretmen);


        C04_Teacher ogretmenFullPmli = new C04_Teacher(1, "bayram",
                "aslan","fizik", 30,55,50000.5,false);







}}
