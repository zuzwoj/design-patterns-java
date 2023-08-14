package Root;
import java.util.ArrayList;
import Root.Primary.Animal.Species;
import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // create objects
        ArrayList<Root.Primary.Room> rooms = new ArrayList<Root.Primary.Room>();
        ArrayList<Root.Primary.Employee> employees = new ArrayList<Root.Primary.Employee>();
        ArrayList<Root.Primary.Animal> animals = new ArrayList<Root.Primary.Animal>();
        Load(rooms, employees, animals);

        // add objects to collections
        Root.Collections.DoublyLinkedList<Root.Interfaces.Object> room = new Root.Collections.DoublyLinkedList<Root.Interfaces.Object>();
        Root.Collections.DoublyLinkedList<Root.Interfaces.Object> employee = new Root.Collections.DoublyLinkedList<Root.Interfaces.Object>();
        Root.Collections.DoublyLinkedList<Root.Interfaces.Object> animal = new Root.Collections.DoublyLinkedList<Root.Interfaces.Object>();
        for (var rom :  rooms) room.addObject(rom);
        for (var emp : employees) employee.addObject(emp);
        for (var ani : animals) animal.addObject(ani);
        HashMap<String, Root.Interfaces.Collection<Root.Interfaces.Object>> map = new HashMap<String, Root.Interfaces.Collection<Root.Interfaces.Object>>();
        map.put("room", (Root.Interfaces.Collection<Root.Interfaces.Object>)room);
        map.put("employee", (Root.Interfaces.Collection<Root.Interfaces.Object>)employee);
        map.put("animal", (Root.Interfaces.Collection<Root.Interfaces.Object>)animal);

        // start the program loop 
        var p = new Processor(map);
        String arg;
        boolean status = true;
        Scanner in = new Scanner(System.in);
        while (status) {
            arg = in.nextLine();
            status = p.Process(arg.split(" "));
        }
        in.close();
    }

    public static void Load(ArrayList<Root.Primary.Room> rooms, ArrayList<Root.Primary.Employee> employees, ArrayList<Root.Primary.Animal> animals) {
        employees.add(new Root.Primary.Employee("Carl", "Folson"));
        employees.add(new Root.Primary.Employee("Daisy", "Darren"));
        animals.add(new Root.Primary.Animal("Bruteusz", 12, Species.Dog));
        animals.add(new Root.Primary.Animal("Zdrajca", 14, Species.Cat));
        animals.add(new Root.Primary.Animal("Robak", 3, Species.Otter));
        rooms.add(new Root.Primary.Room(1));
        rooms.add(new Root.Primary.Room(2));
        rooms.get(0).assignAnimal(animals.get(0));
        rooms.get(0).assignAnimal(animals.get(1));
        rooms.get(1).assignAnimal(animals.get(2));
        rooms.get(1).setResponsibleEmployee(employees.get(0));
        rooms.get(0).setResponsibleEmployee(employees.get(1));
    }
}