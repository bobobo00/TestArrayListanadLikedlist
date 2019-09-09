package cn.TestCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * @ClassName Test01
 * @Description TODO
 * @Auther danni
 * @Date 2019/9/8 9:58]
 * @Version 1.0
 **/

public class Test01 {
    public static void main(String[] args) {
        Collection<Integer> c=new ArrayList<>();
        List<Integer> l=new LinkedList<>();
        List<Integer> ll=new ArrayList<>();
        ll.add(1);
        ll.add(1,7);
        ((LinkedList<Integer>) l).addFirst(5);
        ((LinkedList<Integer>) l).addFirst(2);
        ((LinkedList<Integer>) l).addLast(3);
        ((LinkedList<Integer>) l).addLast(5);
        ll.addAll(l);
        ll.addAll(3,l);
        List aa=ll.subList(3,5);
        System.out.println(ll);
        System.out.println(aa);
        /*((ArrayList<Integer>) c).add(2);
        ((ArrayList<Integer>) c).add(3);
        ((ArrayList<Integer>) c).add(4);
        ((ArrayList<Integer>) c).add(5);
        System.out.println(c.size());
        System.out.println(c.isEmpty());
        System.out.println(c);
        System.out.println("####################");
        c.remove(4);
        System.out.println(c);
        System.out.println(c.size());
        Object[] obj=c.toArray();
        System.out.println(Arrays.toString(obj));
        System.out.println("####################");
        c.clear();
        System.out.println(c.size());
        System.out.println(c.isEmpty());*/


    }
}
