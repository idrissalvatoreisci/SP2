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


    public void setRegistrationFee()
    {
        int rentPrice1 = 130; // mellem 20km/l og 50km/l så udlejningsadfgift = 130kr
        int price1 = 330 + rentPrice1;

        int rentPrice2 = 1390; // mellem 15km/l og 20km/l så udlejningsafgift = 1390kr
        int price2 = 1050 + rentPrice2;

        int rentPrice3 = 1850; // mellem 10km/l og 15km/l så udlejningsafgift = 1850kr
        int price3 = 2340 + rentPrice3;

        int rentPrice4 = 2770; // mellem 5km/l og 10km/l så udlejningsafgift = 2770kr
        int price4 = 5500 + rentPrice4;

        int rentPrice5 = 15260; // under 5km/l så udlejningsafgift = 15260kr
        int price5 = 10470 + rentPrice5;

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

    }

    public int getRegistrationFee()
    {
        return this.registrationFee;
    }

    // CLASS tilføjer her nye metoder
    public String hasParticleFilter()
    {
        return this.particleFilter;
    }

    public DieselCar(int kilometerPerLitre, String fuelType, int registrationFee, String particleFilter)
    {
        super(kilometerPerLitre);
        this.fuelType = fuelType;
        this.registrationFee = registrationFee;
        this.particleFilter = particleFilter;
    }

    @Override
    public String toString()
    {
        return "Following car is a " + this.fuelType + " and corresponding registration fee is: " + this.getRegistrationFee(); // returner bilen på en overskuelig måde
    }
}
