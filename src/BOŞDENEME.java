public class BOŞDENEME {
    public static void main(String[] args) {
        methodA(25);
         methodA(12.5);
         methodB(12,25);
         //methodB(12,12.5);




    }

    private static void methodA(double v) {
        System.out.println("merhod a");
    }

    private static void methodB(int i, int i1) {
        System.out.println("method b");
    }



}

class DENEM2{

    public static void main(String[] args) {
        int num = 15;
        System.out.println(isAvaliable(num));

        char[]character = {'a','b','c'};
       // for (char each: 'b') {

        int [] arr ;
        arr = new int[]{10,20};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");

        }

        }


    private static boolean isAvaliable(int num) {
        return (num %2 == 0) ? true :false;
    }



}
