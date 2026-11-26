package track.Collections;

import java.util.HashSet;

public class StudentApp {
    public static void main(String[] args) {
        Student s1 = new Student(11, "Anu");
        Student s2 = new Student(12, "Raju");
        Student s3 = new Student(11, "Anu");

        HashSet hs = new HashSet();
        System.out.println();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        System.out.println(hs);
    }
}
