package hexa;
public class TestCar {
  public static void main(String[] args) {
    Car c=new Car("Alto");
    c.carDisplay();
    Car a=new Car("Benze",2);
    a.Display();
    a.mileage(70);
    Vehicle v=new Car("Audi");
    v.mileage(30);
    v.Display();
    v.Devika(4,8);
    //Car c1=(Car) v;
    //c1.carDisplay();
  }
} 