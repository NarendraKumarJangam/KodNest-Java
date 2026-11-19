package track.ExceptionExample;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Connection started...");
            System.out.print("Enter any number = ");
            int a = sc.nextInt();
            System.out.print("Enter any number = ");
            int b = sc.nextInt();
            int res = a / b;
            System.out.println("Result :" + res);
            System.out.println("Connection terminated ...");
        } catch (Exception e) {
            System.out.println(e.getmessage());
        }
    }
}
