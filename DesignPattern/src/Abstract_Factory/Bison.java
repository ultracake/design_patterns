package Abstract_Factory;

public class Bison implements Herbivore {

    String name;

    public Bison(String name){
        this.name = name;
    }

    @Override
    public void hide() {
        System.out.println("My name is: " + name + "\nI´m Bison" + "\nGonna hide in this bush");
    }
}
