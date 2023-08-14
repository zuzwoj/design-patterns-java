package Root.Nodes;

public class Vector<T> implements Root.Interfaces.Node<T> {
    public T value;
    public Root.Nodes.Vector<T> next = null;
    public Vector(T value) { this.value = value; }
    public T getValue() { return value; } 
    public void setValue(T v) { value = v;  } 
}