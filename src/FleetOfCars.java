import java.util.ArrayList;

public class FleetOfCars
{
    // GLOBAL SCOPE
    ArrayList<Car> FleetOfCars = new ArrayList<>();

    public static void main(String[] args)
    {

        DieselCar dieselCar = new DieselCar(1000, "Diesel", 100000, true);

        GasolineCar gasolineCar = new GasolineCar(1000, "Gasoline", 150000);

        ElectricCar electricCar = new ElectricCar("Electric", 50000, 200, 200, 200);

    }

    public void addCarsToFleet()
    {
        FleetOfCars.add(dieselCar);
        FleetOfCars.add(gasolineCar);
        FleetOfCars.add(electricCar);
    }

    public int getTotalRegistrationFeeForFleet() // Beregn den samlede registreringsafgift for hele bilflåden
    {
        return 0;
    }

    @Override
    public String toString()
    {
        return "";
    }
}
