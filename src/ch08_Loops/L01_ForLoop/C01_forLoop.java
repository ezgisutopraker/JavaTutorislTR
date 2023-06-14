package ch08_Loops.L01_ForLoop;

public class C01_forLoop {
    public static void main(String[] args) {
        //task 33 defa java iyidir yazın


        for (int i = 0; i < 33; i++) {
            System.out.println("java iyidir");
            
        }


        //task 2 basamaklı tek sayıları yanyana print eden code

        for (int i = 11; i <=99 ; i+=2) {

            System.out.print(i+" ");
        }


        System.out.println("************");
        
        int j ;
        for (j= 10; j < 100; j++) {

            if (j%2==1){

                System.out.print(j + " ");
            }
        }


        for (int i = 1; i > 10 ; i++) { //çalışmayan loop
            System.out.println("çslışmayan loop");

        }


        // for (int i = 0; i >= 0; i++) { SONSUZ LOOP

        }



        
        
        
        
        
        
        
        
    }   
