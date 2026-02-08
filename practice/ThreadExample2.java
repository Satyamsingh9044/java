
class MyRunnable implements Runnable {
    public void run() {  

        System.out.println("Thread is running by Runnable Interface");
    }
}

public class ThreadExample2 {
    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start(); 
    }
}

