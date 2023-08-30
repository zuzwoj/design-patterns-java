package Root.Commands.Queue;
import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Queue;
import java.nio.file.Paths;
import java.util.List;;

public class Load extends Root.Commands.Generic {
    private Queue<Root.Commands.Generic> commandQueue;
    private Root.Interfaces.Command.CommandArguments args = new Root.Interfaces.Command.CommandArguments("", new String[0]);
    HashMap<String, Root.Interfaces.Collection<Root.Interfaces.Object>> map;

    public Load(Queue<Root.Commands.Generic> commandQueue, HashMap<String, Root.Interfaces.Collection<Root.Interfaces.Object>> map) { 
        this.commandQueue = commandQueue;
        this.map = map;
    }
    public String getName() { return "queue load"; }
    public void setName(String name) { }
    public String[] getArguments() { return args.Arguments; }
    public boolean Dialogue() { return true; }

    public void setArguments(String[] args) 
    {
        this.args = new Root.Interfaces.Command.CommandArguments(getName(), new String[0]);
        this.args.Arguments = args;
    }

    public void Execute() {
        if (getArguments().length != 1) {
            System.out.println("Wrong arguments, try queue load {filename}");
            return;
        }
        String extension = "";
        int i = getArguments()[0].lastIndexOf('.');
        if (i > 0) extension = getArguments()[0].substring(i+1);
        if (extension.equals(".txt")) {
            try {
                Root.Processor pro = new Root.Processor(map);
                List<String> lines = Files.readAllLines(Paths.get(getArguments()[0]));
                for (var elem : lines) pro.Process(elem.split(" "));
                for (int j = 0; j < pro.commandQueue.size(); ++j) commandQueue.add(pro.commandQueue.remove());
            } catch (Exception e) {}
        }
        else if (extension.equals(".xml")) {
            try {
                XMLDecoder d = new XMLDecoder( new BufferedInputStream( new FileInputStream(getArguments()[0])));
                @SuppressWarnings("unchecked")
                Queue<Root.Commands.Generic> result = (Queue<Root.Commands.Generic>)d.readObject();
                d.close();
                this.commandQueue.clear();
                for (var elem : result) this.commandQueue.add(elem);
            } catch (Exception e) {}
        }
        else System.out.println("File is not valid");
    }
}