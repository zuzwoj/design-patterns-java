package Iterators;

public abstract class Iterator<T> {
    protected Interfaces.Collection<T> collection;
    protected int index;
    protected Interfaces.Node<T> current;
    public Interfaces.Node<T> Current() { return current; }
    public abstract boolean MoveNext();
    public abstract void Reset();
}