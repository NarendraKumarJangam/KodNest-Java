package track.M05_T4;

public class StudentApp {
    public static void main(String[] args) {
        Student s = new Student(23, "Narendra Kumar");
        Student s1 = new Student(20, "Surya");
        Student s2 = new Student(23, "Narendra Kumar");

        s.display();
        s1.display();
        s2.display();
        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2));

    }

}
