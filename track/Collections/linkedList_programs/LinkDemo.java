package track.Collections.linkedList_programs;

import java.util.*;

public class LinkDemo {
    public static void main(String[] args) {
        List ll = new LinkedList();
        System.out.println();
        ll.add(10);
        ll.add(30);
        ll.add(20);
        ll.add(40);
        ll.add(50);
        System.out.println(ll);

        ll.addFirst(100);
        System.out.println(ll);

        ll.remove(3);
        System.out.println(ll);

        System.out.println(ll.remove(Integer.valueOf(40)));
        System.out.println(ll);
    }
}
