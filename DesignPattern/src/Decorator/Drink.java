package Decorator;

public abstract class Drink
{
    String name = "a drink";

    public String getName()
    {
        return name;
    }

    public abstract float cost();
}
