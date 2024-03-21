public abstract class AFuelCar extends ACar
{
    // CLASS tilføjer her to nye metoder
    abstract String getFuelType(); // should return “Gasoline” or “Diesel”

    abstract int kmPrLitre(); //  should return how many kilometres the car can drive on 1 litre of fuel

    int kilometerPerLitre;

    public AFuelCar(int kilometerPerLitre)
    {
        this.kilometerPerLitre = kilometerPerLitre;
    }

    // OBS: Her er det et krav, at metoderne bliver overridet, da de nedarves fra en ABSTRACT CLASS
    @Override
    public String getRegistrationNumber()
    {
        return this.registrationNumber;
    }

    @Override
    public String getMake() {
        return this.makeOfCar;
    }

    @Override
    public String getModel() {
        return this.modelOfCar;
    }

    @Override
    public int getNumberofDoors() {
        return this.numberOfDoors;
    }

    @Override
    public int getRegistrationFee() {
        return 0;
    }
}
