package ch27_Abstraction.abstract_polymorphism02;

public abstract class ScrumTeam { //POJO CLASS
    public String name;
    public String jobTitle;
    public double salary;

    public abstract void dailyStadUp();

    public abstract void demo();

    public void getEmployeeInfo(){
        System.out.println("*************");
        System.out.println("employee name : " + this.name+ "\n Job title : "+
                this.jobTitle + "\n Salary : " + this.salary);

        System.out.println("*************");
    }
}

class Testers extends ScrumTeam{

    public Testers(String name, String jobTitle , double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public void dailyStadUp() {
        System.out.println("tester " + name + "is working");

    }

    @Override
    public void demo() {
        System.out.println("tester " + name + "is doing demo");

    }
}

class Developers extends ScrumTeam{

    public Developers(String name, String jobTitle , double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public void dailyStadUp() {
        System.out.println("developer " + name + "is working");

    }

    @Override
    public void demo() {
        System.out.println("developer " + name + "is doing demo");

    }
}

class BOA {
    public static void main(String[] args) {
        Testers tester1 = new Testers("Ahmet Bey" , "Tester" , 5000);
        Testers tester2 = new Testers("İclal Hanım" , "Tester" , 8000);
        Testers tester3 = new Testers("Sefa Bey" , "Tester" , 6000);

        ScrumTeam[] testersArr = {tester1,tester2,tester3};

        for (ScrumTeam tester: testersArr) {
            tester.getEmployeeInfo();

        }

        Developers developer1 = new Developers("Burak Bey" , "Tester" , 10000);
        Developers developer2 = new Developers("Ezgi Hanım" , "Tester" , 6000);
        Developers developer3 = new Developers("Ahmet Bey" , "Tester" , 12000);

        ScrumTeam[] developersArr = {developer1,developer2,developer3};


        for (ScrumTeam developer: developersArr) {
            developer.getEmployeeInfo();

        }



    }
}
