package Interfaces;

public interface Command {
    public class CommandArguments {
        public String CommandName;
        public String[] Arguments;
    
        public CommandArguments(String name, String[] arguments){
            this.CommandName = name;
            this.Arguments = arguments;
        }
    }

    String getName();
    String[] getArguments();
    void Execute();
    String ToString();
}