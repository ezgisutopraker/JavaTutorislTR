package ch25_Inheritance.overriding;

public class Pet extends Animal {
    public Pet(){
        System.out.println("pet den selamlar petshop her türlü hayvanınıza bakım yapar");
    }

    public void beslenme(){
        System.out.println("mama ile besleyin kuru ekmek vermeyin");
    }

    public void uyuma(){
        System.out.println("uygun ortamlarda uyutun");
    }

    /**hareket()' in 'ch25_Inheritance.overriding.Pet'
     * clashes with 'hareket()' in 'ch25_Inheritance.overriding.Animal';
     * attempting to assign weaker access privileges ('protected'); was 'public

   */
  // @Override
  // protected void hareket() {
  //     super.hareket();
  // }


    @Override
    public void icme() { //parent classta access modifier protected
        //child da access mod. levet yükseltildi

        System.out.println("overriding içme methodu Pet classdan");
    }

    private void privateMethod(){
        //miras alınamaz
        System.out.println("pet classın private methodu");
    }
    int number = 104;
    int age = 101;
    int numberofPets = 201;

    @Override
    public String toString() {
        return "Pet{" +
                "number=" + number +
                ", age=" + age +
                ", numberofPets=" + numberofPets +
                '}';
    }
}
