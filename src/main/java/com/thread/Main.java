package main.java.com.thread;

public class Main {
    public static void main(String[]args) throws InterruptedException {

       Thread t2 = new Thread(new SecondPrinter());
        Thread t1 = new Thread(new FirstPrinter());
//        Thread t3 = new Thread(new ThirdPrinter());

        t1.start();
        t2.start();
//        t3.start();
        t1.join();
        System.out.println("Hello");

        ;
    }
}
