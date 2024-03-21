public class ElectricCar extends ACar
{
    int batteryCapacity;
    int maxRangeinKm;
    String fuelType;
    int registrationFee;
    int whPrKm;


    // Class tilføjer nye metoder
    public String getFuelType()
    {
        return  this.fuelType;
    }

    public int getRegistrationFee(int fee)
    {
        // calculation
        int sum = 0;
        double d = 91.25;
        sum = fee / d;
        return this.registrationFee;
    }

    public int getBatteryCapacityKWh() // returns the battery capacity in kilowatt hours
    {
        return this.batteryCapacity;
    }

    public int getMaxRangeKm() // returns the maximum range in kilometres.
    {
        return this.maxRangeinKm;
    }

    public int getWhPrkm() // returns the power consumption in watt hours per driven kilometre.
    {
        return this.whPrKm;
    }

    // CONSTRUCTOR
    public ElectricCar(String fuelType, int reigstrationFee, int batteryCapacity, int maxRangeinKm, int whPrKm)
    {
        this.fuelType = fuelType;
        this.registrationFee = reigstrationFee;
        this.batteryCapacity = batteryCapacity;
        this.maxRangeinKm = maxRangeinKm;
        this.whPrKm = whPrKm;

    }

    @Override
    public String toString()
    {
        return ""; // returner bilen på en overskuelig måde
    }
}
