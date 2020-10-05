package Abstract_Factory;

public class Wolf implements Carnivore
{
    String name;

    public Wolf(String name)
    {
        this.name = name;
    }

    @Override
    public void hunt()
    {
        System.out.println("My name is: " +name+ "\nI´m wolf" + "\nGonna go for some food");
    }
}
