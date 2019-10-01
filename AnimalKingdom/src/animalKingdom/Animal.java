package animalKingdom;

public abstract class Animal {
    public static int maxId = 0;

    public int id;
    public String name;
    public int year;
    public int energy;

    public Animal(String name, int year) {
        maxId++;
        id = maxId;

        this.name = name;
        this.year = year;
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
