package ch24_Encapsulation.encapsulation04;

import javax.xml.crypto.dom.DOMCryptoContext;
import java.util.Scanner;

public class BMI {
    /* Task ->
1. step -> Bmı class fields -> name, age, weight,height: encapsulated
2. step -> getBMI() method -> bmi = weight/(height*height) return type olmalı
3. step -> getStatus() method -> bmi 18.5 ten kucukse zayif,
  25 ten kucukse normal,
  30 dan kucukse kilolu,
  30 ustu obez return type
4. step -> getter setter  constructor toString methodlari create ediniz
5. step -> runner class obj ile dataları print eden code create ediniz
 */
    private String name ;
    private int age;
    private double weight;
    private double height;

    public double getBMI(){ // bmi = weight/(height*height) return type olmalı
        double bmi =  weight/(height*height);
        return bmi;

    }

    public String getStatus (){
        if (getBMI() < 18.5){
            return "zayıfsın kilo al";
        }else if(getBMI()<25){
            return "normal böyle devam et";
        }else if (getBMI()<30){
            return "kilolusun tehlikedesin diyete başla";
        }else return "obezsin acil önlem al";
    }

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public BMI() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "BMI{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}//class sonu

class Runner{

    public static void main(String[] args) {

        BMI obj1= new BMI("Adali", 35,88.5,1.90);
        System.out.println("obj1 = " + obj1);
        System.out.println("BMI test sonucunuz : \nisim " + obj1.getName() + "\ndurumunuz "
        + obj1.getStatus() + "\nvucut kutle indexiniz " + obj1.getBMI());

        //TASK BMI class daki 4 field i kullanicidan alarak full pm li const. kullanarak obje olusturun ve print edin

        Scanner input = new Scanner(System.in);
        System.out.println("ismini gir");
        String name = input.nextLine();

        System.out.println("yaşını gir");
        int age = input.nextInt();

        System.out.println("kilonu gir");
        double weight = input.nextDouble();

        System.out.println("boyunu gir");
        double height = input.nextDouble();

        BMI obj2 = new BMI(name,age,weight,height);
        System.out.println("obj2.getName() = " + obj2.getName());
        System.out.println("obj2.getBMI() = " + obj2.getBMI());
        System.out.println("obj2.getStatus() = " + obj2.getStatus());


    }






}
