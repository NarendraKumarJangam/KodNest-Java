package track.ExceptionExample;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Program is started...");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        int a = sc.nextInt();
        System.out.print("Enter b = ");
        int b = sc.nextInt();
        int res = a / b;
        System.out.println("Dicision of a/b Result : " + res);
        System.out.print("Enter the size of Array =");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the Array element = ");
        int element = sc.nextInt();
        System.out.print("Enter the array index = ");
        int index = sc.nextInt();
        arr[index] = element;
        System.out.println("Program is terminated ...");
    }
}
