package Root.Iterators;

public class ForwardIterator<T> extends Iterator<T> {
    public ForwardIterator(Root.Interfaces.Collection<T> collection) { 
        this.collection = collection;
        index = 0;
        current = collection.First();
    }
    public boolean MoveNext() {
        if (collection.Last() == null) return false;
        if (collection.Last().equals(current)) return false;
        current = collection.Next(current);
        ++index;
        return true;
    }
    public void Reset() { 
        index = 0;
        current = collection.First();
    }
}