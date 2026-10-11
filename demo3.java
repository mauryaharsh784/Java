
public class demo3 {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();

        System.out.println(ba.getBalance());

        ba.deposit(500);
        ba.withdraw(300);

        System.out.println(ba.getBalance());
    }
}

class BankAccount {
    private double balance;

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

class Student{
  private String name;
  private int rollNum;
  private int age;
  private String college;

  Student(String name,int rollBumber,int age,String college){
    this.name=name;
    this.age=age;
    this.rollNum = rollNum;
    this.college=college;
  }

  public String getname(){
    return name;
  }

  public void setName(String name){
    this.name=name;
  }
  public String getCollege(){
    return college;
  }
  public void setCollege(String college){
    this.college=college;
  }

}