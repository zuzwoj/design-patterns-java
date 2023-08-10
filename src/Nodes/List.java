package Nodes;

public class List<T> implements Interfaces.Node<T> {
    public T value;
    public Interfaces.Node<T> next;
    public Interfaces.Node<T> prev;
    public List(T value)
    {
        this.value = value;
        this.next = null;
        this.prev = null;
    }
    public T getValue() { return value; } 
    public void setValue(T v) { value = v;  } 
}