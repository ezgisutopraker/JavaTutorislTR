package task26.task07;


import java.util.ArrayList;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("adınızı giriniz");
        String ad = input.nextLine();
        System.out.println("şifrenizi giriniz");
        String sifre = input.nextLine();
        try {
            if (sifre.length() < 6) {
                throw new ArithmeticException("password 6 karakterden küçük olamaz");
            } else System.out.println("dağru sayıda karakter girişi");
        }catch (ArithmeticException e){
            System.out.println("e.getMessage() = " + e.getMessage());
            System.out.println("catch block çalıştı");
        }

        User user = new User();
        user.setId(122434);
        user.setName(ad);
        user.setActive(true);
        user.setSignedIn(true);
        list.add(ad);
        list.add(sifre);

        System.out.println("user.getName() = " + user.getName());
        System.out.println("user.getPassword() = " + user.getPassword());
        System.out.println("user.getId() = " + user.getId());
        System.out.println("user.isActive() = " + user.isActive());
        System.out.println("user.isSignedIn() = " + user.isSignedIn());

        System.out.println("list = " + list);
        System.out.println("user = " + user);


    }

}
