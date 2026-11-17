package track.OOPs.Encapsulation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("Program is started .....");
        Scanner sc = new Scanner(System.in);
        try {
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
        } catch (ArithmeticException e1) {
            // System.out.println("Exception Handle");
            System.out.println(e1.getMessage());
        } catch (ArrayIndexOutOfBoundsException e2) {
            // System.out.println("Exception Handle");
            System.out.println(e2.getMessage());
        } catch (NegativeArraySizeException e3) {
            // System.out.println("Exception Handle");
            System.out.println(e3.getMessage());
        } catch (InputMismatchException e4) {
            System.out.println(e4.getMessage());
        } catch (Exception e5) {
            // System.out.println("Exception Handle");
            System.out.println(e5.getMessage());
        }
    }
}
