/*package Java1.Java2;
public class Child extends Parent{
    public static void main(String[] args){
   
     public int initialvalue=Parent.val;
     System.out.println(initialvalue);
    
    }
}*/
package Java1.Java2;

public class Child extends Parent {
    public int initialvalue = Parent.val; // Declare initialvalue as a member variable

    public static void main(String[] args) {
        Child cha = new Child(); // Create an instance of Child
        System.out.println(cha.initialvalue); // Access initialvalue through the instance
    }
}
