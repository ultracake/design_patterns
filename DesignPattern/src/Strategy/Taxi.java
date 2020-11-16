package Strategy;

public class Taxi implements ContextStrategy
{
    @Override
    public void transport(int time, int price)
    {
        if(time < 10 || price < 300)
        {
            System.out.println("- you can´t get a ride for that time or price");
        }else
        {
            System.out.println("- let´s race to that destination");
        }
    }
}
