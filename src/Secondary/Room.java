package Secondary;
import java.util.HashMap;

public class Room {
    public HashMap<String, String> Map = new HashMap<String, String> ();
    public Room(String number, String responsibleEmployee, String[] animals) {
        Map.put("number", number); 
        int c = animals.length;
        Map.put("classes.Size()", Integer.toString(c));
        for (int i = 0; i < c; ++i) Map.put("classes[" + Integer.toString(i) + "]", animals[i]);
    }
}