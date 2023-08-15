package Root.Comparables;

public abstract class Room implements Root.Interfaces.Object, Root.Interfaces.Room {
    public String ObjectName() { return "room"; }
    public String[] getFields() { return new String[] { "number", "employee"}; }
    public abstract int getNumber();
    public abstract void setNumber(int number);
    public abstract Root.Primary.Employee getResponsibleEmployee();
    public abstract void setResponsibleEmployee(Root.Primary.Employee employee);
    public abstract Root.Interfaces.Object clone();
    public String Print() { return "ROOM: number: " + getNumber() + ", employee: " + getResponsibleEmployee(); }

    public boolean meetsCondition(String condition) {
        String[] sub = condition.split("><=");
        if (sub.length != 2) return false;
        switch (sub[0]) {
            case "number":
                switch (condition.charAt(sub[0].length())) {
                    case '>': return getNumber() > Integer.parseInt(sub[1]);
                    case '<': return getNumber() < Integer.parseInt(sub[1]);
                    case '=': return getNumber() == Integer.parseInt(sub[1]);
                }
                break;
            case "employee":
                if (condition.charAt(sub[0].length()) == '=') return getResponsibleEmployee().getName() + " " + getResponsibleEmployee().getSurname() == sub[1];
                break;
            default:
                return false;
        }
        return false;
    }

    public void setProperty(String key, String value) {
        if (key == "number") setNumber(Integer.parseInt(value));
        else if (key == "employee") 
        {
            String[] sub = value.split(" ");
            setResponsibleEmployee(new Root.Primary.Employee(sub[0], sub[1]));
        }
    }
}