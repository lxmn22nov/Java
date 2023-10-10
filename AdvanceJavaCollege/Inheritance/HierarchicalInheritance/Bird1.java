//Implementing Hierarchial Inheritance.
class Bird 
{
    void fly() 
    {
      System.out.println("I am a Bird.");
    }
}
class Parrot extends Bird 
  {
    void colour() 
    {
      System.out.println("I am green.");
    }
}
class Crow extends Bird 
  {
    void colour() 
    {
      System.out.println("I am black.");
    }
}
class Bird1 
{
    public static void main(String[] args) 
    {
      Parrot p = new Parrot();
      Crow c = new Crow();
      //Call methods of Parrot Class.
      p.colour();
      p.fly();
      //Call methods of Crow Class.
      c.colour();
      c.fly();
    }
}
  