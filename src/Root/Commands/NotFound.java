package Root.Commands;

public class NotFound extends Generic{
    private Root.Interfaces.Command.CommandArguments args = new Root.Interfaces.Command.CommandArguments("", new String[0]);
    public String getName() { return args.CommandName; }
    public void setName(String name) { args.CommandName = name; }
    public String[] getArguments() { return args.Arguments; }
    public void Execute() { System.out.println("Couldn't find command: " + args.CommandName); }
    public boolean Dialogue() { return true; }

    public void setArguments(String[] args) 
    {
        String temp = getName();
        this.args = new Root.Interfaces.Command.CommandArguments(temp, new String[0]);
        this.args.Arguments = args;
    }
}