//super keyword

public class demo6 {
  public static void main(String[] args) {
    
  }
}
void print(){
  System.out.println(name);
}

class Student{
  String name;
  int age;
  int rollNo; 
}

class EngineeringStudent extends  Student{
  String college;
  void print(){
    System.out.println(super.name);
  }
}