package NullObjectEx;

public class RealObject extends AbstractObject
{
    public RealObject(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public boolean isNull()
    {
        return false;
    }
}
