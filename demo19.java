public class demo19 {
  public static void main(String[] args) {

    Car c=new Thar();
    c.drive();
    
  }
}

interface Car{
  void drive();
}

// class Thar implements  Car{
//   @Override 
//   public void drive(){
//    System.out.println("this is driving");
//   }
// }
// abstract class Thar implements  Car{
  
//   abstract public void drive();
// }

// class Blackthar extends Thar{
//   @Override
//   public void drive(){
   
//   }
// }

