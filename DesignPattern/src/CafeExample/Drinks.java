package CafeExample;

public abstract class Drinks implements Item
{
    @Override
    public Packing packing()
    {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
