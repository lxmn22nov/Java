//Implementing single inheritance.
class Bird
{
    void fly() 
    {
      System.out.println("I am a Bird.");
    }
}
// Inheriting Parent class to Child class.
class Parrot extends Bird
{
    void colour() 
    {
      System.out.println("I am green.");
    }
}
class Bird1
{
    public static void main(String[] args)
    {
      Parrot p = new Parrot();
      p.colour();
      p.fly();
    }
}
