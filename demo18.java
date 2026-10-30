public class demo18 {
  

  public static void main(String[] args) {
    ///int status=PaymentStatus.SUCCESS;
    /// type saftey come:
    PaymentStatus status=PaymentStatus.SUCCESS;
    System.out.println(status.name());
    
  }
}


enum PaymentStatus{
  SUCCESS,
  FAILED,
  PENDING;
}

class PaymentStatus2 {
  public  static final int SUCCESS=1;
  public  static final int PENDING=2;
  public  static final int FAILED=3;
  
}