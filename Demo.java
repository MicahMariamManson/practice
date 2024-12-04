import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student
{
    int age;
    String name;

    //CONSTRUCTOR   
    public Student(int age, String name) {
      this.age = age;
      this.name = name;
    }


    @Override
    public String toString() {
      return "Student [age=" + age + ", name=" + name + "]";
    }

    

}
public class Demo
{
  public static void main(String args[])
  {
    Comparator<Student> com = new Comparator<Student>() {
      public int compare(Student i,Student j)
      {
        if(i.age > j.age)   // to get the last digit
          return 1;
        else
          return -1;
      }

    };
    List<Student> studs = new ArrayList<>();
    {
      studs.add(new Student(20,"Derrick"));
      studs.add(new Student(18,"Meher"));
      studs.add(new Student(23,"Aminu"));
      studs.add(new Student(21,"Thilak"));

      Collections.sort(studs,com);
      for(Student s:studs)
      {
        System.out.println(s);
      }
      
    }
  }
}
