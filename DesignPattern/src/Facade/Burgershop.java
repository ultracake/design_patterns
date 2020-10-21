package Facade;

public class Burgershop implements Mall_Info_Interface
{
    @Override
    public void getDesciption()
    {
        System.out.println("sells giga burgers");
    }

    @Override
    public void getMenu()
    {
        System.out.println("1) Beef burger \n2) Vegan burger");
    }
}
