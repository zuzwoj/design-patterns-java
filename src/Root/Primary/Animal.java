package Root.Primary;

public class Animal extends Root.Comparables.Animal {
    public enum Species { Dog, Cat, Otter }

    private String name;
    private int age;
    private Species species;

    public String getName() { return name; }
    public int getAge() { return age; }
    public void setName(String newName) { name = newName; }
    public void setAge(int newAge) { age = newAge; }
    public Species getSpecies() { return species; }
    public void setSpecies(Species s) { species = s; }
    public Root.Interfaces.Object clone() { return new Animal(getName(), getAge(), getSpecies()); }

    public Animal(String n, int a, Species s) {
        name = n;
        age = a;
        species = s;
    }
}