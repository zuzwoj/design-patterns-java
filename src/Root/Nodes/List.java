package Root.Nodes;

public class List<T> implements Root.Interfaces.Node<T> {
    public T value;
    public Root.Nodes.List<T> next;
    public Root.Nodes.List<T> prev;
    public List(T value)
    {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
    public T getValue() { return value; } 
    public void setValue(T v) { value = v;  } 
}