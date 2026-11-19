package track.ExceptionExample;

import java.util.InputMismatchException;
import java.util.Scanner;

class ExceptionExample1 {

    public static void main(String[] args) {
        try {
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
        } catch (ArrayIndexOutOfBoundsException e1) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(e1.getMessage());
            e1.printStackTrace();
        } catch (ArithmeticException e2) {
            System.out.println("ArithmeticException");
            System.out.println(e2.getMessage());
            e2.printStackTrace();
        } catch (NegativeArraySizeException e3) {
            System.out.println("NegativeArraySizeException");
            System.out.println(e3.getMessage());
            e3.printStackTrace();
        } catch (InputMismatchException e4) {
            System.out.println("InputMismatchException ");
            System.out.println(e4.getMessage());
            e4.printStackTrace();
        } finally {
            System.out.println("Exception completed .....");
        }
    }
}
