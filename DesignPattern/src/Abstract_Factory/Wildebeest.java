package Abstract_Factory;

public class Wildebeest implements Herbivore{
    String name;

    public Wildebeest(String name){
        this.name = name;
    }

    @Override
    public void hide() {
        System.out.println("My name is: " + name + "\nI´m Wildebeest" + "\nGonna hide behind this tree");
    }
}
