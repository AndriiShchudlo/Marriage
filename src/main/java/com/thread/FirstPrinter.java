package main.java.com.thread;

 class FirstPrinter implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i< 25; i++){
            System.out.print("0" + "\t");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i%5==0) System.out.println();
        }

        }

}