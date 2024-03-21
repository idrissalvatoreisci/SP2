public class ElectricCar extends ACar
{
    int batteryCapacity;
    int maxRangePerKm;
    String fuelType;
    int registrationFee;
    int whPrKm;


    // Class tilføjer nye metoder
    public int getBatteryCapacityKWh() // returns the battery capacity in kilowatt hours
    {
        return this.batteryCapacity;
    }

    public int getMaxRangeKm() // returns the maximum range in kilometres.
    {
        return this.maxRangePerKm;
    }

    public int getWhPrkm() // returns the power consumption in watt hours per driven kilometre.
    {
        return this.whPrKm;
    }

    // CONSTRUCTOR
    public ElectricCar(String fuelType, int reigstrationFee, int batteryCapacity, int maxRangePerKm, int whPrKm)
    {
        this.fuelType = fuelType;
        this.registrationFee = reigstrationFee;
        this.batteryCapacity = batteryCapacity;
        this.maxRangePerKm = maxRangePerKm;
        this.whPrKm = whPrKm;

    }

    @Override
    public String toString()
    {
        return ""; // returner bilen på en overskuelig måde
    }
}
