package ch07_StringManipulations;

public class C01_Concatination {
    public static void main(String[] args) {

        String  name = "Ezgi" ;
        String title = "SDET QA";
        int age = 25;

        System.out.println(name + title);

        System.out.println("name.concat(title) = " + name.concat(title));

        System.out.println("age = " + age);
        System.out.println(age);

        //String int e çevirme

        String number = "123456";

        System.out.println("number = " + number+1);

        System.out.println("Integer.parseInt(number+1) = " + Integer.parseInt(number + 1)+1);

        System.out.println("name.concat(true+\":)\") = " + name.concat(true + ":)"));



    }
}
