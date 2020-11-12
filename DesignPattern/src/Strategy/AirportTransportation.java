package Strategy;

public class AirportTransportation
{
    public static void main(String[] args)
    {
        ContextStrategy contextStrategy = new Plane();
        contextStrategy.transport(30,500);

        contextStrategy = new Taxi();
        contextStrategy.transport(20, 500);

        contextStrategy = new Bus();
        contextStrategy.transport(30, 50);

    }
}
