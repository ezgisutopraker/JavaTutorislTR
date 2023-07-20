package ch15_Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        /*
array ve varargs method:
 */
//task1 verilen bir array deki elemanlari toplayan method create ediniz
        int [] arr ={ 1,2,-3,4,-5,-6 } ;

        toplama(arr);

        Varargstopla(arr);

        Varargstopla(22,55,66,33,99,88,77,44,555);

        System.out.println("Varargstopla(22,55,66,33,99,88,77,44,555) = " + Varargstopla(22, 55, 66, 33, 99, 88, 77, 44, 555));


    }

    private static int Varargstopla(int... var) {
        int toplam = 0;

        for (int w:var) {

            toplam += w;


        }
        System.out.println("toplam = " + toplam);
        return toplam;
    }

    private static void toplama(int[]arr) {

        int toplam = 0;

        for (int w:arr) {

            toplam += w;


        }
        System.out.println("toplam = " + toplam);
    }
}
