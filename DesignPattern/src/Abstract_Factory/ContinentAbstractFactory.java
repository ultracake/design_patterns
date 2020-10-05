package Abstract_Factory;

public interface ContinentAbstractFactory
{
    Herbivore createHerbivore(String name);

    Carnivore createCarnivore(String name);
}
