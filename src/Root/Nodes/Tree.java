package Root.Nodes;

public class Tree<T> implements Root.Interfaces.Node<T> {
    public T value;
    public Root.Nodes.Tree<T> left = null;
    public Root.Nodes.Tree<T> right = null;
    public Root.Nodes.Tree<T> parent = null;
    public Tree(T value) { this.value = value; }
    public T getValue() { return value; } 
    public void setValue(T v) { value = v;  } 
}