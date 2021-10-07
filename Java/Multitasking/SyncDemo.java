package Java.Multitasking;

// A Class used to send a message
class Sender
{
    synchronized public void send(String msg)
    {
        System.out.println("Sending\t"  + msg );
        try
        {
            Thread.sleep(2000);
        }
        catch (Exception e)
        {
            System.out.println("Thread  interrupted.");
        }
        System.out.println("\n" + msg + "Sent");
    }
}

// Class for send a message using Threads 
class ThreadedSend extends Thread
{
    private String msg;
    Sender  sender;

    // Recieves a message object and a string 
    // message to be sent 
    ThreadedSend(String m,  Sender obj)
    {
        msg = m;
        sender = obj;
    }

    public void run()
    {
        // Only one thread can send a message
        // at a time. 
            // synchronizing the snd object
            sender.send(msg);
    }
}

// Driver class 
class SyncDemo
{
    public static void main(String args[]) throws InterruptedException {
        Sender snd = new Sender();
        ThreadedSend S1 =
                new ThreadedSend( " Hi " , snd );
        ThreadedSend S2 =
                new ThreadedSend( " Bye " , snd );

        // If threads are not running synchronized methods
        S1.start();
        // Will wait for S1 to terminate
        S1.join();
        // Will start after S1 is terminated
        S2.start();
        S2.join();

        // S1.join(5000)
        // Wait for for thread terminate or milliseconds

        // If threads are synchronized
        // No need to join and wait
//        S1.start();
//        S2.start();
    }
} 