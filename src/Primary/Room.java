package Primary;
import java.util.List;

public class Room extends Comparables.Room {
    public int number;
    public List<Primary.Animal> animals;
    public Primary.Employee responsibleEmployee;

    public Room(int number) { this.number = number; }
    public void assignAnimal(Primary.Animal animal){ animals.add(animal); }
    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }
    public void setResponsibleEmployee(Primary.Employee employee) { responsibleEmployee = employee; }
}