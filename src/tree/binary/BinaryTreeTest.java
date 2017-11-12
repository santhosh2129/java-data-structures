package tree.binary;

/**
 * Created by Santhosh on 12/11/17.
 */
public class BinaryTreeTest {

    public static void main(String arg[]){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(5);
        binaryTree.insert(3);
        binaryTree.insert(1);
        binaryTree.insert(2);
        binaryTree.insert(4);


        binaryTree.preOrderTraversal();

//        binaryTree.inOrderTraversal();
//        binaryTree.postOrderTraversal();
//
//        System.out.println(binaryTree.isElementPresent(7));
//        System.out.println(binaryTree.isElementPresent(1));

        //System.out.println(binaryTree.getTreeDepth());

        System.out.println("------------");

        BinaryTree mirrorTree = new BinaryTree(binaryTree.mirrior());

        mirrorTree.preOrderTraversal();
    }
}
