package ExamplesArraysLists;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListCollectionsSortExample {
    public static void main (String[] args){
        List<Integer> add = new ArrayList<>();
        add.add(0);
        add.add(23);
        add.add(15);
        add.add(10);
        System.out.println("Before" + add);
        Collections.sort(add);
        System.out.println(add);
    }
}
