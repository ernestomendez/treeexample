package mx.com.dxesoft;

import mx.com.dxesoft.trees.BinarySearchTree;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree<>(40);

        binarySearchTree.add(25);
        binarySearchTree.add(78);

        binarySearchTree.displayInOrder();
        System.out.println("In order");
        binarySearchTree.displayPostOrder();
        System.out.println("Post order");
        binarySearchTree.displayPreOrder();
        System.out.println("pre order");

        binarySearchTree.add(10);
        binarySearchTree.add(3);
        binarySearchTree.add(17);
        binarySearchTree.add(32);
        binarySearchTree.displayInOrder();
        System.out.println("In order");
        binarySearchTree.displayPostOrder();
        System.out.println("Post order");
        binarySearchTree.displayPreOrder();
        System.out.println("pre order");

        binarySearchTree.add(30);
        binarySearchTree.add(38);
        binarySearchTree.displayInOrder();
        System.out.println("In order");
        binarySearchTree.displayPostOrder();
        System.out.println("Post order");
        binarySearchTree.displayPreOrder();
        System.out.println("pre order");

        binarySearchTree.add(78);
        binarySearchTree.add(50);
        binarySearchTree.add(93);
        binarySearchTree.displayInOrder();
        System.out.println("In order");
        binarySearchTree.displayPostOrder();
        System.out.println("Post order");
        binarySearchTree.displayPreOrder();
        System.out.println("pre order");
    }
}
