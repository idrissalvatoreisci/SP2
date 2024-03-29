import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // CAR ONE
        DieselCar dieselCar = new DieselCar(2000, "Diesel", 200, true);
        dieselCar.setMakeOfCar("Audi");
        dieselCar.setModelOfCar("New");
        dieselCar.setNumberOfDoors(4);
        dieselCar.setRegistrationNumber("2DF434F");
        System.out.println("km per litre: ");
        System.out.println(dieselCar.kmPrLitre());
        System.out.println("Fuel type for diesel car 1: ");
        System.out.println(dieselCar.getFuelType());

        System.out.println(dieselCar.getModelOfCar());
        System.out.println(dieselCar.getNumberofDoors());
        System.out.println(dieselCar.getRegistrationNumber());
        System.out.println(dieselCar.getMakeOfCar());
        System.out.println("reg fee for car one:");
        System.out.println(dieselCar.getRegistrationFee());

        // CAR TWO
        DieselCar dieselCar2 = new DieselCar(2, "Diesel", 10, false);
        dieselCar2.setMakeOfCar("BMW");
        dieselCar2.setModelOfCar("Old");
        dieselCar2.setNumberOfDoors(5);
        dieselCar2.setRegistrationNumber("POTTER");

        // ADDING CARS TO FLEET
        FleetOfCars carInventory = new FleetOfCars();
        carInventory.addCarsToFleet(dieselCar);
        carInventory.addCarsToFleet(dieselCar2);
        //System.out.println(carInventory.getTotalRegistrationFeeForFleet());

        OptionsMenu Menu = new OptionsMenu();

        // PRINT TOTAL CARS IN FLEET
        System.out.println("Total size of fleet: " + carInventory.getTotalCarsInFleet()
        + " \nTotal registration fee for fleet: " + carInventory.getTotalRegistrationFeeForFleet());


    }
}