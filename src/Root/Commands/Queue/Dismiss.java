package Root.Commands.Queue;
import java.util.Queue;

public class Dismiss extends Root.Commands.Generic {
    private Root.Interfaces.Command.CommandArguments args = new Root.Interfaces.Command.CommandArguments("", new String[0]);
    private Queue<Root.Commands.Generic> commandQueue;

    public Dismiss(Queue<Root.Commands.Generic> commandQueue) { this.commandQueue = commandQueue; }
    public String getName() { return "queue dismiss"; }
    public void setName(String name) { }
    public String[] getArguments() { return args.Arguments; }
    public void setArguments(String[] args) {this.args.Arguments = args; }
    public boolean Dialogue() { return true; }
    public void Execute() { commandQueue.clear(); }
}