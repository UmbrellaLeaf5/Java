import ul.Car;

public class App {
  public static void main(String[] args) throws Exception {
    App app = new App();
    System.out.println("Hello, World!\n");

    Human human = new Human();

    human.BuyBread();
    human.BuyMilk();

    human.PrintAge();
    human.PrintWeight();

    human.DoBirthDay();

    human.PrintAge();

    Car t_car = new some.Truck();
    some.Truck truck = new some.Truck();

    System.out.println(truck.GetSpeed());
    System.out.println(t_car.GetSpeed());

    truck.GetResourcesAmount();
    // t_car.GetResourcesAmount();

    // truck.MethodOne();
    // truck.MethodTwo();
    // truck.MethodThree();
    truck.MethodFour();

    truck.var_4 += 0; // = /* truck.var_1 + */ truck.var_3 + truck.var_2;

    app.UseCarWith(truck, 0);
  }

  void UseCarWith(Car car, int i) {
    UseCar(car);
    System.out.println(i);
  }

  void UseCar(Car car) {
    System.out.println(car.GetSpeed());
    System.out.println(car.GetSeatsAmount());
  }

  Car car;
}
