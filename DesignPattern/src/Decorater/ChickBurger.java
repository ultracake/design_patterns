package Decorater;

public class ChickBurger extends Burger
{
    @Override
    public String name()
    {
        return "Chicken Burger";
    }

    @Override
    public float price()
    {
        return 60;
    }
}
