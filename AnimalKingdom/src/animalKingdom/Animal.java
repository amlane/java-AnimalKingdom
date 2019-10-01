package animalKingdom;

public abstract class Animal {
    public static int maxId = 0;

    protected int id;
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

    public abstract String getName();

    public abstract int getYear();

    public void eat(int i) {
        energy = energy + i;
    }

    public int getEnergyLevel() {
        return energy;
    }
}
