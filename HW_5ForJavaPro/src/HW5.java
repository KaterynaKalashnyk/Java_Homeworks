import java.util.ArrayList;
import java.util.Collections;
/*
* Homework 5
* @version 23.05.2023
* @author Kateryna Kalashnyk
* */
public class HW5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        System.out.println("method isEmpty()");
        System.out.println(list.isEmpty());

        System.out.println("method add()");
        list.add(30);
        list.add(12);
        list.add(19);
        list.add(45);
        list.add(89);
        list.add(27);
        list.add(56);
        list.add(4, -67);
        list.add(2, 4);
        list.add(0,91);
        list2.add(-4);
        list2.add(-32);
        list2.add(2,-2);
        System.out.println(list2);
        System.out.println(list);

        System.out.println("method addAll()");
        list.addAll(list2);
        System.out.println(list);

        System.out.println("method isEmpty()");
        System.out.println(list.isEmpty());

        System.out.println("method contains()");
        System.out.println(list.contains(19));
        System.out.println(list.contains(-76));
        System.out.println(list.contains(56));

        System.out.println("method indexOf()");
        System.out.println(list.indexOf(-32));
        System.out.println(list.indexOf(19));
        System.out.println(list.indexOf(27));

        System.out.println("method size()");
        System.out.println(list.size());
        System.out.println(list2.size());

        System.out.println("method clear()");
        list2.clear();
        System.out.println(list2);
    }
}
