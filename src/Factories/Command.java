package Factories;
import java.util.Dictionary;
import java.util.Queue;

public class Command {
    /*public readonly IEnumerable<genericCommand> availableCommands;

    public CommandFactory(Dictionary<string, Interfaces.Collection<Interfaces.Object>> map, Queue<genericCommand> commandQueue) { 
        availableCommands = new genericCommand[] {
            new listCommand(map), new findCommand(map), new addCommand(map), new exitCommand(), new editCommand(map), new queuePrintCommand(commandQueue), 
            new queueExportCommand(commandQueue), new queueCommitCommand(commandQueue), new queueDismissCommand(commandQueue), new queueLoadCommand(commandQueue, map),
            new deleteCommand(map), new notFoundCommand()
        };
    }

    public genericCommand CreateCommand(commandArguments commandArguments) {
        var result = availableCommands.FirstOrDefault(cmd => cmd.CommandName == commandArguments.CommandName);
        genericCommand command;
        if (result != null) command = result.Clone();
        else command = new notFoundCommand { CommandName = commandArguments.CommandName };
        command.Arguments = commandArguments;
        return command;
    }*/
}