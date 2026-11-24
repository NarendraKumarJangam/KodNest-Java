package track.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class pgm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter the element :");
        for (int i = 1; i < n; i++) {
            int element = sc.nextInt();
            al.add(element);
        }
        System.out.println("ArrayList : " + al);
        System.out.println();
        System.out.println("Traverse using  FOR-LOOP");
        for (int i = 0; i <= al.size() - 1; i++) {
            System.out.println(al.get(i) + " ");
        }
        System.out.println();
        System.out.println("Traverse using ADVANCE FOR=LOOP");
        for (Object X : al) {
            System.out.print(X + " ");
        }
    }
}
