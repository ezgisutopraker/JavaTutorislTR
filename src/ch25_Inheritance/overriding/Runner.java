package ch25_Inheritance.overriding;

import ch25_Inheritance.inheritance.Cat;

public class Runner {
    /*
 1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
 2)Parent Class'a "super class"   Child Class'a "sub class"  denir.
 3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
 4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları içim kullanılır.
 5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
 6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
 7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
   denir.
 8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
 9)"Object Class" ->  butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/
    public static void main(String[] args) {

        //Cat cat1 = new Cat("cat");
         Cat cat2 = new Cat();

        //System.out.println("cat1 = " + cat1);
        //cat2.number
        //cat2.numberofAnimals
        //cat2.numberofPets

        Pet pet1 = new Pet();
        System.out.println("pet1.number = " + pet1.number);
        System.out.println("pet1.numberofAnimals = " + pet1.numberofAnimals);

        System.out.println("*****");

        pet1.icme(); //pet
        pet1.beslenme(); //pet
        pet1.hareket(); //Animal classtan
        pet1.yeme(); //Animaldan




    }
}
