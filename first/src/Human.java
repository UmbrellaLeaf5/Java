public class Human {
  int age;
  double weight;

  void BuyMilk() {
    System.out.println("Buy Milk!");
  }

  void BuyBread() {
    System.out.println("Buy Bread!");
  }

  void PrintAge() {
    System.out.println(age);
  }

  void PrintWeight() {
    System.out.println(weight);
  }

  void DoBirthDay() {
    age += 1;
  }
}
