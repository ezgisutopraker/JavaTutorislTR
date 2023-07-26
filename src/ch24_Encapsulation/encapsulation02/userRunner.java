package ch24_Encapsulation.encapsulation02;

public class userRunner {
    public static void main(String[] args) {

        user user1 = new user("ezgi", "topraker", "12345ezgi" , 25);

        System.out.println("user1.getAd() = " + user1.getAd());
        System.out.println("user1.getSoyad() = " + user1.getSoyad());
        System.out.println("user1.getPassword() = " + user1.getPassword());
        System.out.println("user1.getYas() = " + user1.getYas());

        //BU ÇIKTIYI ALMAMIZI SAĞLAYAN toSTRING ÇÜNKÜ PARAMETREYİ YAZDIK


    }



}
