public class demo15 {
  
  
  public static void main(String[] args) {
    // Student s1=new Student(12, "harsh","abesec");
    // System.out.println(s1.getAge());
    // System.out.println(s1.getName());
    // System.out.println(s1.getCollege());

    College college= new College("abesec", "ghaziabad");
    Student s1=new Student(23, "monu",  college);
  System.out.println(s1.getCollege().name);
   s1.getCollege().name="abesit";
    System.out.println(s1.getCollege().name);
  }
}

//immutalbe class
// defensive copy of college(non perimitive)
final class Student{
  private final int age;
  private final String name;
  private final College college;
  Student(int age, String name, College college){
    this.age=age;
    this.name=name;
    this.college=new College(college.name, college.address);

  }
  public int getAge(){
    return this.age;
  }
  public String getName(){
    return this.name;
  }
  //defensive copy
  public College getCollege(){
    return new College(this.college.name, this.college.address);
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

