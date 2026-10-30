public class demo23 {
  
  public static void main(String[] args) {
    
  }
}

/// resoluution priority rule
interface A{
  void fun();

}

interface B extends A{
  default void fun(){
    System.out.println("B");
  }

  interface C extends B {
     default void fun(){
       System.out.println("C");
     }
  }
  
  class D implements B,C{
    @Override
    public  void fun(){
      System.out.println("D");
    }
  }
    
  
}