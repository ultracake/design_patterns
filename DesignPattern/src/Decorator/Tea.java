package Decorator;

//The concrete object class
public class Tea extends Drink
{
    public Tea()
    {
        name = "Tea";
    }

    @Override
    public float cost()
    {
        return 10.5f;
    }
}
