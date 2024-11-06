import java.util.*;
public class VLpractice {
    public static void main(String args[]){
       Vector<String> v1 = new Vector<>();

       int[] arr1= new int[]  {1,2,3,4,5,6,7};
       Vector v4=new Vector(Arrays.asList(arr1));
System.out.println(v4);
       Vector v5=new Vector<>(200);
System.out.println(v5.capacity());
       v1.add("avr");
       v1.add("vr");
       v1.add("sharmi");
       v1.add("eswar");
       v1.add("praveen");
       v1.add("Sowmya");


       Vector<String> v2= new Vector<>();

       //methods for vctor

       v1.add("mona");
       v2.addAll(v1);
       v1.size();
       v1.capacity();
       v1.get(1);
       System.out.println(v1.firstElement());
      System.out.println( v1.lastElement());
       v1.remove(4);
       v1.set(3,"venaktaramaiah");

        System.out.print(v1);
        System.out.println(v2);
        Object[] arr=v1.toArray();
for(Object element:arr){

        System.out.println(element);
    }
}
    
}
