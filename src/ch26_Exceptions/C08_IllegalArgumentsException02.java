package ch26_Exceptions;

public class C08_IllegalArgumentsException02 {

    public static void main(String[] args) {

        try {
            System.out.println("try block başı");
            exceptionMethod();
            System.out.println("try catch sonu");
        } catch (IllegalArgumentException e) {
            System.out.println("catch block başı");
            System.out.println("e = " + e);
            System.out.println("e.getMessage() = " + e.getMessage());
          //  e.printStackTrace(); -->her kod bittiğinde hatayı yazar
            System.out.println("catch block sonu");
        }

        System.out.println("main sonu kodlar çalıştı");

    }


    public static void exceptionMethod(){
        throw new IllegalArgumentException("Illegal Argument Ezception hatası aldın");
    }
}
