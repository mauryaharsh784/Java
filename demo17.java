/// Enum--> enumaration 
public class demo17 {
  public static void main(String[] args) {
    
    int status=PaymentStatus.SUCCESS;
    System.out.println(status);
    
    int status2=PaymentStatus.SUCCESS;



  }
  
} 
/*
payment status ---> success ,failed pending
final
problem with approch:
1. type saftey
2. poor readbility
3. no grouping od related enities

 */

class PaymentStatus{
  public  static final int SUCCESS=1;
  public  static final int PENDING=2;
  public  static final int FAILED=3;
  
}