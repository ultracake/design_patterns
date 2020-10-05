package Abstract_Factory;

public class Lion implements Carnivore{
    String name;

    public Lion(String name)
    {
        this.name = name;
    }

    @Override
    public void hunt(){
        System.out.println("My name is: " + name + "\nI´m lion" + "\nGonna go for some fast food");
    }
}
