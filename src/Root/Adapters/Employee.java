package Root.Adapters;

public class Employee extends Root.Comparables.Employee {
    Root.Secondary.Employee adaptee;
    public Employee(Root.Secondary.Employee adaptee) { this.adaptee = adaptee; }
    public String getName() { return adaptee.Map.get("name"); }
    public void setName(String name) { adaptee.Map.replace("name", name); }
    public String getSurname() { return adaptee.Map.get("surname"); }
    public void setSurname(String surname) { adaptee.Map.replace("surname", surname); }
    public Root.Interfaces.Object clone() { return new Employee(new Root.Secondary.Employee(getName(), getSurname())); }
}