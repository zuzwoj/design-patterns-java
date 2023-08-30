package Root.Comparables;

public abstract class Employee implements Root.Interfaces.Object, Root.Interfaces.Employee {
    public String ObjectName() { return "employee"; }
    public String[] getFields() { return new String[] { "name", "surname"}; }
    public abstract String getName();
    public abstract void setName(String name);
    public abstract String getSurname();
    public abstract void setSurname(String name);
    public abstract Root.Interfaces.Object clone();
    public String Print() { return "EMPLOYEE: name: " + getName() + ", surname: " + getSurname(); }

    public boolean meetsCondition(String condition) {
        String[] sub = condition.split("[><=]+");
        if (sub.length != 2) return false;
        if (sub[0].equals("name") && condition.charAt(sub[0].length()) == '=') return getName().equals(sub[1]);
        if (sub[0].equals("surname") && condition.charAt(sub[0].length()) == '=') return getSurname().equals(sub[1]);
        return false;
    }

    public void setProperty(String key, String value) {
        if (key.equals("name")) setName(value);
        else if (key.equals("surname")) setSurname(value);
    }
}