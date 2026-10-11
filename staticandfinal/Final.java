package staticandfinal;

public class Final {
  public static void main(String[] args){
    Random r1=new Random();
    System.out.println(r1.PI);

  }
}
class Random{
  final double PI;
  Random(){
    this.PI=3.14;
  }
}
