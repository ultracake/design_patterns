package Strategy;

public class Plane implements ContextStrategy
{
    @Override
    public void transport(int time, int price)
    {
        if(time < 60 || price < 500)
        {
            System.out.println("you can´t get a plane for that time or price");
        }else
        {
            System.out.println("lets fly mate");
        }
    }
}
