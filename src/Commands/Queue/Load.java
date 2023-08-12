package Commands.Queue;
import java.util.Dictionary;
import java.util.Queue;

public class Load /*extends Commands.Generic*/{
    /*private Queue<genericCommand> commandQueue;
        Dictionary<string, ICollectionInterface<IObject>> map;
        public queueLoadCommand(Queue<genericCommand> commandQueue, Dictionary<string, ICollectionInterface<IObject>> map) 
        { 
            this.commandQueue = commandQueue;
            this.map = map;
        }
        public override string CommandName { get { return "queue load"; } set { } }
        public override commandArguments Arguments { get; set; }
        public override bool Dialogue() { return true; }
        public override void Execute() 
        {
            if (Arguments.Arguments.Length != 1)
            {
                Console.WriteLine("Wrong arguments, try queue load {filename}");
                return;
            }
            switch (Path.GetExtension(Arguments.Arguments[0]))
            {
                case ".txt":
                    Processor pro = new Processor(map);
                    string[] lines = File.ReadAllLines(AppDomain.CurrentDomain.BaseDirectory + @"\" + Arguments.Arguments[0]);
                    foreach (var elem in lines) pro.Process(elem.Split());
                    for (int i = 0; i < pro.commandQueue.Count; ++i) commandQueue.Enqueue(pro.commandQueue.Dequeue());
                    break;
                case ".xml":
                    var serializer = new XmlSerializer(typeof(genericCommand[]), new Type[] { typeof(genericCommand[]) });
                    using (Stream reader = new FileStream(AppDomain.CurrentDomain.BaseDirectory + @"\" + Arguments.Arguments[0], FileMode.Open))
                    {
                        genericCommand[] i = (genericCommand[])serializer.Deserialize(reader);
                        Queue<genericCommand> loaded = new Queue<genericCommand>(i);
                        this.commandQueue.Clear();
                        foreach (var elem in loaded) this.commandQueue.Enqueue(elem);
                    }
                    break;
                default:
                    Console.WriteLine("File is not valid");
                    break;
            }
        }*/
}