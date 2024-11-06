package Java1.Java3.Java4;

 class Animal {
    void sound(){
        System.out.println("This animal makes a sound.");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("The dog barks.");
    }
}
class Cat extends Animal {
    void sound(){
        System.out.println("The cat meoews.");
    }
}
public class PolymorphismExample{
    public static void main(String[] args) {
        Animal myAnimal=new Dog();
        myAnimal.sound();
        myAnimal=new Cat();
        myAnimal.sound();
    }
}