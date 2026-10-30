public class demo22 {
  public static void main(String[] args) {
    D d=new D();
    d.fun();

    
  }
}

interface A{
  void fun();
}
interface B extends  A{
  void fun();
}

interface C extends B{
  void fun();
}

class D implements B, C {
  @Override 
  public void fun(){
    System.out.println("default implementaion");
  }

}