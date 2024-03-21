public class GasolineCar extends AFuelCar
{
    String fuelType;
    int registrationFee;

    @Override
    public String getFuelType()
    {
        return this.fuelType;
    }

    @Override
    public int kmPrLitre()
    {
        return this.kilometerPerLitre;
    }

    @Override
    public int getRegistrationFee()
    {
        int price1 = 330; // mellem 20km/l og 50km/l
        int price2 = 1050; // mellem 15km/l og 20km/l
        int price3 = 2340; // mellem 5km/l og 10km/l

        if (kilometerPerLitre >= 20 && kilometerPerLitre <= 50)
        {
            this.registrationFee = price1;
        }
        else if (kilometerPerLitre >= 15 && kilometerPerLitre <= 20)
        {
            this.registrationFee = price2;
        }
        else
        {
            this.registrationFee = price3;
        }
        return this.registrationFee;
    }

    // CONSTRUCTOR
    public GasolineCar(int kilometerPerLitre, String fuelType, int registrationFee)
    {
        super(kilometerPerLitre);
        this.fuelType = fuelType;
        this.registrationFee = registrationFee;
    }

    @Override
    public String toString()
    {
        return ""; // returner bilen på en overskuelig måde
    }

}
