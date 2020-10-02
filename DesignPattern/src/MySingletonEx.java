public class MySingletonEx
{
    //instantiate
    public final static MySingletonEx ms = new MySingletonEx();

    //get
    public static MySingletonEx getMySingleton()
    {
        return ms;
    }

    //constructor
    private MySingletonEx()
    {
        //your stuff
    }
}

