package track.OOPs.Inheritance;

import java.util.Scanner;

public class Child extends Parent {
    void display1() {
        System.out.println("This is a child class...");
    }

    public static void main(String[] args) {
        Child c1 = new Child();
        System.out.print(" ");
        c1.display();
        c1.display1();
    }
}

// one parent and one child classes is called single-level inheritance