package Proje01;

import java.util.Scanner;

public class BasicOption {
    private String name;
    private String weapon;
    private int health = 100;


    public BasicOption() {

    }

    public BasicOption(String name) {
        this.name = name;
        Scanner input = new Scanner(System.in);
        System.out.println("hamlenizi seçin \n1. silah için 1 e \n2. silah için 2 " +
                "\ncan yükseltmek için 3e bas");

        int secim = input.nextInt();


        switch (secim) {
            case 1:
                damageByGun1();
                break;

            case 2:
                damageByGun2();
                break;

            case 3:
                heal(); //super.heal yapmadık çünkü advanced classında override edilmiş heal method yok
                break;


        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }


    public void damageByGun1() {
        health -= 30;
        deadOrNot();

    }

    public void damageByGun2() {
        health -= 50;
        deadOrNot();

    }

    public void deadOrNot() {
        if (health <= 0) {
            health = 0;
            System.out.println(name + " is dead.");
        }
    }

    public void heal() {
        if (health <= 0) {
            System.out.println("Player is dead. Heal not possible");

        } else health = 100;
        System.out.println("health is" + health);
        //this.health yazılmasına gerek yok, tüm classın içinde başka health adında
        //girdi yok
    }

    @Override
    public String toString() {
        return "Player1{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", health=" + health +
                '}';
    }
}
