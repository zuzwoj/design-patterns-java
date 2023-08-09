package Primary;

public class Animal extends Comparables.Animal {
    public enum Species { Dog, Cat, Otter }

    private String name;
    private int age;
    private Species species;

    public Animal(String n, int a, Species s)
    {
        name = n;
        age = a;
        species = s;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public void setName(String newName) { name = newName; }
    public void setAge(int newAge) { age = newAge; }
    public Species getSpecies() { return species; }
    public void setSpecies(Species s) { species = s; }
}