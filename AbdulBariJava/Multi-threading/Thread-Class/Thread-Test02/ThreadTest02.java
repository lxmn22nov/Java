public class ThreadTest02 extends Thread
{
      public void run()
      {
            int i = 1;
            while(true)
            {
                  System.out.println(i+"Hello");
                  i++;
            }
      }
      public static void main(String[] args)
      {
            ThreadTest02 t = new ThreadTest02();
            t.start();
            
            int i = 1;
            while(true)
            {
                  System.out.println(i+"World");
            }
      }
}