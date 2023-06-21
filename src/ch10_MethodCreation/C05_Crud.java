package ch10_MethodCreation;

import java.util.Scanner;

public class C05_Crud {//biz burada methodlar create edeceğiz
    // buradaki methodları Runner Class ve Switch Classtan çalıştıracağız
    //buradaki methodlar ihtiysç olduğunda istenen yerden class name ile call edilebilir
    // buradaki methodlar call edeceğinşz yerden main method olmalı


    static Scanner input= new Scanner(System.in); //class levelda tanımlandı
    static String staticUserName = ""; //kullanıcıdan alınan username i kayıt etmek için


    public static void createUser(){
        //methoda yazarsak her methoda tek tek yazmaj lazım
        //Scanner input= new Scanner(System.in);


        System.out.println("user name gir");

        String userName = input.nextLine(); //bu method için create edildi

        staticUserName = userName; //kullanıcının girdiği user name bizde static olan variable atandı
        //çünkü aşağıdaki methodlarda kullanıcı kontrolü yapılıp true ise işleme atanacak

        System.out.println("create edilen userName = " + userName);
        System.out.println(userName + " isimli kullanıcı sisteme kayıt oldu");


    }

    public static void getUser(){ //kullanıcı isim girmelibu isme göre bir kontrol yapılıp kullanıcıya true-false dönmeli

        System.out.println("sorgulamak istediğin user name");

        String userName = input.nextLine();

        if (userName.equals(staticUserName)){
            System.out.println(userName + " isimli kullanıcı sistemde mevcut");
        }else System.out.println(userName + " isimli kullanıcı sistemde mevcut değil");



    }

    public static void updateUser(){ //burada kullanıcı kendi ismini update edecek

        System.out.println("şuanki mevcut isminiz" + staticUserName);
        System.out.println("yeni isim gir");

        String yeniIsim = input.nextLine();

        staticUserName = yeniIsim;
        System.out.println("isim güncelleme başarılı");

        System.out.println("yeni isminiz" + staticUserName);

    }



    public static void deleteUser () {

        System.out.println("silmek istediğin ismi gir");

        String silinecekIsim = input.nextLine();

        if (silinecekIsim.equals(staticUserName)) { //kullanıcıdan alınan isim esit ise sistemde kayıtlı olan statis username e
            System.out.println(staticUserName + " isimli kullanıcı sistemden silindi");
            staticUserName = null;

            System.out.println("silinen isim" + silinecekIsim);

        } else System.out.println(silinecekIsim + " isimli kullanıcı sistemde  ");


    }

    public static void cikis() {
        System.out.println("çıkış yaptınız");

    }








}