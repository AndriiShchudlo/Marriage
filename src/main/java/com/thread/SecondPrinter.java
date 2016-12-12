package main.java.com.thread;

public class SecondPrinter implements Runnable {
   // FirstPrinter FP;
   @Override
   public void run() {

       for (int i = 0; i < 25; i++) {
           System.out.print("1" + "\t");
           try {
               Thread.sleep(75);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           //   if (i % 5 == 0) System.out.println();

       }
    }

}