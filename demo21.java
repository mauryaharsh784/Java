public class demo21 {
  
  public static void main(String[] args) {
    Vehicale v=new Car();
    v.drive();
    //Vehicale.brake();
  }
}
//After java 8 what are chhanges in interface:
//-->default method
//-->List method interface
//-java 9-->Private method 


interface Vehicale{
  default void drive(){
    System.out.println("vehical is driving");
    acc();
  }
    static void brake(){
      System.out.println("break the car");
    
    }

    private void  acc(){
     System.out.println("vehicale is acc");
    }
}

class Car implements  Vehicale{
  // @Override 
  // public void drive(){
  //  System.out.println("car is driving");
  // }
}