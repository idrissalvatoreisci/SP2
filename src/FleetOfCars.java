import java.util.ArrayList;

public class FleetOfCars
{
    // GLOBAL SCOPE
    ArrayList<Car> fleetOfCars = new ArrayList<>();

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
