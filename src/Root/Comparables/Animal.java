package Root.Comparables;

public abstract class Animal implements Root.Interfaces.Object, Root.Interfaces.Animal {
    public String ObjectName() { return "animal"; }
    public String[] getFields() { return new String[] { "name", "age", "species"}; }
    public abstract int getAge();
    public abstract void setAge(int age);
    public abstract String getName();
    public abstract void setName(String name);
    public abstract Root.Primary.Animal.Species getSpecies();
    public abstract void setSpecies(Root.Primary.Animal.Species name);
    public String Print() { return "ANIMAL: number: " + getName() + ", age: " + getAge() + ", species: " + getSpecies(); }

    public boolean meetsCondition(String condition) {
        String[] sub = condition.split("><=");
        if (sub.length != 2) return false;
        switch (sub[0]) {
            case "age":
                switch (condition.charAt(sub[0].length())) {
                    case '>': return getAge() > Integer.parseInt(sub[1]);
                    case '<': return getAge() < Integer.parseInt(sub[1]);
                    case '=': return getAge() == Integer.parseInt(sub[1]);
                }
                break;
            case "name":
                if (condition.charAt(sub[0].length()) == '=') return getName() == sub[1];
                break;
            case "species":
                if (condition.charAt(sub[0].length()) == '=') return getSpecies().toString() == sub[1];
                break;
            default:
                return false;
        }
        return false;
    }

    public void setProperty(String key, String value) {
        if (key == "age") setAge(Integer.parseInt(value));
        else if (key == "species") setSpecies(Root.Primary.Animal.Species.valueOf(value));
        else if (key == "name") setName(value);
    }
}