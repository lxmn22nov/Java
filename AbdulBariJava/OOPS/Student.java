//Writing a class for student.
class StudentTest 
{
    int SAP_ID;
    String Name;
    String Course;
    float Marks1, Marks2, Marks3;

    //Method 1.
    float total_marks()
    {
        return Marks1 + Marks2 + Marks3;
    }
    //Method 2.
    float total_average()
    {
        return (Marks1 + Marks2 + Marks3)/3;
    }
    //Method 3.
    char grade()
    {
        if(total_average() >= 70)
        {
            return 'A';
        }
        else
        {
            return 'B';
        }
    }
}
public class Student
{
    public static void main(String[] args)
    {
        StudentTest s = new StudentTest();

        s.SAP_ID = 1000017428;
        s.Name = "Laxman Singh Koranga";
        s.Course = "BCA";
        s.Marks1 = 75;
        s.Marks2 = 65;
        s.Marks3 = 77;

        System.out.println("SAP ID: "+s.SAP_ID);
        System.out.println("Name: "+s.Name);
        System.out.println("Course: "+s.Course);
        System.out.println("Total marks: "+s.total_marks());
        System.out.println("Total Average: "+s.total_average());
        System.out.println("Grade: "+s.grade());
    }
}