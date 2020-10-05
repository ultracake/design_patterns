package Abstract_Factory;

public class Null_ContinentFactory implements ContinentAbstractFactory
{
    //instantiate
    private static Null_ContinentFactory mf;

    //get
    public static Null_ContinentFactory getMyFactory()
    {
        if (mf == null){
            mf = new Null_ContinentFactory();
        }
        return mf;
    }

    //constructor
    private Null_ContinentFactory()
    {
        //do stuff
    }
    @Override
    public Herbivore createHerbivore(String name)
    {
        return new Wildebeest("bob");
    }

    @Override
    public Carnivore createCarnivore(String name)
    {
        return new Lion("bob");
    }
}
