import Abstract_Factory.AnimalWorld;
import Abstract_Factory.Carnivore;
import Abstract_Factory.ContinentAbstractFactory;
import FactoryEx.Food;
import FactoryEx.MyFactoryEx;
import NullObjectEx.*;

public class MainExecuter
{
    public static void main(String[] args)
    {
        // factoryTester();
        // nullObjectTester();
        abstractFactoryTester();
    }

    public static void factoryTester()
    {
        MyFactoryEx myFactoryEx = MyFactoryEx.getMyFactory();

        //get an object of Cake and call its describe method.
        Food food1 = myFactoryEx.getFood("Cake");
        food1.describe();

        //get an object of Buns and call its describe method.
        Food food2 = myFactoryEx.getFood("Bread");
        food2.describe();

    }

    //show if the needs to be a null-obj or real-obj from the factory
    public static void nullObjectTester()
    {
        AbstractObject obj1 = MyObjFactory.getOject("Strawberry");
        AbstractObject obj2 = MyObjFactory.getOject("Citrus");
        AbstractObject obj3 = MyObjFactory.getOject("Vanilla");
        AbstractObject obj4 = MyObjFactory.getOject("Apple");

        System.out.println("Objects:");
        System.out.println(obj1.getName());
        System.out.println(obj2.getName());
        System.out.println(obj3.getName());
        System.out.println(obj4.getName());
    }

    //creates a factory after continent of choice, the factories can create animals
    public static void abstractFactoryTester()
    {
        ContinentAbstractFactory animalFactory_America = AnimalWorld.getFactory("africa");
        Carnivore animal = animalFactory_America.createCarnivore("bob");
        animal.hunt();
    }
}
