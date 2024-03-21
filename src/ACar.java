public abstract class ACar implements Car
{
    String registrationNumber;
    String makeOfCar;
    String modelOfCar;
    int numberOfDoors;


    // INTERFACE METODER
    // (OBS: disse metoder behøves ikke at blive OVERRIDET! Det er kun et krav, at de bliver brugt


    // GETTERS
    public String getRegistrationNumber()
    {
        return this.registrationNumber;
    }

    public String getMakeOfCar()
    {
        return this.makeOfCar;
    }

    public String getModelOfCar()
    {
        return this.modelOfCar;
    }

    public int getNumberofDoors()
    {
        return this.numberOfDoors;
    }

    public int getRegistrationFee()
    {
        return 0;
    }





}
