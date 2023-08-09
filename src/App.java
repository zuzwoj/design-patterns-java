import java.util.ArrayList;
import Primary.Animal.Species;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Primary.Room> rooms = new ArrayList<Primary.Room>();
        ArrayList<Primary.Employee> employees = new ArrayList<Primary.Employee>();
        ArrayList<Primary.Animal> animals = new ArrayList<Primary.Animal>();
        Load(rooms, employees, animals);
    }

    public static void Load(ArrayList<Primary.Room> rooms, ArrayList<Primary.Employee> employees, ArrayList<Primary.Animal> animals) {
        employees.add(new Primary.Employee("Carl", "Folson"));
        employees.add(new Primary.Employee("Daisy", "Darren"));
        animals.add(new Primary.Animal("Bruteusz", 12, Species.Dog));
        animals.add(new Primary.Animal("Zdrajca", 14, Species.Cat));
        animals.add(new Primary.Animal("Robak", 3, Species.Otter));
        rooms.add(new Primary.Room(1));
        rooms.add(new Primary.Room(2));
        rooms.get(0).assignAnimal(animals.get(0));
        rooms.get(0).assignAnimal(animals.get(1));
        rooms.get(1).assignAnimal(animals.get(2));
        rooms.get(1).setResponsibleEmployee(employees.get(0));
        rooms.get(0).setResponsibleEmployee(employees.get(1));
    }
}