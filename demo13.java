public class demo13 {
  public static void main(String[] args) {
    // Person p1=new Person();
    // p1.introduce();

    // Person p2=new Guest();
    // p2.introduce();

    //anonymouse class
    Person p2=new Person(){
      @Override
      void introduce(){
        System.out.println("hi i am guest");
      }
    };
    p2.introduce();
  }
}

class Person{
   void introduce(){
    System.out.println("hi i am person");
   }
}
class Guest extends Person{
  @Override
  void introduce(){
    System.out.println("hi i am a guest");
  }
}