package Java1;

import SortingProject.Person;

public class Main {
        public static void main(String[] args){
        Person john; //declare a variable name with datatype//
        john = new Person();
        john.name="John Smith";
        john.age=37;
        john.birthday();
        Person mary=new Person();
        mary.name="Mary Brown";
        mary.age=33;
        mary.birthday();
    }
    
}
