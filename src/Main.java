public class Main {

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        System.out.println(binarySearchTree.getSize());
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
        System.out.println(binarySearchTree.getSize());
        System.out.println("");
        binarySearchTree.delete(27);
        System.out.println(binarySearchTree.getSize());


    }


}
