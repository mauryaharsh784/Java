public class demo12 {
  public static void main(String[] args) {
    Outer outer=new Outer();
    outer.greet();
  }
}

class Outer{
  void greet(){
    
    class Local {
        void sayHello(){
          System.out.println("hello");
        }
        void sayHy(){
          System.out.println("hy");
        }
       
    }

    Local local=new Local();
    local.sayHello();
    local.sayHy();
  }
}