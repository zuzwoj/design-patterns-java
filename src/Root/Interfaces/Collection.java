package Root.Interfaces;

public interface Collection<T> {
    void addObject(T value);
    void deleteObject(T value);
    Root.Iterators.Iterator<T> GetForwardEnumerator();
    Root.Iterators.Iterator<T> GetReverseEnumerator();
    Root.Interfaces.Node<T> First();
    Root.Interfaces.Node<T> Last();
    Root.Interfaces.Node<T> Next(Root.Interfaces.Node<T> current);
    Root.Interfaces.Node<T> Prev(Root.Interfaces.Node<T> current);
    int Count();
}