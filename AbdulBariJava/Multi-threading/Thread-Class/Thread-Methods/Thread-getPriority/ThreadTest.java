class MyThread extends Thread
{
      public MyThread(String name)
      {
            super(name);
            //we can set priority into method or in main method.
            setPriority(Thread.MIN_PRIORITY+9);
      }
}
public class ThreadTest 
{
      public static void main(String[] args) throws Exception
      {
            MyThread t = new MyThread("My Thread 1");
            System.out.println("ID: "+t.getId());
            System.out.println("Name: "+t.getName());
            System.out.println("Priority: "+t.getPriority());
            //"t.start()" will change the state of the thread.
            // t.start();
            System.out.println("State: "+t.getState());
            System.out.println("Existence: "+t.isAlive());
      }
}
