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
        int price4 = 550; // 5km/l og 10km/l
        int price5 = 10470; // under 5km/l

        if (kilometerPerLitre >= 20 && kilometerPerLitre <= 50)
        {
            this.registrationFee = price1;
        }
        else if (kilometerPerLitre >= 15 && kilometerPerLitre <= 20)
        {
            this.registrationFee = price2;
        }
        else if (kilometerPerLitre >= 10 && kilometerPerLitre <= 15)
        {
            this.registrationFee = price3;
        }
        else if (kilometerPerLitre >= 5 && kilometerPerLitre <= 10)
        {
            this.registrationFee = price4;
        }
        else
        {
            this.registrationFee = price5;
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
        return "Fuel type of car is: "  + this.getFuelType(); // returner bilen på en overskuelig måde
    }

}
