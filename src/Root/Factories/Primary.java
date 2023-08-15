package Root.Factories;
import java.util.ArrayList;
import Root.Interfaces.Object;

public class Primary implements Root.Interfaces.Factory {
    public ArrayList<Root.Interfaces.Object> availableObjects = new ArrayList<Root.Interfaces.Object>();
    
    public Primary() {
        availableObjects.add(new Root.Primary.Room(0));
        availableObjects.add(new Root.Primary.Employee("", ""));
        availableObjects.add(new Root.Primary.Animal("", 0, null));
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