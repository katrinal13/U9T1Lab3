public class Truck extends Vehicle
{
  private int axles;
  private boolean hasTrailer;
  
  public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer)
  {
    super(licensePlate, tollFee, passengers);
    this.axles = axles;
    this.hasTrailer = hasTrailer;
  }

  public boolean validateLicensePlate()
  {
      if (hasTrailer)
      {
          if (axles > 4 && getLicensePlate().substring(getLicensePlate().length() - 2, getLicensePlate().length()).equals("MX") || axles <= 4 && getLicensePlate().substring(getLicensePlate().length() - 2, getLicensePlate().length()).equals("LX"))
          {
              return true;
          }
          return false;
      }
      return true;
  }

  @Override
  public double calculateTollPrice()
  {
      double tollPrice = getTollFee() * axles;
      if (hasTrailer)
      {
          return tollPrice * 2;
      }
      return tollPrice;
  }

  @Override
  public void printInfo()
  {
      super.printInfo();
      System.out.println("Number of axles: " + axles);
      System.out.println("Has trailer? " + hasTrailer);
  }
}