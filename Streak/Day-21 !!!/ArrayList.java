package Arrays;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(45);
        System.out.println(list);
        System.out.println(list.contains(23));
        list.set(0,34);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
