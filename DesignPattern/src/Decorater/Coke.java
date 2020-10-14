package Decorater;

public class Coke extends Drinks
{
    @Override
    public String name()
    {
        return "Coke";
    }

    @Override
    public float price()
    {
        return 30;
    }
}
