package Primary;

public class Employee extends Comparables.Employee {
    private String name;
    private String surname;

    public Employee (String n, String s) {
        name = n;
        surname = s;
    }
    public String getName() { return name; }
    public String getSurname() { return surname; }
    public void setName(String newName) { name = newName; }
    public void setSurname(String newSurname) { surname = newSurname; }
}