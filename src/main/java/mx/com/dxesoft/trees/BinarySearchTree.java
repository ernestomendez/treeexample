package mx.com.dxesoft.trees;

public class BinarySearchTree<T extends Comparable> {
    private Node<T> root;

    public BinarySearchTree(T t) {
        root = new Node<T>(t);
    }

    public Node<T> getRoot() {
        return root;
    }

//    public void setRoot(Node<T> root) {
//        this.root = root;
//    }

    public void add(T t) {
        Node<T> node = new Node<T>(t);
        if (null == root) {
            root = node;
        } else {
            addNode(root, node);
        }
    }

    private void addNode(Node<T> root, Node<T> node) {
        //if root > node se va a la izquierda, en cualquier otro caso a la derecha
        if (root.getValue().compareTo(node.getValue()) == 1) {
            if (root.getLeft() == null) {
                root.setLeft(node);
            } else {
                addNode(root.getLeft(), node);
            }
        } else {
            if (root.getRight() == null) {
                root.setRight(node);
            } else {
                addNode(root.getRight(), node);
            }
        }
    }

    public void displayInOrder() {
        displayInOrder(root);
    }

    private void displayInOrder(Node<T> root) {
        if (null != root) {
            displayInOrder(root.getLeft());
            System.out.print(root.getValue() + ", ");
            displayInOrder(root.getRight());
        }
    }

    public void displayPostOrder() {
        displayPostOrder(root);
    }

    private void displayPostOrder(Node<T> root) {
        if (null != root) {
            displayPostOrder(root.getLeft());
            displayPostOrder(root.getRight());
            System.out.print(root.getValue() + ", ");
        }
    }

    public void displayPreOrder() {
        displayPreOrder(root);
    }

    private void displayPreOrder(Node<T> root) {
        if (null != root) {
            System.out.print(root.getValue() + ", ");
            displayPreOrder(root.getLeft());
            displayPreOrder(root.getRight());
        }
    }

}
