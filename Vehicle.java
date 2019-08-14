package hexa;
public class Vehicle{
  int numOfWheels;
  {
    System.out.println("Vehicle instance block is called");
  }
  Vehicle() {
   System.out.println("No arg constructor is called");  
  }
  Vehicle ( int w ) {
    numOfWheels=w;
    System.out.println("one arg constructor in Vehicle is called "+numOfWheels);
  }
  void Display() {
    System.out.println("Vehicle");
  }
  void mileage(int mile) {
    System.out.println("Mileage in the vehicle is "+ mile);
  }
  void Devika(int x,int y) {
    System.out.println("Passed values are "+x+" and "+y);
  }
}