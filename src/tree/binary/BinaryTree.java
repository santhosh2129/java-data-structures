package tree.binary;

/**
 * Created by Santhosh on 12/11/17.
 */
public class BinaryTree {
    BinaryNode root;

    public BinaryTree(){
        root=null;
    }


    public BinaryTree(BinaryNode root){
        this.root=root;
    }

    public boolean isEmpty(){
        return root==null;
    }

    public void insert (int data){
        root = insert (root, data);
    }

    private BinaryNode insert(BinaryNode node, int data) {
        if (node == null){
            node = new BinaryNode(data);
        } else {
            if (node.getRight() == null) {
                node.setRight(insert(node.getRight(), data));
            } else {
                node.setLeft(insert(node.getLeft(), data));
            }
        }
        return node;
    }

    public void preOrderTraversal(){
        preOrderTraversal(root);
    }


    public boolean isElementPresent(int data){
        return checkIsElementPresent(root,data);
    }

    private boolean checkIsElementPresent(BinaryNode node, int data) {
        if(node==null){
            return false;
        }
        if (node.getData() == data){
            return true;
        }else {
           if(checkIsElementPresent(node.getRight(),data)){
               return true;
            } else {
               return checkIsElementPresent(node.getLeft(),data);
           }
        }
    }

    private  void preOrderTraversal(BinaryNode node){
        if(node != null) {
            System.out.println(node.getData());
            preOrderTraversal(node.getLeft());
            preOrderTraversal(node.getRight());
        }

    }


    public void inOrderTraversal(){
        inOrderTraversal(root);
    }

    private  void inOrderTraversal(BinaryNode node){
        if(node != null) {
            inOrderTraversal(node.getLeft());
            System.out.println(node.getData());
            inOrderTraversal(node.getRight());
        }

    }



    public void postOrderTraversal(){
        postOrderTraversal(root);
    }

    private  void postOrderTraversal(BinaryNode node){
        if(node != null) {
            postOrderTraversal(node.getLeft());
            postOrderTraversal(node.getRight());
            System.out.println(node.getData());
        }

    }


    public int getTreeDepth(){
        return calculateDepth(root);
    }

    private int calculateDepth(BinaryNode node) {
        if (node==null){
            return 0;
        }
        return (1+ Math.max(calculateDepth(node.getLeft()),calculateDepth(node.getRight())));
    }

    public BinaryNode mirrior(){
        BinaryNode tempNode = new BinaryNode(root);
         return mirror(tempNode);
    }

    private BinaryNode mirror(BinaryNode node) {
        if (node == null) {
            return node;
        }

        BinaryNode left = mirror(node.getLeft());
        BinaryNode right = mirror(node.getRight());

        node.setLeft(right);
        node.setRight(left);

        return node;
    }


}
