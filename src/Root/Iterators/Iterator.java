package Root.Iterators;

public abstract class Iterator<T> {
    protected Root.Interfaces.Collection<T> collection;
    protected int index;
    protected Root.Interfaces.Node<T> current;
    public Root.Interfaces.Node<T> Current() { return current; }
    public abstract boolean MoveNext();
    public abstract void Reset();
}