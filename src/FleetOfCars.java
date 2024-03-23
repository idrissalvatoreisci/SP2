import java.util.ArrayList;

public class FleetOfCars
{
    // GLOBAL SCOPE
    ArrayList<Car> fleetOfCars = new ArrayList<>();

    public  void addCarsToFleet(Car car)
    {
        fleetOfCars.add(car);
    }

    public int getTotalCarsInFleet()
    {
        return fleetOfCars.size();
    }

    public  int getTotalRegistrationFeeForFleet() // Beregn den samlede registreringsafgift for hele bilflåden
    {
        int totalReg = 0;
        System.out.println("Calculating total amount of registration fee....");
        for (int i = 0;i<fleetOfCars.size();i++)
        {
            totalReg += fleetOfCars.get(i).getRegistrationFee();
        }
        return totalReg;
    }

    @Override
    public String toString()
    {
    return "Car company X has following cars in their inventory: " + this.getTotalCarsInFleet()
            + " and the total registration fee for said cars are: " + this.getTotalRegistrationFeeForFleet();
    }
}
