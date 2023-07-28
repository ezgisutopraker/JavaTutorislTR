package Proje01;

import java.util.Scanner;

public class AnaMenu extends AdvancedOption {
    static int secim2;
    static Scanner input = new Scanner(System.in);

    public AnaMenu() {
        System.out.println("basic için 1 e \nadvanced için 2 ye bas");
        secim2 = input.nextInt();

        System.out.println("1. oyuncu ismini gir");

        if (secim2 == 1) {
            BasicOption player1 = new BasicOption(input.nextLine());
        } else if (secim2 == 2) {
            AdvancedOption player1 = new AdvancedOption(input.nextLine());
        }
        System.out.println("basic için 1 e \nadvanced için 2 ye bas");
        secim2 = input.nextInt();
        System.out.println("2. oyuncu ismini gir");
        if (secim2 == 1) {
            BasicOption player2 = new BasicOption(input.nextLine());
        } else if (secim2 == 2) {
            AdvancedOption player2 = new AdvancedOption(input.nextLine());
        }}




}

