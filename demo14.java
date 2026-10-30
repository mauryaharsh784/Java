

public class demo14 {
  
  public static void main(String[] args) {
    // Student s1=new Student(12, "harsh","abesec");
    // System.out.println(s1.getAge());
    // System.out.println(s1.getName());
    // System.out.println(s1.getCollege());

    College college= new College("abesec", "ghaziabad");
    Student s1=new Student(23, "monu",  college);

   s1.getCollege().name="abesit";
    System.out.println(s1.getCollege().name);
  }
}

//immutalbe class
class Student{
  private final int age;
  private final String name;
  private final College college;
  Student(int age, String name, College college){
    this.age=age;
    this.name=name;
    this.college=college;

  }
  public int getAge(){
    return this.age;
  }
  public String getName(){
    return this.name;
  }
  public College getCollege(){
    return this.college;
  }

}

class College{
  String name;
  String address;
  College(String name, String address){
    this.name=name;
    this.address=address;


  }
}