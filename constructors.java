// public class constructors {
     
//   public static void main(String[] args) {
//     Student s1=new Student();// agar jab ye object create ho raha hai using this line automatically value dal de usi constructor kahte hai;

//     s1.name="harsh";
//     s1.age=23;
//     s1.rollNumber=12;
//     s1.college="abesec";

//     System.out.println(s1.name);
//     System.out.println(s1.age);
//     System.out.println(s1.rollNumber);
//     System.out.println(s1.college);
//     //int x;//local variable dose not have default value:

//     // System.out.println(x);

    
//   }
  
// }


// /*
// interger --->0
// floating -->0.0
// boolean --->false
// String -->null;
//  */

// class Student {
//   String name;
//   int age;
//   int rollNumber;
//   String college;

  
// }

public class constructors {
     
  public static void main(String[] args) {
   Student s1 = new Student("harsh", 23, 103, "abesec");
    System.out.println(s1.name);
    System.out.println(s1.age);
    System.out.println(s1.rollNumber);
    System.out.println(s1.college);
    
  }
  
}


class Student {
  String name;
  int age;
  int rollNumber;
  String college;

  //default constructors:
  Student() {
    // name="harsh";
    // age=20;
    // rollNumber=101;
    // college="hdhdh";
  }
  Student(String n,int a,int rn,String c){
    name=n;
    age=a;
    rollNumber=rn;
    college=c;



  }
}



