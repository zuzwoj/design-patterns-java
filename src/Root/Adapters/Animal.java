package Root.Adapters;
import Root.Primary.Animal.Species;

public class Animal extends Root.Comparables.Animal {
    Root.Secondary.Animal adaptee;
    public Animal(Root.Secondary.Animal adaptee) { this.adaptee = adaptee; }
    public String getName() { return adaptee.Map.get("name"); }
    public void setName(String name) { adaptee.Map.replace("name", name); }
    public int getAge() { return Integer.parseInt(adaptee.Map.get("age")); }
    public void setAge(int age) { adaptee.Map.replace("age", String.valueOf(age)); }
    public Species getSpecies() { return Root.Primary.Animal.Species.valueOf(adaptee.Map.get("species")); }
    public void setSpecies(Species species) { adaptee.Map.replace("species", species.toString()); }
}