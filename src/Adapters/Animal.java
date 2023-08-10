package Adapters;

public class Animal extends Comparables.Animal {
    Secondary.Animal adaptee;
    public Animal(Secondary.Animal adaptee) { this.adaptee = adaptee; }
    public String getName() { return adaptee.Map.get("name"); }
    public void setName(String name) { adaptee.Map.replace("name", name); }
    public int getAge() { return Integer.parseInt(adaptee.Map.get("age")); }
    public void setAge(int age) { adaptee.Map.replace("age", String.valueOf(age)); }
}