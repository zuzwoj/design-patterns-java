package Root.Commands.Queue;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Queue;
import java.beans.XMLEncoder;

public class Export extends Root.Commands.Generic {
    private Queue<Root.Commands.Generic> commandQueue;
    private Root.Interfaces.Command.CommandArguments args = new Root.Interfaces.Command.CommandArguments("", new String[0]);

    public Export(Queue<Root.Commands.Generic> commandQueue) { this.commandQueue = commandQueue; }
    public String getName() { return "queue export"; }
    public void setName(String name) { }
    public String[] getArguments() { return args.Arguments; }
    public boolean Dialogue() { return true; }

    public void setArguments(String[] args) 
    {
        this.args = new Root.Interfaces.Command.CommandArguments(getName(), new String[0]);
        this.args.Arguments = args;
    }

    public void Execute() {
        if (getArguments().length != 2 && getArguments().length != 1) {
            System.out.println("Wrong arguments, try queue export {filename} [format]");
            return;
        }
        if (getArguments().length == 2) {
            if (getArguments()[1].equals("XML")) {
                File myObj = new File(getArguments()[0] + ".xml");
                try {
                    myObj.createNewFile();
                    var serializer = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(getArguments()[0] + ".xml")));
                    serializer.writeObject(commandQueue);
                    serializer.close();
                } catch(Exception e) {}
            }
            else if (getArguments()[1].equals("plaintext")) {
                Root.Interfaces.Command[] coms = (Root.Interfaces.Command[])commandQueue.toArray();
                String[] data = new String[coms.length];
                for (int i = 0; i < coms.length; ++i) data[i] = coms[i].ToString();
                try {
                    FileWriter writer = new FileWriter(getArguments()[0] + ".txt");
                    int j = 0;
                    for (String line : data) {
                        writer.write(line, j, 0);
                        j += line.length();
                        ++j;
                        writer.write('\n');
                    }
                    writer.close();
                } catch (Exception e) {}
            }
            else System.out.println("Format " + getArguments()[1] + " is not supported, supported formats are: XML, plaintext");
        }
        else {
            File myObj = new File(getArguments()[0] + ".xml");
            try {
                myObj.createNewFile();
                var serializer = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(getArguments()[0] + ".xml")));
                serializer.writeObject(commandQueue);
                serializer.close();
            } catch(Exception e) {}
        }
    }
}