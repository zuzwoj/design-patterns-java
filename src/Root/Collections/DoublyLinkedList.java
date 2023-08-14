package Root.Collections;

public class DoublyLinkedList<T> implements Root.Interfaces.Collection<T> {
    private Root.Nodes.List<T> head = null;
    private Root.Nodes.List<T> tail = null;

    public Root.Iterators.Iterator<T> GetForwardEnumerator() { return new Root.Iterators.ForwardIterator<T>(this); }
    public Root.Iterators.Iterator<T> GetReverseEnumerator() { return new Root.Iterators.ReverseIterator<T>(this); }

    public void addObject(T value) {
        Root.Nodes.List<T> p = head;
        while (p != null) {
            if (p.value.equals(value)) return;
            p = p.next;
        }
        Root.Nodes.List<T> node = new Root.Nodes.List<T>(value);
        if (head == null) {
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    public void deleteObject(T value) {
        Root.Iterators.Iterator<T> it = GetForwardEnumerator();
        Root.Nodes.List<T> cur = null;
        while (it.MoveNext()) {
            cur = (Root.Nodes.List<T>)it.Current();
            if (cur.value.equals(value)) break;
        }
        if (cur != null) {
            if (cur.prev != null && cur.next != null) {
                cur.prev.next = cur.next;
                cur.next.prev = cur.prev;
            }
            else if (cur.prev == null) {
                if (cur.next == null) {
                    head = null;
                    tail = null;
                }
                else { cur.next.prev = null; }
            }
            else if (cur.next == null) { cur.prev.next = null; }
        }
    }
        
    public Root.Interfaces.Node<T> First() { 
        if (head != null) return head;
        return null;
    }

    public Root.Interfaces.Node<T> Last() { 
        if (tail != null) return tail;
        return null;
    }

    public Root.Interfaces.Node<T> Next(Root.Interfaces.Node<T> current) {
        if (current.equals(tail)) return null;
        Root.Nodes.List<T> p = head;
        do {
            if (p.equals(current)) return p.next;
            p = p.next;
        } while (p.next != null);
        return null;
    }

    public Root.Interfaces.Node<T> Prev(Root.Interfaces.Node<T> current) 
    {
        if (current.equals(head)) return null;
        Root.Nodes.List<T> p = tail;
        do {
            if (p.value.equals(current)) return p.prev;
            p = p.prev;
        } while (p.prev != null);
        return null;
    }

    public int Count() {
        int result = 0;
        Root.Nodes.List<T> p = head;
        while (p != null) {
            ++result;
            p = p.next;
        } 
        return result;
    }
}