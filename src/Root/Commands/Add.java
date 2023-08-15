package Root.Commands;
import java.io.Console;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class Add extends Generic{
    private Root.Interfaces.Command.CommandArguments args = new Root.Interfaces.Command.CommandArguments("", new String[0]);
    public HashMap<String, Root.Interfaces.Collection<Root.Interfaces.Object>> map;
    public ArrayList<String> modifiers = new ArrayList<String>();

    public String getName() { return "add"; }
    public void setName(String name) { }
    public String[] getArguments() { return args.Arguments; }
    public void setArguments(String[] args) {this.args.Arguments = args; }
    public Add() { }
    public Add(HashMap<String, Root.Interfaces.Collection<Root.Interfaces.Object>> map) { this.map = map; }

    public boolean Dialogue() {
        if (getArguments().length != 2) {
            System.out.println("Wrong arguments, try add <name_of_the_class> base|secondary");
            return false;
        }
        Root.Interfaces.Collection<Root.Interfaces.Object> sub = map.get(getArguments()[0]);
        if (sub == null) {
            System.out.println("There is no object of type " + getArguments()[0]);
            return false;
        }
        if (getArguments()[1] != "base" && getArguments()[1] != "secondary") {
            System.out.println("Wrong arguments, try add <name_of_the_class> base|secondary");
            return false;
        }
        String[] attr = sub.First().getValue().getFields();
        System.out.print("Fields: ");
        for (String str : attr) System.out.print("\'" + str + "\', ");
        System.out.print("\n");
        String arg;
        Console cnsl = System.console();
        while ((arg = cnsl.readLine()) != "DONE") {
            if (arg == "EXIT") return false;
            String[] input = arg.split("=");
            if (!Arrays.asList(attr).contains(input[0])) System.out.println("Incorrect name of the field");
            else modifiers.add(arg);
        }
        return true;
    }
    
    public void Execute()
    {
        Root.Interfaces.Collection<Root.Interfaces.Object> sub = map.get(getArguments()[0]);
        if (sub == null) {
            System.out.println("There is no object of type " + getArguments()[0]);
            return;
        }
        Root.Interfaces.Factory factory;
        if (getArguments()[1].equals("base")) factory = new Root.Factories.Primary();
        else factory = new Root.Factories.Secondary();
        var newObject = factory.CreateObject(getArguments()[0]);
        if (newObject == null) {
            System.out.println("There is no object of type " + getArguments()[0]);
            return;
        }
        for (String arg : modifiers) {
            String[] input = arg.split("=");
            newObject.setProperty(input[0], input[1]);
        }
        sub.addObject(newObject);
    }
}