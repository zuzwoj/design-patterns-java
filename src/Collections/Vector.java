package Collections;
import Iterators.ForwardIterator;
import Iterators.ReverseIterator;

public class Vector<T> /*implements Interfaces.Collection<T>*/ {
    /*private vectorNode<T>[] content = new vectorNode<T>[100];
        private int size = 0;
        public void addObject(T value)
        {
            for (int i = 0; i < size; ++i) if (content[i].value.Equals(value)) return;
            if (size > content.Length)
            {
                vectorNode<T>[] newContent = new vectorNode<T>[content.Length * 2];
                Array.Copy(content, newContent, size);
                content = newContent;
            }
            content[size] = new vectorNode<T>(value);
            ++size;
        }
        public void deleteObject(T value)
        {
            int toDelete = size;
            for (int i = 0; i < size; ++i) if (content[i].value.Equals(value))
                {
                    toDelete = i;
                    break;
                }
            if (toDelete != size - 1) for (int i = toDelete; i < size - 1; ++i) content[i] = content[i + 1];
            --size;
        }
        public Iterator<T> GetForwardEnumerator() { return new ForwardIterator<T>(this); }
        public Iterator<T> GetReverseEnumerator() { return new ReverseIterator<T>(this); }
        public INode<T> First() 
        { 
            if (size > 0) return content[0];
            return default;
        }
        public INode<T> Last() 
        { 
            if (size > 0) return content[size - 1];
            return default;
        }
        public INode<T> Next(INode<T> current) 
        {
            if (size == 0) return default;
            if (current.Equals(content[size - 1])) return default;
            for (int i = 0; i < size; ++i) if (content[i].Equals(current)) return content[i + 1];
            return default;
        }
        public INode<T> Prev(INode<T> current) 
        {
            if (size == 0) return default;
            if (current.Equals(content[0])) return default;
            for (int i = size - 1; i > 0; --i) if (content[i].Equals(current)) return content[i - 1];
            return default;
        }
        public int Count() { return size; }*/
}