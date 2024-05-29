public class javaInheritance {
    public static void main(String[] args) {
        // Dog myDog = new Dog();
        // myDog.eat();

        // Animal animal = new Animal();
        // animal.maau();

        // Cat MyCat=new Cat();
        // MyCat.bark();
        
        // cow myCow = new cow();
        // myCow.eat();

                Goat myCow = new Goat();
                myCow.eat();
    }
}

class Animal {
    void eat(){
        System.out.println("Animal eat Food");
    }
}
//Single Inheritance:
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}
//Multilevel Inheritance:
class Cat extends Dog{
    void maau(){
        System.out.println("Cat is Spaking");
    }
}
//Hierarchical Inheritance:
class cow extends Animal{
    void eatgrass(){
    }
}

class Goat extends Animal{
    void eatgrass(){
    }
}

