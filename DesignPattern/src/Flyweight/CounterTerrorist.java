package Flyweight;

public class CounterTerrorist implements Character
{
    // Intrinsic Attribute
    private final String Task;

    // Extrinsic Attribute
    private String weapon;

    public CounterTerrorist()
    {
        Task = "Protect the cake with life";
    }

    public void assignWeapon(String weapon)
    {
        this.weapon = weapon;
    }

    public void mission()
    {
        System.out.println("Counter Terrorist weapon: " + weapon + " | " + " Task: " + Task);
    }
}
