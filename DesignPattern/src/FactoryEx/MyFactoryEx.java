package FactoryEx;

public class MyFactoryEx
{
    //instantiate
    public final static MyFactoryEx mf = new MyFactoryEx();

    //get
    public static MyFactoryEx getMyFactory()
    {
        return mf;
    }

    //constructor
    private MyFactoryEx()
    {
        //do stuff
    }

    //use getFood method to get object of food type
    public Food getFood(String foodType)
    {
        if (foodType == null)
        {
            return null;
        }
        if (foodType.equalsIgnoreCase("Cake")) {
            return new Cake();

        } else if (foodType.equalsIgnoreCase("Bread"))
        {
            return new Buns();
        }
        return null;
    }
}
