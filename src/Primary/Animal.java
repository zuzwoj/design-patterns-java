package Primary;

public class Animal extends Comparables.Animal {
    public String name;
    public int age;

    public Animal(String n, int a)
    {
        name = n;
        age = a;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public void setName(String newName) { name = newName; }
    public void setAge(int newAge) { age = newAge; }
}