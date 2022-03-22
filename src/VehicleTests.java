public class VehicleTests
{
  public static void main(String[] args)
  {
    // -------------- LAB PART 1 -----------------
    // a. write code to create a Vehicle object with license "MC56WQ",
    //    toll fee of 10.75, and 5 passengers.
    //    Print out the calculated toll TollPrice.

    Vehicle vehicle1 = new Vehicle("MC56WQ", 10.75, 5);
    System.out.println(vehicle1.calculateTollPrice());

    // b. write code to create an electric Car with license "KXN73F",
    //    toll fee of 8.50, and 2 passengers.
    //    Print out the calculated toll price

    Car car1 = new Car("KXN73F", 8.50, 2, true);
    System.out.println(car1.calculateTollPrice());

    // c. add a printCar() void method to the Car class that prints the
    //    Car's license plate, toll fee, number of passengers, whether it is electric,
    //    and whether a discount has been applied.
    //    Add getter methods as necessary to the Vehicle superclass.
    //
    // d. call the method on the Car you made in b to test it.

    car1.printCar();

    // e. write code to create a Truck with license "3K9JMX",
    //    a toll fee of 24.75, 4 passengers, 6 axles, with a trailer.
    //    Print out the calculated toll price

    Truck truck1 = new Truck("3K9JMX", 24.75, 4, 6, true);
    System.out.println(truck1.calculateTollPrice());

    // f. add a printTruck() void method to the Truck class that prints the
    //    Truck's license plate, toll fee, number of passengers, number of axles,
    //    and whether it has a trailer.
    //    Add getter methods as necessary to the Vehicle superclass.
    //
    // g. call the method on the Truck you made in e to test it.

    truck1.printTruck();

    // ------------ LAB PART 2 ---------------
    // ----- instructions in lab sheet -------

    Taxi taxi1 = new Taxi("8KM23Z", 9.25, 3, true, 5.0);
    taxi1.printTaxi();

    // Methods inherited from Vehicle
    System.out.println(taxi1.calculateTollPrice());
    System.out.println(taxi1.getPassengers());
    System.out.println(taxi1.getTollFee());
    System.out.println(taxi1.getLicensePlate());

    // Methods inherited from Car
    System.out.println(taxi1.isElectric());
    System.out.println(taxi1.isDiscountApplied());
    taxi1.printCar();

    System.out.println(taxi1 instanceof Taxi);
    System.out.println(taxi1 instanceof Car);
    System.out.println(taxi1 instanceof Vehicle);

    // ------------ LAB PART 3 ---------------
    // ----- instructions in lab sheet -------

    System.out.println("--- Testing method on a Car object ---");
    Car testCar1 = new Car("KXN73F", 8.50, 5, true);
    System.out.println(testCar1.getPassengers());
    System.out.println("-----------");
    boolean success = testCar1.dropOffPassengers(3);
    System.out.println(success);
    System.out.println(testCar1.getPassengers());
    System.out.println("-----------");
    success = testCar1.dropOffPassengers(3);
    System.out.println(success);
    System.out.println(testCar1.getPassengers());
    System.out.println("--- Testing method on a Taxi object ---");
    Taxi testTaxi1 = new Taxi("JMD645", 10.35, 3, false, 5.0);
    System.out.println(testTaxi1.getPassengers());
    System.out.println("-----------");
    success = testTaxi1.dropOffPassengers(3);
    System.out.println(success);
    System.out.println(testTaxi1.getPassengers());
    System.out.println("-----------");
    success = testTaxi1.dropOffPassengers(2);
    System.out.println(success);
    System.out.println(testTaxi1.getPassengers());
    System.out.println("-----------");

    System.out.println("--- Testing method on a Car object ---");
    Car testCar2 = new Car("KXN73F", 8.50, 5, true);
    testCar2.applyDiscount();
    System.out.println(testCar2.isDiscountApplied());
    System.out.println(testCar2.getTollFee());
    System.out.println("-----------");
    testCar2.applyDiscount(); // try applying again
    System.out.println(testCar2.isDiscountApplied());
    System.out.println(testCar2.getTollFee());
    System.out.println("--- Testing method on Taxi objects ---");
    Taxi testTaxi2 = new Taxi("JMD645", 10.0, 3, false, 5.0); // not electric
    testTaxi2.applyDiscount();
    System.out.println(testTaxi2.isDiscountApplied());
    System.out.println(testTaxi2.getTollFee());
    System.out.println("-----------");
    Taxi testTaxi3 = new Taxi("ABC645", 12.0, 3, true, 5.0);
    testTaxi3.applyDiscount();
    System.out.println(testTaxi3.isDiscountApplied());
    System.out.println(testTaxi3.getTollFee());
    System.out.println("-----------");

    System.out.println("--- Testing method on Truck objects ---");
    Truck testTruck1 = new Truck("7645MX", 10.50, 3, 7, true);
    boolean validLicensePlate = testTruck1.validateLicensePlate();
    System.out.println(validLicensePlate);
    System.out.println("-----------");
    Truck testTruck2 = new Truck("7645PX", 10.50, 3, 7, true);
    validLicensePlate = testTruck2.validateLicensePlate();
    System.out.println(validLicensePlate);
    System.out.println("-----------");
    Truck testTruck3 = new Truck("7645LX", 10.50, 3, 4, true);
    validLicensePlate = testTruck3.validateLicensePlate();
    System.out.println(validLicensePlate);
    System.out.println("-----------");
    Truck testTruck4 = new Truck("7645L9", 10.50, 3, 4, true);
    validLicensePlate = testTruck4.validateLicensePlate();
    System.out.println(validLicensePlate);
    System.out.println("-----------");
    Truck testTruck5 = new Truck("7645L9", 10.50, 3, 4, false);
    validLicensePlate = testTruck5.validateLicensePlate();
    System.out.println(validLicensePlate);
    System.out.println("-----------");
    Truck testTruck6 = new Truck("7645PX", 10.50, 3, 7, false);
    validLicensePlate = testTruck6.validateLicensePlate();
    System.out.println(validLicensePlate);

    Car myCar = new Car("MK4567", 10.0, 3, true);
    System.out.println(myCar.calculateTollPrice());

    Car myCar2 = new Car("FJ8731", 10.0, 6, true);
    System.out.println(myCar2.calculateTollPrice());

    // the way toll price is calculated for a Vehicle
    // shouldn't have changed
    Vehicle myVehicle = new Vehicle("KX1543", 10.0, 6);
    System.out.println(myVehicle.calculateTollPrice());

    Truck myTruck = new Truck("TY45LX", 20.0, 3, 5, true);
    System.out.println(myTruck.calculateTollPrice());

    Truck myTruck2 = new Truck("LM90LX", 20.0, 3, 5, false);
    System.out.println(myTruck2.calculateTollPrice());

    // the way toll price is calculated for a Vehicle
    // shouldn't have changed
    Vehicle myVehicle2 = new Vehicle("TR987", 10.0, 6);
    System.out.println(myVehicle2.calculateTollPrice());

    Taxi myTaxi = new Taxi("TR987", 10.0, 6, true, 7);
    System.out.println(myTaxi.calculateTollPrice());
  }
}