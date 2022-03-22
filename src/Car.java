public class Car extends Vehicle
{
  private boolean electric;
  private boolean discountApplied;
  
  public Car(String licensePlate, double tollFee, int passengers, boolean electric)
  {
    super(licensePlate, tollFee, passengers);
    this.electric = electric;
    discountApplied = false;   // default value
  }

  public boolean isElectric()
  {
      return electric;
  }

  public boolean isDiscountApplied()
  {
      return discountApplied;
  }

  public boolean dropOffPassengers(int numOut)
  {
      if (numOut >= getPassengers())
      {
          return false;
      }
      setPassengers(getPassengers() - numOut);
      return true;
  }

  @Override
  public double calculateTollPrice()
  {
      if (getPassengers() > 4)
      {
          return getTollFee() * 4;
      }
      return super.calculateTollPrice();
  }

  public void applyDiscount()
  {
      if (!discountApplied && electric)
      {
          setTollFee(0.5 * getTollFee());
          discountApplied = true;
      }
  }

  public void printCar()
  {
      System.out.println("License Plate: " + getLicensePlate());
      System.out.println("Toll Fee: " + getTollFee());
      System.out.println("Passengers: " + getPassengers());
      System.out.println("Electric? " + electric);
      System.out.println("Discount Applied? " + discountApplied);
  }
}