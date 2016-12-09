package main.java.com.thread;


public class Main {
    public static void main(String[]args){

       Thread t2 = new Thread(new SecondPrinter());
        Thread t1 = new Thread(new FirstPrinter());

        t1.start();
        t2.start();
        System.out.println("Hello");

    }
}
