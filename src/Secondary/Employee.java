package Secondary;
import java.util.HashMap;

public class Employee {
    public HashMap<String, String> Map = new HashMap<String, String> ();
    public Employee(String name, String surname){
        Map.put("name", name);
        Map.put("surname", surname);
    }
}