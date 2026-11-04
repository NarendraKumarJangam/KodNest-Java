package track.M05_T4;

public class Student {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void display() {
        System.out.println("your age is = " + age);
        System.out.println("Your name is = " + name);
    }

}
