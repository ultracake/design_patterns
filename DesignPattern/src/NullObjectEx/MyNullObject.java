package NullObjectEx;

public class MyNullObject extends AbstractObject
{
    @Override
    public String getName()
    {
        return "This object is empty";
    }

    @Override
    public boolean isNull()
    {
        return true;
    }
}
