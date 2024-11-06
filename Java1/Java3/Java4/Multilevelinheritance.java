package Java1.Java3.Java4;

 class Animal  {
    void eat(){
        System.out.println("This animal can eat.");

    }
    
}

class Dog extends Animal {
    void bark(){
        System.out.println("The dog can bark");

    }
}

class   Puppy extends Dog{
    void weep(){
        System.out.println("The puppy can weep.");
    }
    void bark(){
        System.out.println("The puppy can bark.");
        super.bark();
    } 
}

public class Multilevelinheritance {
    public static void main(String[] args)
    {
        Puppy puppy = new Puppy();
        Dog dog=(Dog) puppy;
        dog.bark();
        puppy.eat();
        puppy.bark();
        puppy.weep();
    }
}