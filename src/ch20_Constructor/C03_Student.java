package ch20_Constructor;

public class C03_Student { //POJO class, plain old java objct (reelde entity class)
                           // main method olmayan obj create etmek için tasarlanmış class
    // objler için depo kalıphane, sablon, fabrika,

    //fields-> inst variables

    String name ;
    String lastName ;
    int classNo;
    double degree ;

    int schoolNo ;
    boolean success ;

    public void graduate (){ //mezun olup olmadığını olcen method

        if (degree >= 60 ){
            System.out.println("you are graduated");
        }else System.out.println("we are waiting you next year");



    }


    public void socialActivity (){
        System.out.println("you should join activities");
    }


    @Override
    public String toString() {
        return "C03_Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", classNo=" + classNo +
                ", degree=" + degree +
                ", schoolNo=" + schoolNo +
                ", success=" + success +
                '}';
    }
}
