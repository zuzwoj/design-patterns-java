package Root.Interfaces;

public interface Animal {
    String getName();
    void setName(String name);
    int getAge();
    void setAge(int age);
    Root.Primary.Animal.Species getSpecies();
    void setSpecies(Root.Primary.Animal.Species species);
}