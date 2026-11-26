package track.Collections;

import java.util.*;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList();
        // al.add(10);
        // al.add(20);
        // al.add(30);
        // al.add(40);
        // System.out.println(al);

        System.out.print("Enter the n size of ArrayList elements : ");
        int n = sc.nextInt();
        System.out.println("Enter ArrayList elements : ");
        for (int i = 0; i < n; i++) {
            int element = sc.nextInt();
            al.add(element);
        }
        System.out.println(al);
    }
}
