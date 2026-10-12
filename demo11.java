//inner class:
public class demo11 {
  public static void main(String[] args) {
    Outer outer=new Outer();
    //Outer.Inner inner= outer.new Inner();

    Outer.Inner inner=outer.new Inner();
    //Outer.Inner inner=new Outer().new Inner();
    inner.fun();

  }
}

class Outer{
  int x=10;
  class Inner{
    int x=20;
   void fun(){
    System.out.println(x);
    System.out.println(Outer.this.x);
   }
}
}
