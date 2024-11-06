/*package Java1.Java2;
import Java1.Java2.*;
public class SubChild extends Parent {
    public static void main(String[] args) {
      Parent.val=24;
        System.out.println(Parent.val);
    }
}*/
package Java1.Java2;

public class SubChild extends Child {
    public static void main(String[] args) {
        SubChild subCha = new SubChild(); // Create an instance of SubChild
        System.out.println("Initial value from Child: " + subCha.initialvalue); // Access initialvalue
    }
}
