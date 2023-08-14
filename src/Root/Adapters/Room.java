package Root.Adapters;
import java.lang.Integer;
import Root.Primary.Employee;

public class Room extends Root.Comparables.Room {
    private Root.Secondary.Room adaptee;
    public Room(Root.Secondary.Room adaptee) { this.adaptee = adaptee; }
    public int getNumber() { return Integer.parseInt(adaptee.Map.get("number")); }
    public void setNumber(int number) { adaptee.Map.replace("number", String.valueOf(number)); }
    public int getAnimalsCount() { return Integer.parseInt(adaptee.Map.get("animals.Size()")); }

    public void setResponsibleEmployee(Employee employee) {
        adaptee.Map.replace("employee", employee.getName() + " " + employee.getSurname());
    }

    public Employee getResponsibleEmployee() {
        String temp = adaptee.Map.get("employee");
        String[] broken = temp.split(" ");
        if (broken.length == 2) return new Root.Primary.Employee(broken[0], broken[1]);
        return null;
    }
}