package track.Collections;

import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        ArrayList al2 = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);

        al.add("Narendra Kumar");
        al.add('N');
        al.add(true);
        al.add(7.64);
        al.add(8.00);
        System.out.println(al);
        System.out.println(al.get(6));
        System.out.println(al.indexOf(40));
        System.out.println(al.isEmpty());
        al.addFirst(02);
        System.out.println(al);
        System.out.println(al.indexOf(30));
        al.remove(7);
        System.out.println(al);
        al.removeFirst();
        al.removeLast();
        System.out.println(al.removeFirst());
        al.set(2, "Jangam");
        System.out.println(al);

        al2.add(1000);
        al2.add(800);
        al2.add(500);
        System.out.println(al2);
        al.addAll(al2);
        System.out.println(al);

    }
}
