package Secondary;
import java.util.HashMap;

public class Animal {
    public int id;
    public HashMap<String, String> Map = new HashMap<String, String> ();

    public Animal(String name, String age)
    {
        Map.put("name", name);
        Map.put("age", age);
    }
}