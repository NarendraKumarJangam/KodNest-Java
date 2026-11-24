package track.Collections;

import java.util.ArrayList;

public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Narendra Kumar");
        al.add("N");
        al.add("JANGAN");
        // al.add(10);
        System.out.println(al);
        System.out.println("Size of Array=  " + al.size());
        System.out.println(al.contains("N"));
        System.out.println(al.contains(10));

    }
}
