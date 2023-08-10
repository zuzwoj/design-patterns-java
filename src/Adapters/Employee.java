package Adapters;

public class Employee extends Comparables.Employee {
    Secondary.Employee adaptee;
    public Employee(Secondary.Employee adaptee) { this.adaptee = adaptee; }
    public String getName() { return adaptee.Map.get("name"); }
    public void setName(String name) { adaptee.Map.replace("name", name); }
    public String getSurame() { return adaptee.Map.get("surname"); }
    public void setSurame(String surname) { adaptee.Map.replace("surname", surname); }
}