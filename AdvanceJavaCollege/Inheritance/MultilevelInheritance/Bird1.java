//Implementing multilevel inheritance.
class Bird 
{
    void fly() 
    {
      System.out.println("I am a Bird.");
    }
}
// Inheriting class Bird.
class Parrot extends Bird 
{
    void colour() 
    {
      System.out.println("I am green.");
    }
}
// Inheriting class Parrot.
class SingingParrot extends Parrot 
{
    void singing() 
    {
      System.out.println("I can sing Opera.");
    }
}
class Bird1 
{
    public static void main(String[] args) 
    {
      SingingParrot sp = new SingingParrot();
      sp.singing();
      sp.colour();
      sp.fly();
    }
}