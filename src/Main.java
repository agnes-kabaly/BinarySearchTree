public class Main {

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        System.out.println("first size:" + binarySearchTree.getSize());

        binarySearchTree.insert(27);
        binarySearchTree.insert(14);
        binarySearchTree.insert(35);
        binarySearchTree.insert(10);
        binarySearchTree.insert(19);
        binarySearchTree.insert(31);
        binarySearchTree.insert(42);
        binarySearchTree.insert(8);
        binarySearchTree.insert(12);
        binarySearchTree.insert(17);
        binarySearchTree.insert(20);
        binarySearchTree.insert(29);
        binarySearchTree.insert(33);
        binarySearchTree.insert(40);
        binarySearchTree.insert(53);

        System.out.println("BFS traversal:");
        binarySearchTree.BFStraversal();

        System.out.println("Preorder:");
        binarySearchTree.preorder(binarySearchTree.getRoot());

        System.out.println("Inorder:");
        binarySearchTree.inorder(binarySearchTree.getRoot());

        System.out.println("Postorder:");
        binarySearchTree.postorder(binarySearchTree.getRoot());

        binarySearchTree.delete(27);
        System.out.println("size: " + binarySearchTree.getSize());

        binarySearchTree.insert(10);
        System.out.println("size: " + binarySearchTree.getSize());
        binarySearchTree.BFStraversal();
        System.out.println("size: " + binarySearchTree.getSize());

    }


}
