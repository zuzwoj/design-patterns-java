package Root;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.ArrayList;
import java.util.HashMap;

public class Processor {
    private Root.Factories.Command commandFactory;
    public ArrayBlockingQueue<Root.Commands.Generic> commandQueue = new ArrayBlockingQueue<Root.Commands.Generic>(1);

    public Processor(HashMap<String, Root.Interfaces.Collection<Root.Interfaces.Object>> map) 
    { 
        commandFactory = new Root.Factories.Command(map, commandQueue); 
    }

    public boolean Process(String[] args) {
        var arguments = ParseArguments(args);
        var command = commandFactory.CreateCommand(arguments);
        if (args[0].equals("queue") || args[0].equals("exit")) command.Execute();
        else if (command.Dialogue()) commandQueue.add(command);
        return true;
    }

    private Root.Interfaces.Command.CommandArguments ParseArguments(String[] args)
    {
        int start = 1;
        String name = args[0];
        if (args[0].equals("queue")) {
            start = 2;
            name += " ";
            name += args[1];
        }
        if (start == args.length) return new Root.Interfaces.Command.CommandArguments(name, new String[0]);
        ArrayList<String> sub = new ArrayList<String>();
        String together = args[start];
        for (int i = start + 1; i < args.length; ++i) {
            together += " ";
            together += args[i];
        }
        int prev = 0;
        for (int i = 0; i < together.length(); ++i) {
            if (together.charAt(i) == ' ') if (i != 0 && i !=together.length() - 1) if (together.charAt(i - 1) != '"' || together.charAt(i + 1) != '"') {
                sub.add(together.substring(prev, i - prev));
                prev = i + 1;
            }
        }
        sub.add(together.substring(prev, together.length() - prev));
        return new Root.Interfaces.Command.CommandArguments(name, (String[])sub.toArray());
    }
}