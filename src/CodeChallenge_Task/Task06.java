package CodeChallenge_Task;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /* Task->
                gunleri gösterebilen bir program yazın
        gun Pazartesi veya Sali ise:
        Java dersi gunleri
​
        gun Persembe veya Cuma ise:
        Selenyum dersi gunleri
​
        gun carsamba veya cumartesi ise:
        SQL dersi gunleri
​
        aksi halde: izin gunu
        (if deyimini KULLANMAYIN)

*/

        Scanner input = new Scanner(System.in);

        System.out.println("gün giriniz");

        String gun = input.nextLine().toLowerCase();

        switch (gun){
            case"pazartesi":
            case "salı":
                System.out.println("Java dersi günleri");

                break;

            case"çarşamba":
            case "perşembe":
                System.out.println("Selenyum dersi günleri");

                break;

            case"cuma":
            case "cumartesi":
                System.out.println("SQL dersi günleri");

                break;

            default:
                System.out.println("İzin günü");
                break;

        }



    }
}
