package Java1.Java3.Java4;

 class Animal {
void eat(){
    System.out.println("This animal can eat");
}

 }
 class Dog extends Animal{
    void bark(){
        System.out.println("The dog can bark");

    }
}


public class SingleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        
    }
}