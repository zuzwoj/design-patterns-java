package Iterators;

public class ReverseIterator<T> extends Iterator<T> {
    public ReverseIterator(Interfaces.Collection<T> collection) { 
        this.collection = collection;
        index = collection.Count() - 1;
        current = collection.Last();
    }
    public boolean MoveNext() {
        if (collection.Last() == null) return false;
        if (collection.First().equals(current)) return false;
        current = collection.Prev(current);
        --index;
        return true;
    }
    public void Reset() { 
        index = collection.Count() - 1;
        current = collection.Last();
    }
}