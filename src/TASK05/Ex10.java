package TASK06;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
     //  x = str(input("taş,kağıt,makas")).lower()
     //  y = str(input("taş,kağıt,makas")).lower()

     //  if x == y :
     //  print("berabere")
     //  else if x == "taş" and y== "kağıt":
     //  print("kazanan:y")
     //  else if x == "kağıt" and y == "taş":
     //  print("kazanan: x")
     //  else if x == "makas" and y=="kağıt":
     //  print("kazanan: x")
     //  else if y == "makas" and x== "kağıt":
     //  print("kazanan: y")
     //  else if y== "makas" and x=="taş":
     //  print("kazanan: x")
     //   else
     //  print("sizden istenen ifadelerden birini giriniz")


        Scanner input = new Scanner(System.in);

        System.out.println("ilk ifadeyi gir");

        String x = input.nextLine().toLowerCase();

        System.out.println("ikinci ifadeyi gir");

        String y = input.nextLine().toLowerCase();

        if (x == y) {

            System.out.println("berabere");

        }else if (x == "makas" && y == "kağıt") {

            System.out.println("kazanan = x");

        } else if (x == "makas" && y == "taş") {

            System.out.println("kazanan =y ");

        }else System.out.println("sizden istenen ifadelerden birini giriniz");


    }
}
