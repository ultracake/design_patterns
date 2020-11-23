package CafeExample;

public class VegBurger extends Burger
{
    @Override
    public String name()
    {
        return "Veggie Burger";
    }

    @Override
    public float price()
    {
        return 50;
    }
}
