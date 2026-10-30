import java.util.Objects;
public class demo16 {

  public static void main(String[] args) throws ClassCastException{
    Student s1=new Student();
    
    s1.name="harsh";
    s1.age=20;

    // System.out.println(s1.toString());
     //System.out.println(s1);

     Student s2=new Student();
     s2.name="harsh";
     s2.age=20;

    //  System.out.println(s1.equals(s2));
    //  System.out.println(s1.hashCode()==s2.hashCode());

    // System.out.println(s1.getClass().getName());
    // System.out.println(s2.getClass().getName());
 //System.out.println(s1 instanceof Object);

 Student s3=(Student) s1.clone();
 System.out.println(s3.name);
 System.out.println(s3.age);


  }
}

class Student extends Object implements Cloneable{
  String name;
  int age;
  @Override 
  public String toString(){
    return (name+","+age);
  }

  @Override 
  public boolean equals(Object obj){
    if(this==obj){
      return true;
    }
    if(obj==null){
      return false;
    }

    // when we not check get classcost exception:
    if(obj.getClass()!=this.getClass()){
      return false;
    }
Student s= (Student) obj;
    return Objects.equals(this.name,s.name) && this.age==s.age;
  }

  @Override
  public  int  hashCode()  {
      // int result=17;
      //  result=result * 31+age;
      //  result=result*31+name.hashCode();
      // return result;

      return Objects.hash(name, age);

      
  }
  protected Object clone() throws CloneNotSupportedException{
        return super.clone();
      }
}