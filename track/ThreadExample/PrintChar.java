package track.ThreadExample;

public class PrintChar extends Thread {
    public void run() {
        System.out.println("Printing char activity started .....");
        for (int i = 'A'; i <= 'G'; i++) {
            System.out.print(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {

            }
        }
        System.out.println("Printing char activity completed...");
    }
}
