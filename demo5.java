//multi level inheritanse:
public class demo5 {
  public static void main(String[] args) {
    
    CSEEngineeringStudent cs1=new CSEEngineeringStudent();
  }
}
class Student { //parent class
  String name;
  int age;
   void markAttendence(){
    System.out.println("Atteneed marks");
   }
}

class EngineeringStudent extends Student{//child class
  void attendlab(){
    System.out.println("lab attended");
  }
}

class CSEEngineeringStudent extends EngineeringStudent{
  void attendCSElab(){

  }
}
