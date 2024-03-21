import java.util.ArrayList;

public class FleetOfCars
{
    // GLOBAL SCOPE
    ArrayList<Car> fleetOfCars = new ArrayList<>();

    public static void main(String[] args)
    {
        DieselCar dieselCar = new DieselCar(1000, "Diesel", 100000, true);

        GasolineCar gasolineCar = new GasolineCar(1000, "Gasoline", 150000);

        ElectricCar electricCar = new ElectricCar("Electric", 50000, 200, 200, 200);

        
    }

    public  void createCars()
    {
        DieselCar dieselCar = new DieselCar(1000, "Diesel", 100000, true);

        GasolineCar gasolineCar = new GasolineCar(1000, "Gasoline", 150000);

        ElectricCar electricCar = new ElectricCar("Electric", 50000, 200, 200, 200);
    }
    public void addCarsToFleet(Car car)
    {
        fleetOfCars.add(car);
    }

    public int getTotalRegistrationFeeForFleet() // Beregn den samlede registreringsafgift for hele bilflåden
    {
        int totalReg = 0;
        System.out.println("Calculating total amount of registration fee....");
        for (Car c : fleetOfCars)
        {
            totalReg += c.getRegistrationFee();
        }
        return totalReg;
    }

    @Override
    public String toString()
    {
        return "";
    }
}
