public class Student
{
  static int count=0;
  final String College="Vidya";
  private String name;
  private String course;

  void incStudent()
  {
    count++;
  }
  public static void dispCount()
  {
    System.out.println("Number of students "+count);
  }
  public Student()
  {
    incStudent();
  }

  public Student(String name,String course)
  {
    incStudent();
    this.name=name;
    this.course=course;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  @Override
  public String toString() {
    return "Student [College=" + College + ", course=" + course + ", name=" + name + "]";
  }
  public int hashCode()
  {
   return Objects.hash(this.name,this.course);
  } 
  public static void main(String[] args)
  {
   
  }
} 