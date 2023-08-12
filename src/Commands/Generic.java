package Commands;

public abstract class Generic implements Interfaces.Command {
    public abstract String getName();
    public abstract void setName(String name);
    public abstract String[] getArguments();
    public abstract void setArguments(String[] args);
    public abstract void Execute();
    public abstract boolean Dialogue();
    public String ToString() {
        StringBuilder sb = new StringBuilder(getName());
        sb.append(" ");
        for (String item : getArguments()) {
            sb.append(item);
            sb.append(" ");
        }
        return sb.toString();
    }
}