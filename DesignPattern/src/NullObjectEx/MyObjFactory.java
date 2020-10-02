package NullObjectEx;

public class MyObjFactory
{
    public static final String[] names = {"Strawberry", "Vanilla", "Chocolate"};

    public static AbstractObject getOject(String name)
    {
        for (int i = 0; i < names.length; i++)
        {
            if (names[i].equalsIgnoreCase(name))
            {
                return new RealObject(name);
            }
        }
        return new MyNullObject();
    }
}
