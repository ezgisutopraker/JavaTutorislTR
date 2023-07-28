package ch27_Abstraction.abstract01;

public abstract class Lastik extends Honda {

    //honda classındaki methodlar override edilmek zorunda kalınmadı
    //ınterface ve abstract classlar birbirlerini override etmek zrounda değiller

    public abstract void lastikEbat (); //abs method

    public void kisLastik(){
        System.out.println("nisandan sonra kullanılmaz");
    }
}
