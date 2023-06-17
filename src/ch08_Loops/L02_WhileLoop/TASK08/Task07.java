package ch08_Loops.L02_WhileLoop.TASK08;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // task-> girilen  5 sayının  en büyüğünü print den code create eediniz


                Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int number1  = scanner.nextInt();


                int count = 0;

                while (count < 4) {
                    System.out.print("Bir sayı girin: ");
                    int number = scanner.nextInt();

                    if (number > number1) {
                        number1 = number;
                    }

                    count++;
                }

                System.out.println("En büyük sayı: " + number1);
            }
        }











