package Root.Primary;
import java.util.ArrayList;

public class Room extends Root.Comparables.Room {
    private int number;
    private ArrayList<Root.Primary.Animal> animals = new ArrayList<Root.Primary.Animal>();
    private Root.Primary.Employee responsibleEmployee;

    public Room(int number) { this.number = number; }
    public void assignAnimal(Root.Primary.Animal animal) { animals.add(animal); }
    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }
    public void setResponsibleEmployee(Root.Primary.Employee employee) { responsibleEmployee = employee; }
    public Root.Primary.Employee getResponsibleEmployee() { return responsibleEmployee; }
    public int getAnimalsCount() { return animals.size(); }
    public void setResponsibleEmployee(String employee) { }

    public Root.Interfaces.Object clone() { 
        Room copy = new Room(getNumber());
        copy.setResponsibleEmployee(getResponsibleEmployee());
        for (Root.Primary.Animal elem : animals) copy.assignAnimal(elem);
        return copy;
    }
}