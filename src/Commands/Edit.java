package Commands;
import java.io.Console;
import java.util.Dictionary;

public class Edit /*extends Generic*/ {
    /*public Dictionary<string, ICollectionInterface<IObject>> map;
    public List<string> modifiers = new List<string>();

    public editCommand() { }
    public editCommand(Dictionary<string, ICollectionInterface<IObject>> map) { this.map = map; }
    public override string CommandName { get { return "edit"; } set { } }
    public override commandArguments Arguments { get; set; }

    public override bool Dialogue() {
        if (Arguments.Arguments.Length == 0) {
            Console.WriteLine("Wrong arguments, try edit <name_of_the_class> [<requirement> …]");
            return false;
        }
        ICollectionInterface<IObject> sub;
        map.TryGetValue(Arguments.Arguments[0], out sub);
        if (sub == null) {
            Console.WriteLine("There is no object of type " + Arguments.Arguments[0]);
            return false;
        }
        IObject toEdit = null;
        bool found = false;
        var it = sub.GetForwardEnumerator();
        do {
            bool x = true;
            for (int i = 1; i < Arguments.Arguments.Length; ++i) if (!it.Current().Value.meetsCondition(Arguments.Arguments[i])) {
                x = false;
                break;
                }
            if (x) {
                if (!found) toEdit = it.Current().Value;
                else {
                    Console.WriteLine("There is more than one object that meets specified conditions");
                    return false;
                }
            }
        } while (it.MoveNext());
        if (toEdit == null) {
            Console.WriteLine("There is no object that meets specified conditions");
            return false;
        }
        string[] attr = sub.First().Value.getFields();
        Console.Write("Fields: ");
        foreach (string str in attr) Console.Write("\'" + str + "\', ");
        Console.Write("\n");
        string arg;
        while ((arg = Console.ReadLine()) != "DONE") {
            if (arg == "EXIT") return false;
            string[] input = arg.Split('=');
            if (!attr.Contains(input[0])) Console.WriteLine("Incorrect name of the field");
            else modifiers.Add(arg);
        }
        return true;
    }

    public override void Execute() {
        ICollectionInterface<IObject> sub;
        map.TryGetValue(Arguments.Arguments[0], out sub);
        if (sub == null) {
            Console.WriteLine("There is no object of type " + Arguments.Arguments[0]);
            return;
        }
        IObject toEdit = null;
        bool found = false;
        var it = sub.GetForwardEnumerator();
        do {
            bool x = true;
            for (int i = 1; i < Arguments.Arguments.Length; ++i) if (!it.Current().Value.meetsCondition(Arguments.Arguments[i])) {
                x = false;
                break;
            }
            if (x && !found) {
                toEdit = it.Current().Value;
                break;
            }
        } while (it.MoveNext());
        foreach (string arg in modifiers) {
            string[] input = arg.Split('=');
            toEdit.setProperty(input[0], input[1]);
        }
    } */
}