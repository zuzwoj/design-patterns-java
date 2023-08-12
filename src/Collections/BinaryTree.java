package Collections;
import java.util.Random;
import Iterators.ForwardIterator;
import Iterators.ReverseIterator;

public class BinaryTree<T> /*implements Interfaces.Collection<T>*/ {
    /*public treeNode<T> root = null;
        public int size = 0;

        public void addObject(T value)
        {
            treeNode<T> toAdd = new treeNode<T>(value);
            var rand = new Random();
            if (root == null)
            {
                root = toAdd;
                ++size;
                return;
            }
            else
            {
                treeNode<T> p = root;
                while (true)
                {
                    if (p.left == null && p.right == null)
                    {
                        if (rand.Next() % 2 == 0)
                        {
                            p.left = toAdd;
                            toAdd.parent = p;
                            ++size;
                            return;
                        }
                        else
                        {
                            p.right = toAdd;
                            toAdd.parent = p;
                            ++size;
                            return;
                        }
                    }
                    else if (p.left == null)
                    {
                        p.left = toAdd;
                        toAdd.parent = p;
                        ++size;
                        return;
                    }
                    else if (p.right == null)
                    {
                        p.right = toAdd;
                        toAdd.parent = p;
                        ++size;
                        return;
                    }
                    else
                    {
                        if (rand.Next() % 2 == 0) { p = p.left; }
                        else { p = p.right; }
                    }
                }
            }
        }

        public void deleteObject(T value)
        {
            if (root == null) return;
            if (size == 1)
            {
                if (root.Value.Equals(value)) root = null;
                return;
            }
            ForwardIterator<T> it = (ForwardIterator<T>)GetForwardEnumerator();
            do
            {
                if (it.Current().Value.Equals(value))
                {
                    treeNode<T> p = (treeNode<T>)Last();
                    it.Current().Value = p.value;
                    p = p.parent;
                    if (p.left.Equals((treeNode<T>)Last())) p.left = null;
                    else p.right = null;
                    return;
                }
            } while (it.MoveNext());
        }

        public int Count() { return size; }
        public INode<T> First() 
        {
            if (root == null) return default;
            return root; 
        }
        public INode<T> Last() 
        {
            if (root == null) return default;
            treeNode<T> p = root;
            while (true)
            {
                if (p.right == null)
                {
                    if (p.left == null) return p;
                    else p = p.left;
                }
                else { p = p.right; }
            }
        }
        public INode<T> Next(INode<T> current) 
        {
            if (current.Equals(Last())) return default;
            treeNode<T> p = (treeNode<T>)current;
            if (p.left != null) return p.left;
            if (p.right != null) return p.right;
            treeNode<T> prev = p;
            while (true)
            {
                p = p.parent;
                if (p.left.Equals(prev) && p.right != null) return p.right;
                prev = p;
            }
        }
        public INode<T> Prev(INode<T> current) 
        {
            if (current.Equals(root)) return default;
            treeNode<T> p = ((treeNode<T>)current).parent;
            if (p.left.Equals(((treeNode<T>)current))) return p;
            else
            {
                while (true)
                {
                    if (p.right == null)
                    {
                        if (p.left == null) return p;
                        else p = p.left;
                    }
                    else { p = p.right; }
                }
            }
        }

        public Iterator<T> GetForwardEnumerator() { return new ForwardIterator<T>(this); }
        public Iterator<T> GetReverseEnumerator() { return new ReverseIterator<T>(this); }*/
}