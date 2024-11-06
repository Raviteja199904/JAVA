import java.util.*;

public class VectorAndStack {
       public static void main(String args[]) {
              Vector<String> v1 = new Vector<>();
              Integer[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
              Stack<Integer> v4 = new Stack();
              System.out.println(v4);
              Stack<String> v5 = new Stack<>();
              System.out.println(v5.capacity());
              v1.add("avr");
              v1.add("vr");
              v1.add("sharmi");
              v1.add("eswar");
              v1.add("praveen");
              v1.add("Sowmya");

              Stack<String> v2 = new Stack<>();

              // methods for vctor

              v1.add("mona");
              v2.addAll(v1);
              v1.size();
              v1.capacity();
              v1.get(1);
              System.out.println(v1.firstElement());
              System.out.println(v1.lastElement());
              v1.remove(4);
              v1.set(3, "venaktaramaiah");

              System.out.print(v1);
              System.out.println(v2);
              Object[] arr = v1.toArray();
              for (Object element : arr) {

                     System.out.println(element);
              }
System.out.println("stack methods are :");
              //stack metods

              Stack<Integer> st=new Stack<>();

              st.push(10);
              st.push(20);

              st.push(30);

              st.push(40);

              st.push(50);
              st.push(60);

int obj=st.pop();
System.out.println(obj);
System.out.println(st.peek());
System.out.println(st.search(20));





       }

}
