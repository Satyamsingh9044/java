
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running by extending Thread");
    }
}

public class ThreadExample1 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}