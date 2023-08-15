package Root.Commands.Queue;
import java.util.Queue;

public class Print extends Root.Commands.Generic {
    private Queue<Root.Commands.Generic> commandQueue;
    private Root.Interfaces.Command.CommandArguments args = new Root.Interfaces.Command.CommandArguments("", new String[0]);

    public Print(Queue<Root.Commands.Generic> commandQueue) { this.commandQueue = commandQueue; }
    public String getName() { return "queue print"; }
    public void setName(String name) { }
    public String[] getArguments() { return args.Arguments; }
    public void setArguments(String[] args) {this.args.Arguments = args; }
    public boolean Dialogue() { return true; }
    public void Execute() {
        if (getArguments().length > 0) System.out.println("Wrong arguments, try queue print");
        else for (var item : commandQueue) System.out.println(item.ToString()); 
    }
}