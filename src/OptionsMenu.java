import java.util.ArrayList;
import java.util.Scanner;
public class OptionsMenu
{
    public void startMenu()
    {
        Scanner input = new Scanner(System.in);
        String userChoice = input.nextLine();

        System.out.println("\n 1: See full inventory of cars");
        System.out.println("\n 2: Add car to fleet");
        System.out.println("\n 3: See full car specifications");
        System.out.println("\n 4: Create an electric car");
        System.out.println("\n 5: Create a gasoline car");
        System.out.println("\n 6: Create a diesel car");
        System.out.println("\n\nchoose an option... \n\n");

        // OPTION 4
        switch (userChoice)
        {
            case "1":
                FleetOfCars carInventory = new FleetOfCars();
                System.out.println("Currently there are " + carInventory.getTotalCarsInFleet() + " cars in the inventory.");
                break;
            case "2":
                FleetOfCars addToInventory = new FleetOfCars();
                break;
            case 3:
                break;
            case "4":
                createCars();
                break;

        }
    }

    public void createElectricCar()
    {
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


        ElectricCar carOne = new ElectricCar(fuelType, regFeeChoice, batteryCapacityChoice, maxRangeInKmChoice, whPrKmChoice);
        carOne.setMakeOfCar(makeOfCarChoice);
        carOne.setModelOfCar(modelOfCarChoice);
        carOne.setNumberOfDoors(Integer.parseInt(numberOfDoorsChoice));
        carOne.setRegistrationNumber(registrationNumberChoice);
        System.out.println("You successfully created an electric car with registration number: " + carOne.getRegistrationNumber()
                + " model: " + carOne.getModelOfCar() + " make: " + carOne.getMakeOfCar());

    }

    public  void createGasolineCar()
    {
        // GASOLINE CAR
        Scanner kilometerPerLitreInputGasoline = new Scanner(System.in);
        System.out.println("Enter kilometer per litre: ");
        int kilometerPerLitreChoiceGasoline = Integer.parseInt(kilometerPerLitreInputGasoline.nextLine());

        Scanner fuelTypeInputGasoline = new Scanner(System.in);
        System.out.println("Enter fuel type: ");
        String fuelTypeChoiceGasoline = fuelTypeInputGasoline.nextLine();

        Scanner regFeeInputGasoline = new Scanner(System.in); // regristration fee
        System.out.println("Enter registration fee for vehicle: ");
        int regFeeChoiceGasoline = Integer.parseInt(regFeeInputGasoline.nextLine());

        GasolineCar carOne = new GasolineCar(kilometerPerLitreChoiceGasoline, fuelTypeChoiceGasoline, regFeeChoiceGasoline);
        System.out.println();
    }

    public void createDieselCar()
    {
        // DIESEL CAR
        Scanner kilometerPerLitreInputDiesel = new Scanner(System.in);
        System.out.println("Enter kilometer per litre: ");
        int kilometerPerLitreChoiceDiesel = Integer.parseInt(kilometerPerLitreInputDiesel.nextLine());

        String fuelTypeDiesel = "Diesel";

        Scanner regFeeInputDiesel = new Scanner(System.in);
        System.out.println("Enter reg fee: ");
        int regFeeChoiceDiesel = Integer.parseInt(regFeeInputDiesel.nextLine());

        Scanner particleFilterInput = new Scanner(System.in);
        System.out.println("Does the car have a particle filter? [true/false]: ");
        String particleFilterChoice = particleFilterInput.nextLine();

        DieselCar carOne = new DieselCar(kilometerPerLitreChoiceDiesel, fuelTypeDiesel, regFeeChoiceDiesel, particleFilterChoice);
        System.out.println();
    }

    public void createCars()
    {
        Scanner input = new Scanner(System.in);
        String userChoice = input.nextLine();

        switch (userChoice)
        {
            case "electric":
                createElectricCar();
                break;
            case "gasoline":
                createGasolineCar();
                break;
            case "diesel":
                createDieselCar();
                break;
        }
    }
}
