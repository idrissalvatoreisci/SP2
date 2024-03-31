import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in); // scanner object

        OptionsMenu optionsMenu1 = new OptionsMenu();
        optionsMenu1.startMenu();

        String userChoice = input.nextLine();


        switch (userChoice)
        {
            case "1": // see car inventory
                FleetOfCars carInventory = new FleetOfCars();
                System.out.println("Currently there are : " + carInventory.getTotalCarsInFleet() + " cars in the inventory...");
                break;
            case "2": // add car to fleet
                FleetOfCars carFleet = new FleetOfCars();
                break;
            case "3":
                break;
            case "4":
                System.out.println("\n Pick one of the following: \n\n Create electric car \n\n Create diesel car \n\n Create gasoline car \n\n");

                Scanner carTypeInput = new Scanner(System.in);
                String carTypeChoice = carTypeInput.nextLine();

                // ELECTRIC CAR
                String fuelType = "electric"; // fuel type

                Scanner regFeeInput = new Scanner(System.in); // regristration fee
                System.out.println("Enter regristration fee for vehicle: ");
                int regFeeChoice = Integer.parseInt(regFeeInput.nextLine());

                Scanner batteryCapacityInput = new Scanner(System.in); // battery capacity
                System.out.println("Enter battery capacity for vehicle: ");
                int batteryCapacityChoice = Integer.parseInt(batteryCapacityInput.nextLine());

                Scanner maxRangeInKmInput = new Scanner(System.in); // maxrangeinkm
                System.out.println("Enter max range in km: ");
                int maxRangeInKmChoice = Integer.parseInt(maxRangeInKmInput.nextLine());

                Scanner whPrKmInput = new Scanner(System.in); // whprkm
                System.out.println("Enter wh pr km: ");
                int whPrKmChoice = Integer.parseInt(whPrKmInput.nextLine());

                Scanner makeOfCarInput = new Scanner(System.in);
                System.out.println("Enter make of car: ");
                String makeOfCarChoice = makeOfCarInput.nextLine();

                Scanner modelOfCarInput = new Scanner(System.in);
                System.out.println("Enter model of car: ");
                String modelOfCarChoice = modelOfCarInput.nextLine();

                Scanner numberOfDoorsInput = new Scanner(System.in);
                System.out.println("Enter number of doors: ");
                String numberOfDoorsChoice = numberOfDoorsInput.nextLine();

                Scanner registrationNumberInput = new Scanner(System.in);
                System.out.println("Enter registration number: ");
                String registrationNumberChoice = registrationNumberInput.nextLine();

                // GASOLINE CAR
                Scanner kilometerPerLitreInput = new Scanner(System.in);
                System.out.println("Enter kilometer per litre: ");
                String kilometerPerLitreChoice = String.valueOf(Integer.parseInt(kilometerPerLitreInput.nextLine()));

                Scanner fuelTypeInputGasoline = new Scanner(System.in);
                System.out.println("Enter fuel type: ");
                String fuelTypeChoiceGasoline = fuelTypeInputGasoline.nextLine();

                Scanner regFeeInputGasoline = new Scanner(System.in); // regristration fee
                System.out.println("Enter registration fee for vehicle: ");
                int regFeeChoiceGasoline = Integer.parseInt(regFeeInputGasoline.nextLine());


                if (carTypeChoice == "electric" || carTypeChoice == "Electric")
                {
                    ElectricCar carOne = new ElectricCar(fuelType, regFeeChoice, batteryCapacityChoice, maxRangeInKmChoice, whPrKmChoice);
                    carOne.setMakeOfCar(makeOfCarChoice);
                    carOne.setModelOfCar(modelOfCarChoice);
                    carOne.setNumberOfDoors(Integer.parseInt(numberOfDoorsChoice));
                    carOne.setRegistrationNumber(registrationNumberChoice);
                    System.out.println("You successfully created an electric car with registration number: " + carOne.getRegistrationNumber()
                            + " model: " + carOne.getModelOfCar() + " make: " + carOne.getMakeOfCar());
                }
                else if (carTypeChoice == "gasoline" || carTypeChoice == "Gasoline")
                {
                    GasolineCar carOne = new GasolineCar(kilometerPerLitreChoice, fuelTypeChoiceGasoline, regFeeChoiceGasoline);
                    System.out.println();
                }
                else
                {
                    DieselCar carOne = new DieselCar();
                    System.out.println();
                }

            default:
                System.out.println("Program exit (0) ....");
                break;



        }


        /*
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



        // PRINT TOTAL CARS IN FLEET
        System.out.println("Total size of fleet: " + carInventory.getTotalCarsInFleet()
        + " \nTotal registration fee for fleet: " + carInventory.getTotalRegistrationFeeForFleet());
        */

    }
}