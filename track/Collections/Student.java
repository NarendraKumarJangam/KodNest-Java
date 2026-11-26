package track.Collections;

import java.util.Objects;

public class Student extends Object {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public boolean equals(Object obj) {
        Student s = (Student) obj;
        if (this.roll == s.roll && this.name == s.name) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(roll, name);
    }

    public String toString() {
        return roll + "" + name;
    }

    void display() {
        System.out.println(roll);
        System.out.println(name);
    }
}
