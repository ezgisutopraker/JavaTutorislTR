package ch10_MethodCreation;

import java.util.Scanner;

import static ch10_MethodCreation.C05_Crud.createUser;

public class C05_SwitchCaseMethods { //CRUD Classtaki buradan switch ize edeceğiz...

    //karsilama methodu yazalım

    public static void menu(){
        System.out.println("sistemimize hoşgeldin");
        System.out.println("uygulamaya kaydolmak için 1 \nkullanıcı sorgulamak için 2 \n" +
                "kullanıcı bilgi güncelleme için 3 \nkullanıcı silme için 4 \nçıkış işlemler için 5 ");

        Scanner in = new Scanner(System.in);
        int secim = in.nextInt();

        switch (secim){
            case 1 :
                createUser();
                menu();
                break;
            case 2:
                C05_Crud.getUser();
                menu();
                break;
            case 3:
                C05_Crud.updateUser();
                menu();
                break;
            case 4:
                C05_Crud.deleteUser();
                menu();
                break;
            case 5:
                C05_Crud.cikis();
                menu();
                break;



            default:
                System.out.println("hatali bir seçim");
                menu();
                break;
        }

    }

}
