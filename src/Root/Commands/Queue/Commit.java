package Root.Commands.Queue;
import java.util.Queue;

public class Commit extends Root.Commands.Generic {
    private Queue<Root.Commands.Generic> commandQueue;
    private Root.Interfaces.Command.CommandArguments args;

    public Commit(Queue<Root.Commands.Generic> commandQueue) { this.commandQueue = commandQueue; }
    public String getName() { return "queue commit"; }
    public void setName(String name) { }
    public String[] getArguments() { return args.Arguments; }
    public void setArguments(String[] args) {this.args.Arguments = args; }
    public boolean Dialogue() { return true; }

    public void Execute() {
        if (getArguments().length > 0) System.out.println("Wrong arguments, try queue commit");
        while (commandQueue.size() > 0) {
            var command = commandQueue.remove();
            command.Execute();
        }
    }
}