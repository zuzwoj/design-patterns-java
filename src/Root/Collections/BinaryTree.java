package Root.Collections;
import java.util.Random;

public class BinaryTree<T> implements Root.Interfaces.Collection<T> {
    public Root.Nodes.Tree<T> root = null;
    public int size = 0;

    public int Count() { return size; }
    public Root.Iterators.Iterator<T> GetForwardEnumerator() { return new Root.Iterators.ForwardIterator<T>(this); }
    public Root.Iterators.Iterator<T> GetReverseEnumerator() { return new Root.Iterators.ReverseIterator<T>(this); }

    public void addObject(T value) {
        Root.Nodes.Tree<T> toAdd = new Root.Nodes.Tree<T>(value);
        var rand = new Random();
        if (root == null) {
            root = toAdd;
            ++size;
            return;
        }
        else {
            Root.Nodes.Tree<T> p = root;
            while (true) {
                if (p.left == null && p.right == null) {
                    if (rand.nextInt() % 2 == 0) {
                        p.left = toAdd;
                        toAdd.parent = p;
                        ++size;
                        return;
                    }
                    else {
                        p.right = toAdd;
                        toAdd.parent = p;
                        ++size;
                        return;
                    }
                }
                else if (p.left == null) {
                    p.left = toAdd;
                    toAdd.parent = p;
                    ++size;
                    return;
                }
                else if (p.right == null) {
                    p.right = toAdd;
                    toAdd.parent = p;
                    ++size;
                    return;
                }
                else {
                    if (rand.nextInt() % 2 == 0) { p = p.left; }
                    else { p = p.right; }
                }
            }
        }
    }

    public void deleteObject(T value) {
        if (root == null) return;
        if (size == 1) {
            if (root.getValue().equals(value)) root = null;
            return;
        }
        Root.Iterators.ForwardIterator<T> it = (Root.Iterators.ForwardIterator<T>)GetForwardEnumerator();
        do {
            if (it.Current().getValue().equals(value)) {
                Root.Nodes.Tree<T> p = (Root.Nodes.Tree<T>)Last();
                it.Current().setValue(p.value);
                p = p.parent;
                if (p.left.equals((Root.Nodes.Tree<T>)Last())) p.left = null;
                else p.right = null;
                return;
            }
        } while (it.MoveNext());
    }

    public Root.Interfaces.Node<T> First() {
        if (root == null) return null;
        return root; 
    }

    public Root.Interfaces.Node<T> Last() {
        if (root == null) return null;
        Root.Nodes.Tree<T> p = root;
        while (true) {
            if (p.right == null) {
                if (p.left == null) return p;
                else p = p.left;
            }
            else { p = p.right; }
        }
    }

    public Root.Interfaces.Node<T> Next(Root.Interfaces.Node<T> current) {
        if (current.equals(Last())) return null;
        Root.Nodes.Tree<T> p = (Root.Nodes.Tree<T>)current;
        if (p.left != null) return p.left;
        if (p.right != null) return p.right;
        Root.Nodes.Tree<T> prev = p;
        while (true) {
            p = p.parent;
            if (p.left.equals(prev) && p.right != null) return p.right;
            prev = p;
        }
    }

    public Root.Interfaces.Node<T> Prev(Root.Interfaces.Node<T> current) {
        if (current.equals(root)) return null;
        Root.Nodes.Tree<T> p = ((Root.Nodes.Tree<T>)current).parent;
        if (p.left.equals(((Root.Nodes.Tree<T>)current))) return p;
        else {
            while (true) {
                if (p.right == null) {
                    if (p.left == null) return p;
                    else p = p.left;
                }
                else { p = p.right; }
            }
        }
    }
}