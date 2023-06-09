package CodeChallenge_Task;

import java.util.Scanner;

public class Task10 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Final notunu giriniz: ");

            String grade = scanner.next().toUpperCase();

            String result = (grade.equals("A")) ? "Gayet Başarılı" : (grade.equals("B")) ? "Başarılı" :
                    (grade.equals("C")) ? "Ha gayret" : "Diğerleri";

            System.out.println(result);
        }
    }


