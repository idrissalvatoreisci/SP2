public class DieselCar extends AFuelCar
{

    String fuelType;
    int registrationFee;
    boolean particleFilter;

    //@Override
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
        int price1 = 130; // mellem 20km/l og 50km/l så udlejningsadfgift = 130kr
        int price2 = 1390; // mellem 15km/l og 20km/l så udlejningsafgift = 1390kr
        int price3 = 1850; // mellem 10km/l og 15km/l så udlejningsafgift = 1850kr
        int price4 = 2770; // mellem 5km/l og 10km/l så udlejningsafgift = 2770kr
        int price5 = 15260; // under 5km/l så udlejningsafgift = 15260kr

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

    // CLASS tilføjer her nye metoder
    public boolean hasParticleFilter()
    {
        return this.particleFilter;
    }

    public DieselCar(int kilometerPerLitre, String fuelType, int registrationFee, boolean particleFilter)
    {
        super(kilometerPerLitre);
        this.fuelType = fuelType;
        this.registrationFee = registrationFee;
        this.particleFilter = particleFilter;
    }

    @Override
    public String toString()
    {
        return ""; // returner bilen på en overskuelig måde
    }
}
