package track.Collections.Set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(60);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        System.out.println(hs);
        Set hs1 = new HashSet();
        hs1.add("Narendra");
        hs1.add("Ravi");
        hs1.add("Thiru");
        hs1.add("Mukesh");
        hs1.add("Kalyan");
        System.out.println(hs1);
    }
}
