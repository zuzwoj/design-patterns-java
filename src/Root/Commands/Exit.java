package Root.Commands;

public class Exit extends Generic {
    private Root.Interfaces.Command.CommandArguments args;
    public String getName() { return "exit"; }
    public void setName(String name) { }
    public String[] getArguments() { return args.Arguments; }
    public void setArguments(String[] args) {this.args.Arguments = args; }
    public void Execute() {
        if (getArguments().length > 0) System.out.println("Wrong arguments, try exit");
        else System.exit(0);
    }
    public boolean Dialogue() { return true; }
}