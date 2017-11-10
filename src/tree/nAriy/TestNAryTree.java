package tree.nAriy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Santhosh on 11/11/17.
 */
public class TestNAryTree {

    /**
     *                      1
     *                 /    |     \
     *                2     3     4
     *             /   |    |      |
     *            11   12   21     31
     * */



    public static void main(String argp[]){
        Node<Integer> root = new Node<Integer>(1);
        Node<Integer> c1 = new Node<Integer>(2);
        Node<Integer> c2 = new Node<Integer>(3);
        Node<Integer> c3 = new Node<Integer>(4);
        Node<Integer> c11 = new Node<Integer>(11);
        Node<Integer> c12 = new Node<Integer>(12);
        Node<Integer> c21 = new Node<Integer>(21);
        Node<Integer> c31 = new Node<Integer>(31);
        c1.addChild(c11);
        c1.addChild(c12);
        c2.addChild(c21);
        c3.addChild(c31);
        root.addChild(c1);
        root.addChild(c2);
        root.addChild(c3);
        NAriyTree<Integer> nAriyTree = new NAriyTree<>(root);
        System.out.println(nAriyTree.size(root));
        nAriyTree.preOderTraversal(root);
        nAriyTree.postOrderTraversal(root);

    }
}
