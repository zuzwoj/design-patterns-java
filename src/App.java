import java.io.Console;
import java.util.ArrayList;
import java.util.Dictionary;
import Primary.Animal.Species;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        // create objects
        ArrayList<Primary.Room> rooms = new ArrayList<Primary.Room>();
        ArrayList<Primary.Employee> employees = new ArrayList<Primary.Employee>();
        ArrayList<Primary.Animal> animals = new ArrayList<Primary.Animal>();
        Load(rooms, employees, animals);

        // add objects to collections
        // Collections.DoublyLinkedList<Interfaces.Object> room = new Collections.DoublyLinkedList<Interfaces.Object>();
        // Collections.DoublyLinkedList<Interfaces.Object> employee = new Collections.DoublyLinkedList<Interfaces.Object>();
        // Collections.DoublyLinkedList<Interfaces.Object> animal = new Collections.DoublyLinkedList<Interfaces.Object>();
        // for (var rom :  rooms) room.addObject(rom);
        // for (var emp : employees) employee.addObject(emp);
        // for (var ani : animals) animal.addObject(ani);
        // HashMap<String, Interfaces.Collection<Interfaces.Object>> map = new HashMap<String, Interfaces.Collection<Interfaces.Object>>();
        // map.put("room", (Interfaces.Collection<Interfaces.Object>)room);
        // map.put("employee", (Interfaces.Collection<Interfaces.Object>)employee);
        // map.put("animal", (Interfaces.Collection<Interfaces.Object>)animal);

        // start the program loop 
        var p = new Processor(/*map*/);
        String arg;
        for (;;) {
            //arg = Console.ReadLine();
            //p.Process(arg.split(" "));
        }
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