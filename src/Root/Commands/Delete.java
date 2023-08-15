package Root.Commands;
import java.util.ArrayList;
import java.util.HashMap;

public class Delete extends Generic {
    public HashMap<String, Root.Interfaces.Collection<Root.Interfaces.Object>> map;
    public ArrayList<String> modifiers = new ArrayList<String>();
    private Root.Interfaces.Command.CommandArguments args = new Root.Interfaces.Command.CommandArguments("", new String[0]);

    public Delete() { }
    public Delete(HashMap<String, Root.Interfaces.Collection<Root.Interfaces.Object>> map) { this.map = map; }
    public String getName() { return "delete"; }
    public void setName(String name) { }
    public String[] getArguments() { return args.Arguments; }
    public void setArguments(String[] args) {this.args.Arguments = args; }
    
    public boolean Dialogue() {
        if (getArguments().length == 0) {
            System.out.println("Wrong arguments, try delete <name_of_the_class> [<requirement> …]");
            return false;
        }
        Root.Interfaces.Collection<Root.Interfaces.Object> sub = map.get(getArguments()[0]);
        if (sub == null) {
            System.out.println("There is no object of type " + getArguments()[0]);
            return false;
        }
        Root.Interfaces.Object toEdit = null;
        boolean found = false;
        var it = sub.GetForwardEnumerator();
        do {
            boolean x = true;
            for (int i = 1; i < getArguments().length; ++i) if (!it.Current().getValue().meetsCondition(getArguments()[i])) {
                x = false;
                    break;
            }
            if (x) {
                if (!found) toEdit = it.Current().getValue();
                else {
                    System.out.println("There is more than one object that meets specified conditions");
                    return false;
                }
            }
        } while (it.MoveNext());
        if (toEdit == null) {
            System.out.println("There is no object that meets specified conditions");
            return false;
        }
        return true;
    }

    public void Execute() {
        Root.Interfaces.Collection<Root.Interfaces.Object> sub = map.get(getArguments()[0]);
        if (sub == null) {
            System.out.println("There is no object of type " + getArguments()[0]);
            return;
        }
        Root.Interfaces.Object toEdit = null;
        boolean found = false;
        var it = sub.GetForwardEnumerator();
        do {
            boolean x = true;
            for (int i = 1; i < getArguments().length; ++i) if (!it.Current().getValue().meetsCondition(getArguments()[i])) {
                x = false;
                break;
            }
            if (x && !found) {
                toEdit = it.Current().getValue();
                break;
            }
        } while (it.MoveNext());
        sub.deleteObject(toEdit);
        map.remove(getArguments()[0]);
        map.put(getArguments()[0], sub);
    }
}