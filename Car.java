package hexa;
public class Car extends Vehicle {
  String brand;
  {
    System.out.println("Car instance block is called");
  }
  Car (String b) {
    
    brand=b;
    System.out.println("one arg constructor in Car "+brand);
  }
  Car (String b,int w) {
    super(w);
    brand =b;
    System.out.println("two arg constructor in car "+brand);

  }
  
  void carDisplay() {
    System.out.println("Display car");
  }
  @Override
  void mileage(int mile) {
    super.mileage (mile+20);
    System.out.println("Mileage for car is "+ mile);
  }
}