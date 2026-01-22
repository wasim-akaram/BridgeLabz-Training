package birdsanctuary;

public class Seagull extends Birds implements IFlyable, ISwimmable {

    public Seagull(int id, String name) {
        super(id, name, "Seagull");
    }

    @Override
    public void fly() {
        System.out.println(name + " flies over the ocean.");
    }

    @Override
    public void swim() {
        System.out.println(name + " floats on seawater.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Seagull | ID: " + id + " | Name: " + name);
    }
}