package main.java.com.thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new FirstPrinter());
        Thread t2 = new Thread(new SecondPrinter());
        Thread t3 = new Thread(new ThirdPrinter());

        t1.start();
        t2.start();
        t1.join();
        System.out.println("Hello");
        t3.start();


    }
}
