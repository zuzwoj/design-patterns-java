package Collections;
import Iterators.ForwardIterator;
import Iterators.ReverseIterator;

public class DoublyLinkedList<T> /*implements Interfaces.Collection<T>*/ {
    /*private Node<T> head = null;
        private Node<T> tail = null;

        public void addObject(T value)
        {
            Node<T> p = head;
            while (p != null)
            {
                if (p.value.Equals(value)) return;
                p = p.next;
            }
            Node<T> node = new Node<T>(value);
            if (head == null)
            {
                head = node;
                tail = node;
            }
            else
            {
                tail.next = node;
                node.prev = tail;
                tail = node;
            }
        }
        public void deleteObject(T value)
        {
            Iterator<T> it = GetForwardEnumerator();
            Node<T> cur = null;
            while (it.MoveNext())
            {
                cur = it.Current() as Node<T>;
                if (cur.value.Equals(value)) break;
            }
            if (cur != null)
            {
                if (cur.prev != null && cur.next != null)
                {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
                else if (cur.prev == null)
                {
                    if (cur.next == null)
                    {
                        head = null;
                        tail = null;
                    }
                    else { cur.next.prev = null; }
                }
                else if (cur.next == null) { cur.prev.next = null; }
            }

        }
        public Iterator<T> GetForwardEnumerator() { return new ForwardIterator<T>(this); }
        public Iterator<T> GetReverseEnumerator() { return new ReverseIterator<T>(this); }
        public INode<T> First() 
        { 
            if (head != null) return head;
            return default;
        }
        public INode<T> Last() 
        { 
            if (tail != null) return tail;
            return default;
        }
        public INode<T> Next(INode<T> current) 
        {
            if (current.Equals(tail)) return default;
            Node<T> p = head;
            do
            {
                if (p.Equals(current)) return p.next;
                p = p.next;
            } while (p.next != null);
            return default;
        }
        public INode<T> Prev(INode<T> current) 
        {
            if (current.Equals(head)) return default;
            Node<T> p = tail;
            do
            {
                if (p.value.Equals(current)) return p.prev;
                p = p.prev;
            } while (p.prev != null);
            return default;
        }
        public int Count()
        {
            int result = 0;
            Node<T> p = head;
            while (p != null)
            {
                ++result;
                p = p.next;
            } 
            return result;
        }*/
}