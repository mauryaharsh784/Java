//inheritense
public class demo4 {
  public static void main(String[] args) {
    
    EngineeringStudent es=new EngineeringStudent();
    es.markAttendence();
    es.attendlab();

    Student s1=new Student();
    s1.markAttendence();
    //s1.attendlab();
  }
}
class Student {
  String name;
  int age;
   void markAttendence(){
    System.out.println("Atteneed marks");
   }
}

class EngineeringStudent extends Student{
  void attendlab(){
    System.out.println("lab attended");
  }
}