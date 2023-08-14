package Root.Collections;

public class Vector<T> implements Root.Interfaces.Collection<T> {
    @SuppressWarnings("unchecked")
    private Root.Nodes.Vector<T>[] content = (Root.Nodes.Vector<T>[])new Object[100];
    private int size = 0;

    public Root.Iterators.Iterator<T> GetForwardEnumerator() { return new Root.Iterators.ForwardIterator<T>(this); }
    public Root.Iterators.Iterator<T> GetReverseEnumerator() { return new Root.Iterators.ReverseIterator<T>(this); }
    public int Count() { return size; }

    public void addObject(T value) {
        for (int i = 0; i < size; ++i) if (content[i].value.equals(value)) return;
        if (size > content.length) {
            @SuppressWarnings("unchecked")
            Root.Nodes.Vector<T>[] newContent = (Root.Nodes.Vector<T>[])new Object[content.length * 2];
            System.arraycopy(content, 0, newContent, 0, size);
            content = newContent;
        }
        content[size] = new Root.Nodes.Vector<T>(value);
        ++size;
    }

    public void deleteObject(T value) {
        int toDelete = size;
        for (int i = 0; i < size; ++i) if (content[i].value.equals(value)) {
                toDelete = i;
                break;
        }
        if (toDelete != size - 1) for (int i = toDelete; i < size - 1; ++i) content[i] = content[i + 1];
        --size;
    }

    public Root.Interfaces.Node<T> First() { 
        if (size > 0) return content[0];
        return null;
    }

    public Root.Interfaces.Node<T> Last() { 
        if (size > 0) return content[size - 1];
        return null;
    }

    public Root.Interfaces.Node<T> Next(Root.Interfaces.Node<T> current) {
        if (size == 0) return null;
        if (current.equals(content[size - 1])) return null;
        for (int i = 0; i < size; ++i) if (content[i].equals(current)) return content[i + 1];
        return null;
    }
        
    public Root.Interfaces.Node<T> Prev(Root.Interfaces.Node<T> current) {
        if (size == 0) return null;
        if (current.equals(content[0])) return null;
        for (int i = size - 1; i > 0; --i) if (content[i].equals(current)) return content[i - 1];
        return null;
    }       
}