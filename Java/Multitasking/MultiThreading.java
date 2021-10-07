package Java.Multitasking;

// Java code for thread creation by extending
// the Thread class
class RunnableDemo implements Runnable {
    public void run()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
                    "Thread " + Thread.currentThread().getName()
                            + " is running");
    }
}

class ThreadDemo extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
                "Thread " + Thread.currentThread().getName()
                        + " is running");
    }
}

// Main Class
public class MultiThreading {
    public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            RunnableDemo object
                    = new RunnableDemo();
            Thread thread = new Thread(object);
            ThreadDemo threadDemo = new ThreadDemo();

            // Run - Does not create a new thread - No Threading
            // Can be called multiple times
            thread.run();
            threadDemo.run();
            // Start - Creates a new thread - MultiThreading
            // Can be called only once otherwise throws exception {java.lang.IllegalThreadStateException}
            thread.start();
            threadDemo.start();
        }
    }
}