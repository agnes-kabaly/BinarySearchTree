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
        Queue<Node> childQueue = new LinkedList<>();
        if (root == null) {
            System.out.println("Tree is empty, delete() isn't possible");
        } else if (root.getData() != data){
            nodeQueue.add(root);
        }
        if (root.getData() == data) {
            childQueue.add(root.getLeftChild());
            childQueue.add(root.getRightChild());
            root = null;
        } else {
            while (!nodeQueue.isEmpty()) {
                Node p = nodeQueue.remove();
                if (p.getData() >= data) {
                    if (p.getLeftChild() != null) {
                        if (p.getLeftChild().getData() != data) {
                            nodeQueue.add(p.getLeftChild());
                        } else {
                            childQueue.add(p.getLeftChild().getRightChild());
                            p.setLeftChild(p.getLeftChild().getLeftChild());
                        }
                    }
                }
                if (p.getData() <= data) {
                    if (p.getRightChild() != null) {
                        if (p.getRightChild().getData() != data) {
                            nodeQueue.add(p.getRightChild());
                        } else {
                            childQueue.add(p.getRightChild().getLeftChild());
                            p.setRightChild(p.getRightChild().getRightChild());
                        }
                    }
                }
            }
        }
        Node p;
        while (!childQueue.isEmpty()) {
            p = childQueue.remove();
            insert(p.getData());
            if (p.getLeftChild() != null) {
                childQueue.add(p.getLeftChild());
            }
            if (p.getRightChild() != null) {
                childQueue.add(p.getRightChild());
            }
        }
        size--;
    }

    public void BFStraversal() {
        Queue<Node> nodeQueue = new LinkedList<>();
        Node p;
        if (root != null) {
            nodeQueue.add(root);
        }
        while (!nodeQueue.isEmpty()) {
            p = nodeQueue.remove();
            System.out.println(p.getData());
            if (p.getLeftChild() != null) {
                nodeQueue.add(p.getLeftChild());
            }
            if (p.getRightChild() != null) {
                nodeQueue.add(p.getRightChild());
            }
        }
    }

}
