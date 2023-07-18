package ch12_Arrays;

public class C07_MdArrays {
    public static void main(String[] args) {

        //task -> mdArr tüm elemanlarını toplayan code create

        int [][] aprMD = {
                {       1, //0.daire
                        2, //1.daire
                        3}, //2.daire
                //0.kat
                {       10, //0.daire
                        23} , //1.daire
                //1.kat

                {103}     //0.daire
                //2.kat
        };

        int toplam = 0;





        for (int kat = 0; kat < aprMD.length; kat++) { //outer loop apr length 3
            for (int daire = 0; daire < aprMD[kat].length ; daire++) {

                toplam+= aprMD[kat][daire]; //her bir dairedeki her bir kata ulaşır toplar


            }
        }
        System.out.println("toplam = " + toplam);




    }
}
