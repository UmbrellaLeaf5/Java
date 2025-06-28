package some;

public class Truck extends ul.Car {
  int resources_amount;

  private int var_1 = 0;
  protected int var_2 = 0;
  int var_3 = 0;
  public int var_4 = 0;

  public int GetResourcesAmount() {
    return resources_amount;
  }

  @Override
  public int GetSeatsAmount() {
    MethodOne();
    MethodTwo();
    MethodThree();
    MethodFour();

    var_2 = var_1 + var_3 + var_4;

    return 2;
  }

  private void MethodOne() {}
  protected void MethodTwo() {}
  void MethodThree() {}
  public void MethodFour() {}
}
