package animalKingdom;

public abstract class Animal {
    public static int maxId = 0;

    public int id;
    protected int energy;

    public Animal(int energy) {
        maxId++;
        id = maxId;
        this.energy = energy;
    }

    // default constructor
    public Animal() {
        energy = 1;
    }

    public abstract String move();

    public abstract String breath();

    public abstract String reproduce();

    public void eat(int i) {
        energy = energy + i;
    }
}
