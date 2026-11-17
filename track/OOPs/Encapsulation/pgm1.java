package track.OOPs.Encapsulation;

import java.util.Scanner;

public class pgm1 {
    public static void main(String[] args) {
        System.out.println("Program is started .....");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a  = ");
        int a = sc.nextInt();
        System.out.print("Enter the b  = ");
        int b = sc.nextInt();
        int res = a / b;
        System.out.println("Result of a/b = " + res);
        System.out.print("Enter the size of Array elements = ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements");
        int element = sc.nextInt();
        System.out.println("Enter the index ");
        int index = sc.nextInt();
        arr[index] = element;
        System.out.println("Elements are stored ....");
        System.out.println("program is completed ....");
    }

}
