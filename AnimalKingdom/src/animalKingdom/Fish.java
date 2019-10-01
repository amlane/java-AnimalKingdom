package animalKingdom;

public class Fish extends Animal {
    private String name;
    private int year;

    public Fish(String name, int year, int energy) {
        super(energy);
        this.name = name;
        this.year = year;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String move() {
        return "swim";
    }

    @Override
    public String breath() {
        return "gills";
    }

    @Override
    public String reproduce() {
        return "eggs";
    }

    @Override
    public String toString() {
        return "\nFish{ name: " + name + " Year Named: " + year + "}";
    }
}