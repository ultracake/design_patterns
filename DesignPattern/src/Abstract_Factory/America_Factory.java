package Abstract_Factory;

public class America_Factory implements ContinentAbstractFactory
{
    //instantiate
    private static America_Factory mf;

    //get
    public static America_Factory getMyFactory()
    {
        if (mf == null){
            mf = new America_Factory();
        }
        return mf;
    }

    //constructor
    private America_Factory()
    {
        //do stuff
    }

    @Override
    public Herbivore createHerbivore(String name)
    {
        return new Bison(name);
    }

    @Override
    public Carnivore createCarnivore(String name)
    {
        return new Wolf(name);
    }
}
