import java.util.Dictionary;
import java.util.Queue;

public class Processor {
    /*private CommandFactory commandFactory;
        public Queue<genericCommand> commandQueue = new Queue<genericCommand>();

        public Processor(Dictionary<string, ICollectionInterface<IObject>> map) { commandFactory = new CommandFactory(map, commandQueue); }

        public void Process(string[] args)
        {
            var arguments = ParseArguments(args);
            var command = commandFactory.CreateCommand(arguments);
            if (args[0].Equals("queue") || args[0].Equals("exit")) command.Execute();
            else if (command.Dialogue()) commandQueue.Enqueue(command);
        }

        private commandArguments ParseArguments(string[] args)
        {
            int start = 1;
            string name = args[0];
            if (args[0].Equals("queue"))
            {
                start = 2;
                name += " ";
                name += args[1];
            }
            if (start == args.Length) return new commandArguments(name, new string[0]);
            List<string> sub = new List<string>();
            string together = args[start];
            for (int i = start + 1; i < args.Length; ++i)
            {
                together += " ";
                together += args[i];
            }
            int prev = 0;
            for (int i = 0; i < together.Length; ++i)
            {
                if (together[i] == ' ')
                    if (i != 0 && i !=together.Length - 1)
                        if (together[i-1] != '"' || together[i+1] != '"')
                        {
                            sub.Add(together.Substring(prev, i - prev));
                            prev = i + 1;
                        }
            }
            sub.Add(together.Substring(prev, together.Length - prev));
            return new commandArguments(name, sub.ToArray());
    }*/
}