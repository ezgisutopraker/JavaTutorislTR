package ch02_DataTypes_WrapperClass;

public class task01 {

    public static void main(String[] args) {

        /* java escape special characters -> https://www.w3schools.com/java/java_strings_specchars.asp

	  \n (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
	          \t:  horizontal tab : metni yatayda 1 tab miktarı  kaydırır.
	          \\: prints a back slash :\ (ters slash) yazdırır
	          \': prints single quote :' tek tırnak yazdırır.
	          \": prints double quote :"" Çift tırnak yazdırır.
	 */

       //  Soru-1 :   konsola      "Hello ", "World  \ /"        seklinde yazdırınız

        System.out.println("\"" + "Hello"  +  "\""  +  ',' + "\"" + "World" + "\t" + "\\" +"\t"+ "/"+ "\"");


        // Soru-2 : Pazartesi kelimesini her harfini ayrı bir satira gelecek sekilde yazdırınız.

        System.out.println("P" + "\n"+ "A" + "\n" + "Z" + "\n"+ "A" + "\n"+ "R" + "\n"+ "T" + "\n"+ "E" + "\n"+ "S" + "\n"+ "İ" );

        //Soru-3 : "Java" ile hayat cok 'afilli'   yazdırınız

        System.out.println("\"" + "Java" + "\"" + " ile hayat çok " + "\'" + "afilli" + "\'");


        //Soru-4 : "Basari" gayreti 'sever'  yazdırınız sonraki "Clarusway ile java cok kolay ..." ifadesi  3 satır sonra ve satır basından 1 tab ileride yazılsın.

        System.out.println("\"" + "Başarı" + "\"" + " gayreti " + "\'" + "sever" + "\'" + "\n" + "\n"+ "\n" + "\t" + "\"" + " Clarusway ile java çok kolay ... " + "\"" );






    }

}
