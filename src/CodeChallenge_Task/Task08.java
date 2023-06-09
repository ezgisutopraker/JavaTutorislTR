package CodeChallenge_Task;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("A, B veya C harflerinden birini seçiniz: ");
        String harf = scanner.next().toUpperCase();

        switch (harf) {
            case "A":
                System.out.println("Java is easy");
                break;
            case "B":
                System.out.println("Java is fun");
                break;
            case "C":
                System.out.println("I need to study :)");
                break;
            default:
                System.out.println("Geçersiz seçim");
                break;
    }
}}
