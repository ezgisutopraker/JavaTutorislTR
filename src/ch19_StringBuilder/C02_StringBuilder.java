package ch19_StringBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        //1. boşbir sb objesi oluşturup append ile eklemek

        StringBuilder sb1 = new StringBuilder(); //default capacity 16 olan value olmayan boş sb

        System.out.println("sb1.length() = " + sb1.length()); //0
        System.out.println("sb1.capacity() = " + sb1.capacity()); //16
        //twice the old capacity, plus 2


        sb1.append("javAslan"); //boş olan sb objesine javAslan eklendi

        System.out.println("sb1 = " + sb1); //javAslan
        System.out.println("sb1.capacity() = " + sb1.capacity()); //16 (16x2+2=34)

        sb1.append(" selam ").append(" nasılsın ").append(" maaslara zam isi noldu ").append(63).append(" ").append(true);
        System.out.println("sb1 = " + sb1); //sb1 = javAslan selam  nasılsın  maaslara zam isi noldu 63 true
        System.out.println("sb1.capacity() = " + sb1.capacity()); //70 (34x2+2)


        //2. yol String builder create etme

        StringBuilder sb2 = new StringBuilder("Tommy Lee Jones");
        System.out.println("sb2.length() = " + sb2.length()); //15
        System.out.println("sb2.capacity() = " + sb2.capacity()); //31 (lenght + default capacity)
        //ilk value koyduğumuz için bundan sonra x2+2 oluyor
        //16 default bos sb objesi için

        //trimToSize() - length e dokunmaz capacityden fazlalıkları alır

        System.out.println("trimToSize()");
        System.out.println("sb2.length() = " + sb2.length()); //15
        sb2.trimToSize();
        System.out.println("sb2.capacity() = " + sb2.capacity()); //15
        System.out.println("sb2.length() = " + sb2.length()); //15

        StringBuilder sb3 = new StringBuilder(11);
        System.out.println("sb3.length() = " + sb3.length()); //0
        System.out.println("sb3.capacity() = " + sb3.capacity()); //11
        sb3.append("rumeysa hanım");
        System.out.println("sb3.capacity() = " + sb3.capacity()); //24


        //girilen indexteki karakteri getirmek

        System.out.println("sb3.charAt(4) = " + sb3.charAt(4)); //y

        //istenen index aralığındaki deper getirmek için charSequence

        System.out.println("sb1.subSequence(3,10) = " + sb1.subSequence(3, 10)); //Aslan s
        System.out.println("sb1.substring(3,10) = " + sb1.substring(3, 10)); //Aslan s

        //girilen iki int index arasini siler delete

        System.out.println("sb1.delete(3,10) = " + sb1.delete(3, 10)); //javelam  nasılsın  maaslara zam isi noldu 63 true

        //girilen int indexteki karakteri silen  deletecharAt

        System.out.println("sb1.deleteCharAt(6) = " + sb1.deleteCharAt(6)); //javela  nasılsın  maaslara zam isi noldu 63 true

        //istenen indexe istenen ifadeyi ekler
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.insert(4,\";)\") = " + sb3.insert(4, ";)")); //rume;)ysa hanım

        //belirli bir string builder şn istenen indexine verilen stringin istenen index aralığını ekleme
        System.out.println("sb3.insert(15,\"hello\",1,3) = " + sb3.insert(15, "hello", 1, 3)); // rume;)ysa hanımel

        //belirli indexteki karakteri değiştirme
        sb3.setCharAt(5,'S');
        System.out.println("sb3 = " + sb3); //rume;Sysa hanımel

        //istenen aralıktaki değeri siler ve yerine istenen Stringi ekler
        System.out.println("sb3.replace(7,9,\"meşgul\") = " + sb3.replace(7, 9, "meşgul")); //rume;Symeşgul hanımel

        StringBuilder tb2= new StringBuilder("AVATAR");
        tb2.subSequence(1,5);
        System.out.println("tb2 = " + tb2);
        tb2.reverse();
        System.out.println("tb2 = " + tb2);
        tb2.deleteCharAt(2);
        System.out.println("tb2 = " + tb2);

        StringBuilder tb1 = new StringBuilder(2 + "apple" + 3 + 8+ "banana");
        String isim = "Elly";
        tb1.append(isim,1,3);
        System.out.println("tb1 = " + tb1);
        tb1.delete(3,5);
        System.out.println("tb1 = " + tb1);




    }

}
