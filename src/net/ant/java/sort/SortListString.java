package net.ant.java.sort;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @autor papont
 */
public class SortListString {

    public static List<String> sort(List<String> list){
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        return list;
    }


    public static List<String> sortLamda(List<String> list){
        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
        return list;
    }


    public static void main(String[] args) {
        System.out.println("\n -- Old Expression: Sort List --");
        List<String> list = Arrays.asList("Steve", "Alex", "Jim", "Bob");
        System.out.println("Before sort: " + list);
        System.out.println("After sort: " + SortListString.sort(list));


        System.out.println("\n -- Lambda Expression: Sort List --");
        list = Arrays.asList("Steve", "Alex", "Jim", "Bob");
        System.out.println("Before sort: " + list);
        System.out.println("After sort: " + SortListString.sortLamda(list));

    }
}
