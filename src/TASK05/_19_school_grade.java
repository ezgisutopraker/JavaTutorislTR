package TASK06;

public class _19_school_grade {

    public static void main(String[] args) {

        /*  Bir öğrencinin notunu belirleyen bir Java programı yazın.
    Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:

        Eğer ortalama not >=90% =>not=A
        Eğer ortalama not >= 70% ve<90% => not=B
        Eğer ortalama not >=50% ve <70% =>not=C
        Eğer ortalama not <50% =>note=F

        Aşağıdaki örnek çıktıya bakın:
        int Quiz_score: 80
        int mid_term_score: 68
        int Final_score: 90
        print (Your grade is B)
                  (Notunuz B'dir) */


        // Code start here DO NOT CHANGE THE CODE BEFORE THIS LINE

        int Quiz = 80;
        int midterm = 68;
        int Final = 90;

        int ortalama = ( Quiz + midterm + Final ) / 3 ;

        if (ortalama >= 90 && ortalama <= 100) {

            System.out.println("not = A");

        }else if(ortalama >= 70 && ortalama < 90) {

            System.out.println("not = B");

        }else if (ortalama >= 50 && ortalama < 70) {

            System.out.println("not = C");

        } else if (ortalama <= 50) {

            System.out.println("not = F");

        }else System.out.println("geçersiz not girdiniz");




    }
}
