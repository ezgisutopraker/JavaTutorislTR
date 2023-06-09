package ch02_DataTypes_WrapperClass;

public class C04_WrapperClass {

    public static void main(String[] args) {

        String name = "Ezgi Hanım";
        int age = 25;

        Integer age2= 35;

        String number = "12345";

        String tc = "123456789";
        String id = "12345";

        System.out.println(tc+id); //12345678912345

        System.out.println(Integer.valueOf(tc));

        System.out.println(Integer.valueOf(id));

        int yeniTC = Integer.valueOf(tc);
        int yeniID = Integer.valueOf(id);

        System.out.println(yeniID + yeniTC);


        int idyeni= Integer.parseInt(id);
        int tcyeni= Integer.parseInt(tc);

        System.out.println( idyeni + tcyeni);

        String okulno= "12345";

        int okulnoyeni = Integer.valueOf(okulno);

        System.out.println(Integer.valueOf(okulnoyeni));

        byte maxDegerByte = Byte.MAX_VALUE;
        byte minDegerByte = Byte.MIN_VALUE;

        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);

        short maxDegerShort = Short.MAX_VALUE;
        short minDegerShort = Short.MIN_VALUE;

        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);

        int maxDegerint = Integer.MAX_VALUE;
        int minDegerint = Integer.MIN_VALUE;

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);


    }




}
