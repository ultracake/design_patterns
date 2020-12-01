package Decorator;

public class Sweetener extends DrinkDecorator
{
    private Drink d;

    public Sweetener(Drink d)
    {
        this.d = d;
    }

    @Override
    public String getName()
    {
        return d.getName() + ", sweet";
    }

    @Override
    public float cost()
    {
        return d.cost() + 2.2f;
    }
}
