
public class demo {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("harsh");
        Student s3 = new Student("harsh", 23);
        Student s4 = new Student("harsh", 23, 43);
        Student s5 = new Student("harsh", 23, 43, "ABESEC");

        System.out.println(s1.name);
        // System.out.println(s2.name);
        // System.out.println(s3.age);
        // System.out.println(s4.rollNumber);
        // System.out.println(s5.college);
    }
}
// Constrcutor chaaning
class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    Student() {
      
    }

    Student(String name) {
        this(name, 0, 0, null);
    }

    Student(String name, int age) {
        this(name, age, 0, null);
    }

    Student(String name, int age, int rollNumber) {
        this(name, age, rollNumber, null);
    }

    Student(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }

  
}