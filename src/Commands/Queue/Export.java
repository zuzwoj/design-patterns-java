package Commands.Queue;
import java.io.Console;
import java.util.Queue;

public class Export /*extends Commands.Generic*/{
    /*private Queue<genericCommand> commandQueue;
        public queueExportCommand(Queue<genericCommand> commandQueue) { this.commandQueue = commandQueue; }
        public override string CommandName { get { return "queue export"; } set { } }
        public override commandArguments Arguments { get; set; }
        public override bool Dialogue() { return true; }
        public override void Execute()
        {
            if (Arguments.Arguments.Length != 2 && Arguments.Arguments.Length != 1)
            {
                Console.WriteLine("Wrong arguments, try queue export {filename} [format]");
                return;
            }
            if (Arguments.Arguments.Length == 2)
            {
                if (Arguments.Arguments[1].Equals("XML"))
                {
                    var serializer = new XmlSerializer(typeof(genericCommand[]), new Type[] { typeof(genericCommand[]) });
                    FileStream fs = File.Create(AppDomain.CurrentDomain.BaseDirectory + @"\" + Arguments.Arguments[0]);
                    serializer.Serialize(fs, commandQueue.ToArray());
                    fs.Close();
                }
                else if (Arguments.Arguments[1].Equals("plaintext"))
                {
                    ICommand[] coms = commandQueue.ToArray();
                    string[] data = new string[coms.Length];
                    for (int i = 0; i < coms.Length; ++i) data[i] = coms[i].ToString();
                    File.WriteAllLines(AppDomain.CurrentDomain.BaseDirectory + @"\" + Arguments.Arguments[0], data);
                }
                else Console.WriteLine("Format " + Arguments.Arguments[1] + " is not supported, supported formats are: XML, plaintext");
            }
            else
            {
                var serializer = new XmlSerializer(typeof(genericCommand[]), new Type[] { typeof(genericCommand[]) });
                FileStream fs = File.Create(AppDomain.CurrentDomain.BaseDirectory + @"\" + Arguments.Arguments[0]);
                serializer.Serialize(fs, commandQueue.ToArray());
                fs.Close();
            }
        }*/
}