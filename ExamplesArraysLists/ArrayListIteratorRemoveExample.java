package ExamplesArraysLists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteratorRemoveExample {
    public static void main(String[] args){
        List<Integer> num=new ArrayList<>();
        num.add(23);
        num.add(20);
        num.add(12);
        num.add(10);
        num.add(21);
        Iterator<Integer> var= num.iterator();
        while (var.hasNext()) {

        Integer n=var.next();
        if(n % 2 !=0){
       var.remove();
        }
    }
System.out.println(num);
}
}