package birdsanctuary;

public abstract class Birds {
    protected String name;
    protected String species;
    protected int id;

    public Birds(int id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }

    public void eat() {
        System.out.println(name + " (" + species + ") is eating.");
    }

    public abstract void displayInfo();
}