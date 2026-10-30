public class demo20 {
  
  public static void main(String[] args) {
    
  }
}

//multiple inhertance:-->Inerfaces

interface Animal{
  void eat();
}


interface Dog extends Animal{
  void bark();
}

class StreetDog implements Dog{
  @Override
  public void eat(){
    System.out.println("eating");
  }
  @Override
  public void bark(){
    System.out.println("barking");
  }
}