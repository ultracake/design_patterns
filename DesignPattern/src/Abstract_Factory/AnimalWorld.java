package Abstract_Factory;

public class AnimalWorld
{
    public static ContinentAbstractFactory getFactory(String continent)
    {
        if(continent.equalsIgnoreCase("America"))
        {
            return America_Factory.getMyFactory();
        }
        if(continent.equalsIgnoreCase("Africa"))
        {
            return Africa_Factory.getMyFactory();
        }
        else
        {
            return Null_ContinentFactory.getMyFactory();
        }
    }
}
