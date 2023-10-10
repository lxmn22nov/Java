//Implementation of data hiding + Encapsulation.
class Employee 
{
    // private variables.
    private String name;
    private int age;
    private double salary;
  
    //public getter and setter methods for each variables
    public String getName() 
    {
      return name;
    }
  
    public void setName(String name) 
    {
      this.name = name;
    }
  
    public int getAge() 
    {
      return age;
    }
  
    public void setAge(int age) 
    {
      this.age = age;
    }
  
    public double getSalary() 
    {
      return salary;
    }
  
    public void setSalary(double salary) 
    {
      this.salary = salary;
    }

    public static void main(String[] args) 
    {
      //object of class Employee
      Employee e = new Employee();
      e.setName("Laxman Singh Koranga.");
      e.setAge(26);
      e.setSalary(50000);
      System.out.println("Name of Employee: " +e.getName() +"\n"+
                        "Age of Employee: " +e.getAge()+"\n"+
                        "Salary of Employee: "+e.getSalary());
    }
}

    
  