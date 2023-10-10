public class ThreadTest01 implements Runnable
{
      public void run()
      {
            int i = 1;
            while(true)
            {
                  System.out.println(i+"Hello");
            }
      }
      public static void main(String[] args)
      {
            ThreadTest01 t = new ThreadTest01();
            Thread th = new Thread(t);
            th.start();

            int i = 1;
            while(true)
            {
                  System.out.println(i+"World");
            }
      }
}
