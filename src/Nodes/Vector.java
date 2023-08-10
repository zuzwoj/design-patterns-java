package Nodes;

public class Vector<T> implements Interfaces.Node<T> {
    public T value;
    public Nodes.Vector<T> next = null;
    public Vector(T value) { this.value = value; }
    public T getValue() { return value; } 
    public void setValue(T v) { value = v;  } 
}