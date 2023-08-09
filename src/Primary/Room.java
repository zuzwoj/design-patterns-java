package Primary;
import java.util.ArrayList;

public class Room extends Comparables.Room {
    private int number;
    private ArrayList<Primary.Animal> animals = new ArrayList<Primary.Animal>();
    private Primary.Employee responsibleEmployee;

    public Room(int number) { this.number = number; }
    public void assignAnimal(Primary.Animal animal) { animals.add(animal); }
    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }
    public void setResponsibleEmployee(Primary.Employee employee) { responsibleEmployee = employee; }
    public Primary.Employee getResponsibleEmployee() { return responsibleEmployee; }
}