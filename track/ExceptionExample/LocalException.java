package track.ExceptionExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LocalException {
    public static void main(String[] args) {
        System.out.println("Exception program started ...");
        divide();
        System.out.println("Exception program is completed ....");
    }

    static void divide() {
        try {
            System.out.println("Enter a & b elements ");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a element = ");
            int a = sc.nextInt();
            System.out.println("Enter b element = ");
            int b = sc.nextInt();
            int res = a / b;
            System.out.println("Divide Result" + res);
        } catch (ArithmeticException e2) {
            System.out.println("ArithmeticException");
            System.out.println(e2.getMessage());
            e2.printStackTrace();
        } catch (InputMismatchException e4) {
            System.out.println("InputMismatchException ");
            System.out.println(e4.getMessage());
            e4.printStackTrace();
        } finally {
            System.out.println("This is finally block ...");
        }
    }
}
