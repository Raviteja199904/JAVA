package Java1.Java3.Java4;

 class Animal {
    void sound(){
        System.out.println("This animal makes a sound");
    }
    void sound(String animalType){
        System.out.println("This" + animalType + "makes a sound.");
    }
    void sound(int times){
        System.out.println("This animal makes a sound");
    }
    public class MethodOverloadingExample{
        public static void main(String[] args) {
            Animal animal = new Animal();
            animal.sound();
            animal.sound("Dog");
            animal.sound(3);
        }
    }
}
