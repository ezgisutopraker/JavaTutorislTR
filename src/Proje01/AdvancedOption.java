package Proje01;

import java.util.Scanner;

public class AdvancedOption extends BasicOption {
    private int health=100;
    private boolean armour= false;

    public AdvancedOption(String isim) {
        setName(isim);
        Scanner input = new Scanner(System.in);
        System.out.println("hamlenizi seçin \n1. silah için 1 e \n2. silah için 2" +
                "\nzırh kullanmak için 3e \ncan yükseltmek için 4e bas");
        int secim = input.nextInt();


        switch (secim) {
            case 1:
                damageByGun1();
                break;

            case 2:
                damageByGun2();
                break;
            case 3:
                setArmour(true);
                break;
            case 4:
                heal();
                break;


        }

    }


    public AdvancedOption (){

    }

    @Override
    public void damageByGun1() {
        if (armour){
            health -=20;
        }else health -=30;

        deadOrNot();

    }

    @Override
    public void damageByGun2() {
        if (armour){
            health -=40;
        }else health -=50;

        deadOrNot();
    }

    public boolean isArmour() {
        return armour;
    }

    public void setArmour(boolean armour) {
        this.armour = armour;
    }

    //  @Override
  //  public void heal() {
   //     super.heal();

    }

