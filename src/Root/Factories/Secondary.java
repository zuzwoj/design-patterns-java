package Root.Factories;
import java.util.ArrayList;
import Root.Interfaces.Object;

public class Secondary implements Root.Interfaces.Factory {
    public ArrayList<Root.Interfaces.Object> availableObjects = new ArrayList<Root.Interfaces.Object>();

    public Secondary() {
        availableObjects.add(new Root.Adapters.Room(new Root.Secondary.Room("", "", new String[0])));
        availableObjects.add(new Root.Adapters.Employee(new Root.Secondary.Employee("", "")));
        availableObjects.add(new Root.Adapters.Animal(new Root.Secondary.Animal("", "", "")));
    }

    public Object CreateObject(String type) {
        Object result = null;
        for (Object elem : availableObjects) {
            if (elem.ObjectName().equals(type)) {
                result = elem.clone();
                break;
            }
        }
        return result;
    }
}