//package day12_13;

import java.util.ArrayList;
import java.util.HashSet;

public class Sample {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(44);
        obj.add(666);
        obj.add(44);
        obj.add(999);

        System.err.println("obj"+obj);
        
        //hash map
        HashSet<Integer> obj1 = new HashSet<>();
        obj1.add(44);
        obj1.add(555);
        obj1.add(44);

        System.out.println("obj1"+obj1);
    }
}
