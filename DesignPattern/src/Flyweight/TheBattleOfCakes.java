package Flyweight;

import java.util.Random;

//Example code, to show flywieght so it´s for show not practice!!!
public class TheBattleOfCakes
{
    // variables to the player
    private static String[] playerType = {"Terrorist", "CounterTerrorist"};
    private static String[] weapons = {"paw destroyer", "paw paw gun", "killer Knife", "Desert ice-beam"};

    private static PlayerFactory playerFactory = new PlayerFactory();

    // Driver code
    public static void main(String args[])
    {
        //loop to make 8 players
        for (int i = 0; i < 8; i++)
        {
            //creates random players
            Character player = playerFactory.getPlayer(getRandPlayerType());

            /* Assign a weapon chosen randomly uniformly
               from the weapon array  */
            player.assignWeapon(getRandWeapon());

            // Send this player on a mission
            player.mission();
        }
    }

    // Gets random player
    public static String getRandPlayerType()
    {
        Random r = new Random();

        // Will return an integer between (0,2) 2 different players
        int randInt = r.nextInt(playerType.length);

        // Return the player type after random int
        return playerType[randInt];
    }

    // Gets random weapon
    public static String getRandWeapon()
    {
        Random r = new Random();

        // Will return an int between (0,5) 5 different weapons
        int randInt = r.nextInt(weapons.length);

        // Return the weapon after the random int
        return weapons[randInt];
    }
}
