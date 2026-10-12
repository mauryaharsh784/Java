public class demo7 {
public static void main(String[] args) {


    //Car car = new ElectricCar();
    Car car=new FuleCar();

    car.start();
    car.accelerate();
    car.brake();
}

}

abstract class Car {
abstract void start();
abstract void accelerate();
abstract void brake();
}

class FuleCar extends Car {


@Override
void start() {
    System.out.println("FuelCar car is starting");
}

@Override
void accelerate() {
    System.out.println("FuelCar car is accelerating");
}

@Override
void brake() {
    System.out.println("FuelCar car is braking");
}


}

class ElectricCar extends Car {


@Override
void start() {
    System.out.println("ElectricCar car is starting");
}

@Override
void accelerate() {
    System.out.println("ElectricCar car is accelerating");
}

@Override
void brake() {
    System.out.println("ElectricCar car is braking");
}


}
