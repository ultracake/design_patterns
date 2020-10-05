package Abstract_Factory;

public class Africa_Factory implements ContinentAbstractFactory
{
    //instantiate
    private static Africa_Factory mf;

    //get
    public static Africa_Factory getMyFactory()
    {
        if (mf == null){
            mf = new Africa_Factory();
        }
        return mf;
    }

    //constructor
    private Africa_Factory()
    {
        //do stuff
    }

    @Override
    public Herbivore createHerbivore(String name)
    {
        return new Wildebeest(name);
    }

    @Override
    public Carnivore createCarnivore(String name)
    {
        return new Lion(name);
    }

}
