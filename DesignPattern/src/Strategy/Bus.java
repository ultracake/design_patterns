package Strategy;

public class Bus implements ContextStrategy
{
    @Override
    public void transport(int time, int price)
    {
        if(time < 20 || price < 35)
        {
            System.out.println("- you can´t get a ride for that time or price");
        }else
        {
            System.out.println("- let´s go budge mate");
        }
    }
}
