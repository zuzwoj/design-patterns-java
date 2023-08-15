package Root.Commands;
import java.util.HashMap;

public class List extends Generic {
    private Root.Interfaces.Command.CommandArguments args = new Root.Interfaces.Command.CommandArguments("", new String[0]);
    public HashMap<String, Root.Interfaces.Collection<Root.Interfaces.Object>> map;

    public List() { }
    public List(HashMap<String, Root.Interfaces.Collection<Root.Interfaces.Object>> map) { this.map = map; }
    public String getName() { return "list"; }
    public void setName(String name) { }
    public String[] getArguments() { return args.Arguments; }
    public void setArguments(String[] args) {this.args.Arguments = args; }
    public boolean Dialogue() { return true; }

    public void Execute() {
        if (getArguments().length != 1) {
            System.out.println("Wrong arguments, try list <name_of_the_class>");
            return;
        }
        Root.Interfaces.Collection<Root.Interfaces.Object> sub = map.get(getArguments()[0]);
        if (sub == null) {
            System.out.println("There is no object of type " + getArguments()[0]);
            return;
        }
        var it = sub.GetForwardEnumerator();
        do { System.out.println(it.Current().getValue().Print()); } while (it.MoveNext());
    }
}