public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!\n");

    Human human = new Human();

    human.BuyBread();
    human.BuyMilk();

    human.PrintAge();
    human.PrintWeight();

    human.DoBirthDay();

    human.PrintAge();
  }
}
