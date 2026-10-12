//Interfaces:
public class demo8 {
  public static void main(String[] args) {
    Car car=new ElectricCar();
    car.start();
    car.accelerate();
    car.brake();

  }
}
interface Car{
  void start();
 void accelerate();
 void brake();
}

class FuleCar implements Car {


@Override
public void start() {
    System.out.println("FuelCar car is starting");
}

@Override
public void accelerate() {
    System.out.println("FuelCar car is accelerating");
}

@Override
public void brake() {
    System.out.println("FuelCar car is braking");
}


}

class ElectricCar implements Car {


@Override
public void start() {
    System.out.println("ElectricCar car is starting");
}

@Override
public void accelerate() {
    System.out.println("ElectricCar car is accelerating");
}

@Override
public void brake() {
    System.out.println("ElectricCar car is braking");
}


}
