package Flyweight;

import java.util.HashMap;

// Class uses hashmap, if the hashmap doesn´t have it creates a new character
public class PlayerFactory
{
    // HashMap stores Terrorist or CounterTerrorist
    private HashMap <String, Character> playerHashMap = new HashMap<String, Character>();
    // Method to get a player
    public Character getPlayer(String type)
    {
        Character character = null;
        //If exist, it just get the character
        if (playerHashMap.containsKey(type))
        {
            character = playerHashMap.get(type);
        }
        //If the hashmap doesn´t have it creates it
        else
        {
            switch(type)
            {
                case "Terrorist":
                    System.out.println("Terrorist Created");
                    character = new Terrorist();
                    break;
                case "CounterTerrorist":
                    System.out.println("Counter Terrorist Created");
                    character = new CounterTerrorist();
                    break;
                default :
                    System.out.println("Unreachable code!");
            }
            // Once created insert it into the HashMap
            playerHashMap.put(type, character);
        }
        return character;
    }
}