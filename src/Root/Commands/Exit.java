package Root.Commands;

public class Exit extends Generic {
    private Root.Interfaces.Command.CommandArguments args = new Root.Interfaces.Command.CommandArguments("", new String[0]);
    public String getName() { return "exit"; }
    public void setName(String name) { }
    public String[] getArguments() { return args.Arguments; }
    public boolean Dialogue() { return true; }

    public void setArguments(String[] args) 
    {
        this.args = new Root.Interfaces.Command.CommandArguments(getName(), new String[0]);
        this.args.Arguments = args;
    }

     public void Execute() {
        if (getArguments().length > 0) System.out.println("Wrong arguments, try exit");
        else System.exit(0);
    }
}