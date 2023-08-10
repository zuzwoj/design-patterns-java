package Interfaces;

public interface Collection<T> {
    void addObject(T value);
    void deleteObject(T value);
    Iterators.Iterator<T> GetForwardEnumerator();
    Iterators.Iterator<T> GetReverseEnumerator();
    Interfaces.Node<T> First();
    Interfaces.Node<T> Last();
    Interfaces.Node<T> Next(Interfaces.Node<T> current);
    Interfaces.Node<T> Prev(Interfaces.Node<T> current);
    int Count();
}