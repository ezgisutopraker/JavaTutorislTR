package ch05_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        //TASK -> girilen bir ifadenin ilk karakterinin harf  olup olmadığını  kontrol eden code create ediniz..


        Scanner input = new Scanner(System.in);
        System.out.println("bir ifade gir");

        char ilkKarakter = input.next().charAt(0);

        //char değeri matematiksel ve karşılaştırmalı işlemlerde ASCII değerine göre işlem yapar.

        //bu ne demek -->
        if (ilkKarakter >= 'A'  && ilkKarakter <=  'Z'  || ilkKarakter >= 'a' && ilkKarakter <= 'z') {

            System.out.println("girdiğin ifadenin ilk karakteri harftir" + ilkKarakter);

        }else System.out.println("girdiğin ifadenin ilk karakteri harf değildir" + ilkKarakter);
        }












    }

