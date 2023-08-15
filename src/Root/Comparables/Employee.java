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
        String[] sub = condition.split("><=");
        if (sub.length != 2) return false;
        switch (sub[0]) {
            case "name":
                if (condition.charAt(sub[0].length()) == '=') return getName() == sub[1];
                break;
            case "surname":
                if (condition.charAt(sub[0].length()) == '=') return getSurname() == sub[1];
                break;
            default:
                return false;
        }
        return false;
    }

    public void setProperty(String key, String value) {
        if (key == "name") setName(value);
        else if (key == "surname") setSurname(value);
    }
}