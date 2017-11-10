package tree.nAriy;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by Santhosh on 10/11/17.
 */
public class Node<T> {
    private T info;
    private List<Node<T>> children;
    private Node<T> parent;

    public T getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public void setChildren(List<Node<T>> children) {
        for (Node<T> child : children){
            child.setParent(this);
        }

        this.children = children;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public Node(T info) {
        this.info = info;
        this.children = new ArrayList<>();
    }


    public void addChild(Node<T> node){
        node.setParent(this);
        children.add(node);
    }


    public void addChildAt(int index, Node<T> child) {
        child.setParent(this);
        this.children.add(index, child);
    }

    public void removeChildren() {
        this.children.clear();
    }

    public Node<T> removeChildAt(int index) {
        return children.remove(index);
    }

    public boolean removeChild(Node<T> childToBeDeleted) {
        List<Node<T>> list = getChildren();
        return list.remove(childToBeDeleted);
    }

    public Node<T> getChildAt(int index) {
        return children.get(index);
    }
}
