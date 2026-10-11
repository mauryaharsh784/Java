package staticandfinal;

public class Static {
   public static void main(String[] args){
  Student s1=new Student("harsh",23,101);
  Student s2=new Student("h@rsh",27,102);
  Student.college="abesc";
    System.out.println(s1.name+","+s1.age+","+s1.rollNum+","+s1.college);
      System.out.println(
            s2.name + "," + s2.age + "," + s2.rollNum + "," + Student.college
        );
   }
}
 class Student{
  String name;
  int age;
  int rollNum;
  static String college;
  Student(String name,int age,int rollNum){
    this.name=name;
    this.age=age;
    this.rollNum=rollNum;
  }

  //static block:
  static{
    college="abes";
  }
 }