package main.java.com.thread;

public class ThirdPrinter implements Runnable{

    @Override
    public void run() {
        synchronized (this){

       System.out.println("Sаппарапрапа");
        }

    }
}
