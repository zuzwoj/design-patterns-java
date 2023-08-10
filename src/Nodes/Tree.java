package Nodes;

public class Tree<T> implements Interfaces.Node<T> {
    public T value;
    public Nodes.Tree<T> left = null;
    public Nodes.Tree<T> right = null;
    public Nodes.Tree<T> parent = null;
    public Tree(T value) { this.value = value; }
    public T getValue() { return value; } 
    public void setValue(T v) { value = v;  } 
}