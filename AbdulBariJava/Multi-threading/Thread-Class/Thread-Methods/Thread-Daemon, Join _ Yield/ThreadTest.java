class MyThread extends Thread
{
      public void run()
      {
            int count = 1;
            while(true)
            {
                  System.out.println(count++);
            }
      }
}
public class ThreadTest 
{
      public static void main(String[] args) 
      {
            MyThread t = new MyThread();
            //Marks this thread as either a daemon thread or a user thread.
            //The JVM exits when the only threads running are all daemon threads.
            //This method must be invoked before the thread is started.
            t.setDaemon(true);
            t.start();
            // try
            // {
            //       Thread.sleep(1);
            // }
            // catch(Exception e)
            // {

            // }
            Thread mainThread = Thread.currentThread();
            mainThread.join();
      }
}