package Commands;
import java.io.Console;
import java.util.Dictionary;

public class Delete /*extends Generic*/ {
    /*public Dictionary<string, ICollectionInterface<IObject>> map;
    public List<string> modifiers = new List<string>();

    public deleteCommand() { }
    public deleteCommand(Dictionary<string, ICollectionInterface<IObject>> map) { this.map = map; }
    public String CommandName { get { return "delete"; } set { } }
    public commandArguments Arguments { get; set; }
    
    public boolean Dialogue() {
        if (Arguments.Arguments.Length == 0) {
            Console.WriteLine("Wrong arguments, try delete <name_of_the_class> [<requirement> …]");
            return false;
        }
        ICollectionInterface<IObject> sub;
        map.TryGetValue(Arguments.Arguments[0], out sub);
        if (sub == null) {
            Console.WriteLine("There is no object of type " + Arguments.Arguments[0]);
            return false;
        }
        IObject toEdit = null;
        boolean found = false;
        var it = sub.GetForwardEnumerator();
        do {
            boolean x = true;
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
        sub.deleteObject(toEdit);
        map.Remove(Arguments.Arguments[0]);
        map.Add(Arguments.Arguments[0], sub);
    }*/
}