public abstract class ACar implements Car
{
    String registrationNumber;
    String makeOfCar;
    String modelOfCar;
    int numberOfDoors;


    // INTERFACE METODER
    // (OBS: disse metoder behøves ikke at blive OVERRIDET! Det er kun et krav, at de bliver brugt
    public String getRegistrationNumber()
    {
        return null;
    }

    public String getMake()
    {
        return null;
    }

    public String getModel()
    {
        return null;
    }

    public int getNumberofDoors()
    {
        return 0;
    }

    public int getRegistrationFee()
    {
        return 0;
    }



}
