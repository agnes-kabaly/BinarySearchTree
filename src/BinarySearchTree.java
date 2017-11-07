import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {

    private int size;
    private Node root;

    public int getSize() {
        return size;
    }

    public void insert(int data) {
        Queue<Node> nodeQueue = new LinkedList<>();
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
        } else {
            nodeQueue.add(root);
        }
        while (!nodeQueue.isEmpty()) {
            Node p = nodeQueue.remove();
            if (p.getData() >= newNode.getData()) {
                if (p.getLeftChild() == null) {
                    p.setLeftChild(newNode);
                } else {
                    nodeQueue.add(p.getLeftChild());
                }
            }
            if (p.getData() < newNode.getData()) {
                if (p.getRightChild() == null) {
                    p.setRightChild(newNode);
                } else {
                    nodeQueue.add(p.getRightChild());
                }
            }
        }
        size++;
    }

    public void delete(int data) {
        Queue<Node> nodeQueue = new LinkedList<>();
        Node node = new Node(data);

        if (root == null) {
            System.out.println("Tree is empty, delete() isn't possible");
        }

        while (!nodeQueue.isEmpty()) {
            Node p = nodeQueue.remove();

        }
        size--;
    }

    public int search(int data) {

        return 0;
    }

    public int access(int index) {

        return 0;
    }

    public int visiting() {
        return 0;
    }

}
