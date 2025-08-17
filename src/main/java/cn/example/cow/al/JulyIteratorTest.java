package cn.example.cow.al;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author July
 * @description
 * @create 2025-08-17 8:14
 */
public class JulyIteratorTest {

    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        list.add("qqq");
        list.add("dffq");
        list.add("qqfegt");
        list.add("vdfgvd");
        list.add("dewdf");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(Arrays.toString(list.toArray()));
    }

}
