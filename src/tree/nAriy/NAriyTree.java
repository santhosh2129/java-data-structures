package tree.nAriy;

/**
 * Created by Santhosh on 11/11/17.
 */
public class NAriyTree<T> {

    private Node<T> root;

    public NAriyTree(Node<T> root) {
        this.root = root;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }


    public boolean isEmpty(){
        return root == null;
    }

    //Size of nAry tree

    public int size(Node<T> root){
        return rootdesandantSize(root) +1;
    }

    private int rootdesandantSize(Node<T> root){
        int size = root.getChildren().size();
        for (Node<T> child : root.getChildren()){
            size += rootdesandantSize(child);
        }
        return size;
    }

    public void preOderTraversal(Node<T> root){
        System.out.println(root.getInfo());
        for (Node<T> child : root.getChildren()) {
            preOderTraversal(child);
        }
    }


    public void postOrderTraversal(Node<T> root){
        for (Node<T> child : root.getChildren()) {
            preOderTraversal(child);
        }
        System.out.println(root.getInfo());

    }




}
