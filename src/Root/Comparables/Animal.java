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
    public abstract Root.Interfaces.Object clone();
    public String Print() { return "ANIMAL: name: " + getName() + ", age: " + getAge() + ", species: " + getSpecies(); }

    public boolean meetsCondition(String condition) {
        String[] sub = condition.split("[><=]+");
        if (sub.length != 2) return false;
        if (sub[0].equals("age")) {
            switch (condition.charAt(sub[0].length())) {
                case '>': return getAge() > Integer.parseInt(sub[1]);
                case '<': return getAge() < Integer.parseInt(sub[1]);
                case '=': return getAge() == Integer.parseInt(sub[1]);
            }
        }
        else if (sub[0].equals("name") && condition.charAt(sub[0].length()) == '=') return getName().equals(sub[1]);
        else if (sub[0].equals("species") && condition.charAt(sub[0].length()) == '=') return getSpecies().toString().equals(sub[1]);
        return false;
    }

    public void setProperty(String key, String value) {
        if (key.equals("age")) setAge(Integer.parseInt(value));
        else if (key.equals("species")) setSpecies(Root.Primary.Animal.Species.valueOf(value));
        else if (key.equals("name")) setName(value);
    }
}