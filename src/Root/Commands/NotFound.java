package Root.Commands;

public class NotFound extends Generic{
    private Root.Interfaces.Command.CommandArguments args;
    public String getName() { return args.CommandName; }
    public void setName(String name) { args.CommandName = name; }
    public String[] getArguments() { return args.Arguments; }
    public void setArguments(String[] args) {this.args.Arguments = args; }
    public void Execute() { System.out.println("Couldn't find command: " + args.CommandName); }
    public boolean Dialogue() { return true; }
}