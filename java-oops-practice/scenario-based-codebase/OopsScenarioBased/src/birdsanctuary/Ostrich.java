package birdsanctuary;

public class Ostrich extends Birds {

    public Ostrich(int id, String name) {
        super(id, name, "Ostrich");
    }

    @Override
    public void displayInfo() {
        System.out.println("Kiwi | ID: " + id + " | Name: " + name);
    }
}