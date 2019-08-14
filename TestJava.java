package hexa;
public class TestJava{
  public static void main(String[] args) {
    Student sEmpty = new Student();
    Student sParam = new Student("rr","java");
    Student sParam2 = new Student("rr","java");
    System.out.println(sEmpty);
    System.out.println(sParam);
    if (sParam.equals(sParam2)) {
      System.out.println("param1 and param2 are EQUAL");
    }
    else {
      System.out.println("param1 and param2 are NOT EQUAL");
    }
    sEmpty.setName("rr");
    sEmpty.setCourse("java");
    if (sEmpty.equals(sParam2)) {
      System.out.println("EMPTY and param2 are EQUAL");
    }
    else {
      System.out.println("EMPTY and param2 are NOT EQUAL");
    }
    boolean ret =sParam.validateCourse();
    System.out.println("return value is "+ret);
    ret =sParam.validateCourse("java");
    System.out.println("return value is "+ret);
    ret =sParam.validateCourse("C++","java");
    System.out.println("return value is "+ret);
  }
}
