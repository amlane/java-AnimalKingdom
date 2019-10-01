package animalKingdom;

public class Mammals extends Animal {
    private String name;
    private int year;

    public Mammals(String name, int year, int energy) {
        super(energy);

        this.name = name;
        this.year = year;
    }

    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "live birth";
    }

    @Override
    public String toString() {
        return "Mammal{ name: " + name + "Year Named: " + year + "}";
    }
}