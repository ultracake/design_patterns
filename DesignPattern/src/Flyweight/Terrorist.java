package Flyweight;

public class Terrorist implements Character
{
    // Intrinsic Attribute
    private final String Task;

    // Extrinsic Attribute
    private String weapon;

    public Terrorist()
    {
        Task = "Rush B and destroy the cake";
    }

    public void assignWeapon(String weapon)
    {
        this.weapon = weapon;
    }

    public void mission()
    {
        System.out.println("Terrorist weapon: " + weapon + " | " + " Task: " + Task);
    }
}
