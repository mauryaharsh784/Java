//nested class:

// static nested class:
public class demo10{
  public static void main(String[] args) {
    Outer outer=new Outer();
    Outer.Inner inner=new Outer.Inner(outer);
    inner.fun();
  }
}
//static nested class:
class Outer{
  static int x=9;
  int y;

  static class Inner{

    Outer outer;
    Inner(Outer outer){
      this.outer=outer;
    }
   void fun(){
    System.out.println(x);
    System.out.println(outer.y);
   }
  }
}
