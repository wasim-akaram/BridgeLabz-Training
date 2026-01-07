package petpal;

public class Main
{

    public static void main(String[] args) {

        Pet pet1 = new Dog("Buddy", 3);
        Pet pet2 = new Cat("Luna", 2);
        Pet pet3 = new Bird("Kiwi", 1);

        // Polymorphism
        pet1.makeSound();
        pet2.makeSound();
        pet3.makeSound();

        pet1.feed();
        pet2.play();
        pet3.sleep();

        System.out.println("Buddy Mood: " + pet1.getMood());
        System.out.println("Luna Energy: " + pet2.getEnergy());
        System.out.println("Kiwi Hunger: " + pet3.getHunger());
    }
}
