package Facade;

public class Cakeshop implements Mall_Info_Interface
{
    @Override
    public void getDesciption()
    {
        System.out.println("sells awesome cakes");
    }

    @Override
    public void getMenu()
    {
        System.out.println("1) Choco cake \n2) Berry cake");
    }
}
