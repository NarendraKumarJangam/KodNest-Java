package track.Collections.Set;

import java.util.*;

public class SetDemo2 {
    public static void main(String[] args) {
        LinkedHashSet lh = new LinkedHashSet();
        lh.add(10);
        lh.add(20);
        lh.add(30);
        lh.add(40);
        lh.add(50);
        System.out.println(lh);
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add("Narendra");
        lhs.add("Raju");
        lhs.add("Thiru");
        System.out.println(lhs);

    }
}
