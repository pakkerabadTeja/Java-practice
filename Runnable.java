public class Runnableimplements Runnable 
{
    // The run method contains the code that will be executed when the thread is started
    @Override
    public void run() 
    {
        try 
        {
            // Loop to print a message five times with a delay between each print
            for (int i = 1; i <= 5; i++) 
            {
                System.out.println("Thread is running... " + i);
                // Sleep for 1 second (1000 milliseconds)
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) 
        {
            // Handling the InterruptedException
            System.out.println("Thread was interrupted");
        }
    }

    public static void main(String[] args)
    {
        // Creating an instance of RunnableExample
        RunnableExample runnableExample = new RunnableExample();

        // Creating a Thread object and passing the RunnableExample instance to its constructor
        Thread thread = new Thread(runnableExample);

        // Starting the thread
        thread.start();

        // Main thread also does some work
        try
        {
            for (int i = 1; i <= 5; i++) 
            {
                System.out.println("Main thread is running... " + i);
                Thread.sleep(500); // Sleep for half a second (500 milliseconds)
            }
        } 
        catch (InterruptedException e) 
        {
            System.out.println("Main thread was interrupted");
        }
    }
}



OUTPUT:
Thread is running... 1
Main thread is running... 1
Main thread is running... 2
Thread is running... 2
Main thread is running... 3
Main thread is running... 4
Thread is running... 3
Main thread is running... 5
Thread is running... 4
Thread is running... 5
