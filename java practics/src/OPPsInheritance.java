// public class OPPsInheritance {
//     public static void main(String[] args) {
//         // Dog myDog = new Dog();
//         // myDog.eat();

//         // Animal animal = new Animal();
//         // animal.maau();

//         // Cat MyCat=new Cat();
//         // MyCat.bark();
        
//         // cow myCow = new cow();
//         // myCow.eat();

//                 Goat myCow = new Goat();
//                 myCow.eat();
//     }
// }

// class Animal {
//     void eat(){
//         System.out.println("Animal eat Food");
//     }
// }
// //Single Inheritance:
// class Dog extends Animal{
//     void bark(){
//         System.out.println("Dog is barking");
//     }
// }
// //Multilevel Inheritance:
// class Cat extends Dog{
//     void maau(){
//         System.out.println("Cat is Spaking");
//     }
// }
// //Hierarchical Inheritance:
// class cow extends Animal{
//     void eatgrass(){
//     }
// }

// class Goat extends Animal{
//     void eatgrass(){
//     }
// }


// it is Single inheritance--------------------------------------------------------------------------------------------------------
// class OPPsInheritance{
//     public static void main(String[] args) {
//         Dog obj = new Dog();
//         obj.eat();
        
//     }
// }

// class Animal{
//     public static void eat(){
//         System.out.println("Animal Eating Grass");
//     }
// }

// class Dog extends Animal{
//     public static void bark(){
//         System.out.println("I hava qulite of bark");
//     }
// }

// it is Multelevel inheritance -------------------------------------------------------------------------------------------------------------
// class MultelevelInheritance{
//     public static void main(String[] args) {

//         panda panda = new panda();
//         panda.forest();

//     }
// }

// class janvar{
//     public static void forest(){
//         System.out.println("Forest Mera Ghar hain");
//     }
// }

// class tree extends janvar {
//     public static void stay(){
//         System.out.println("Mai Pedo par rahata hu");
//     }
// }

// class panda extends tree{
//     public static void pd(){
//         System.out.println();
//     }
// }
 //Hierarchical Inheritance:----------------------------------------------------------------------------------

class  HierarchicalInheritance{
    public static void main(String[] args) {

        panda panda = new panda();
        panda.forest();

    }
}

class janvar{
    public static void forest(){
        System.out.println("Forest Mera Ghar hain");
    }
}

class tree extends janvar {
    public static void stay(){
        System.out.println("Mai Pedo par rahata hu");
    }
}

class panda extends janvar{
    public static void pd(){
        System.out.println();
    }
}