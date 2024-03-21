import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

        DieselCar dieselCar = new DieselCar(2000, "Diesel", 100000, true);
        dieselCar.setMakeOfCar("Audi");
        dieselCar.setModelOfCar("New");
        dieselCar.setNumberOfDoors(4);
        dieselCar.setRegistrationNumber("2DF434F");
        System.out.println(dieselCar.getRegistrationNumber());
        System.out.println(dieselCar.getMakeOfCar());
    }
}