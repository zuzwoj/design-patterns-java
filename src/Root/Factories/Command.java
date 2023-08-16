package Root.Factories;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.HashMap;
import java.util.ArrayList;

public class Command {
    public ArrayList<Root.Commands.Generic> availableCommands;

    public Command(HashMap<String, Root.Interfaces.Collection<Root.Interfaces.Object>> map, ArrayBlockingQueue<Root.Commands.Generic> commandQueue) { 
        availableCommands = new ArrayList<Root.Commands.Generic>();
        availableCommands.add(new Root.Commands.List(map)); 
        availableCommands.add(new Root.Commands.Find(map));
        availableCommands.add(new Root.Commands.Add(map));
        availableCommands.add(new Root.Commands.Exit());
        availableCommands.add(new Root.Commands.Edit(map));
        availableCommands.add(new Root.Commands.Queue.Print(commandQueue));
        availableCommands.add(new Root.Commands.Queue.Export(commandQueue));
        availableCommands.add(new Root.Commands.Queue.Commit(commandQueue));
        availableCommands.add(new Root.Commands.Queue.Dismiss(commandQueue));
        availableCommands.add(new Root.Commands.Queue.Load(commandQueue, map));
        availableCommands.add(new Root.Commands.Delete(map));
        availableCommands.add(new Root.Commands.NotFound());
    }

    public Root.Commands.Generic CreateCommand(Root.Interfaces.Command.CommandArguments commandArguments) {
        Root.Commands.Generic result = null;
        for (Root.Commands.Generic elem : availableCommands) {
            if (elem.getName().equals(commandArguments.CommandName)) {
                result = (Root.Commands.Generic)elem.clone();
                break;
            }
        }
        if (result == null) {
            result = new Root.Commands.NotFound(); 
            result.setName(commandArguments.CommandName);
        }
        result.setArguments(commandArguments.Arguments);
        return result;
    }
}