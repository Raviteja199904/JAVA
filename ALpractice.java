import java.util.*;
public class ALpractice {
    public static void main(String args[]){
       Vector<String> v1 = new Vector<>();

       Integer[] arr1= {1,2,3,4,5,6,7};
      
       List<Integer> v4=new ArrayList<Integer>(Arrays.asList(arr1));
       for(Integer element:v4){
              System.out.println(element);
       }
System.out.println(v4);
       ArrayList<String> v5 =new ArrayList<>(200);
       v1.add("avr");
       v1.add("vr");
       v1.add("sharmi");
       v1.add("eswar");
       v1.add("praveen");
       v1.add("Sowmya");


       ArrayList<String> v2= new ArrayList<>();

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
