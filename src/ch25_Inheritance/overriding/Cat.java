package ch25_Inheritance.overriding;

public class Cat extends Pet { //cat class ı Pet classın childıdır

    public Cat(){
        super();

        System.out.println("kediler psikolojiye iyi geliyor");
    }

    public void mirmir(){
        System.out.println("kediler mırmırla sizin moralinizi düzeltir");
    }
    public Cat (String str){
        this();
        System.out.println(super.number); //34
        System.out.println(this.number); //22
        System.out.println(" pmli constdan " +
                "kediler psikolojiye iyi geliyor");
    }
    @Override
    public void icme() {
        System.out.println("override edilmiş cat e göre içme methodu");
    }
    int number = 22;
    int age = 11;
    int numberofCat = 50;

    @Override
    public String toString() {
        return "Cat{" +
                "number=" + number +
                ", age=" + age +
                ", numberofCat=" + numberofCat +
                super.toString()+
                '}';
    }
}
