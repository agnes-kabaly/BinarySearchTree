public class Main {

    public static void main(String[] args) {

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        System.out.println(binarySearchTree.getSize());
        binarySearchTree.insert(112);
        binarySearchTree.insert(888);
        binarySearchTree.insert(65);
        binarySearchTree.insert(600);
        binarySearchTree.insert(89);
        binarySearchTree.insert(248);
        binarySearchTree.insert(8);
        System.out.println(binarySearchTree.getSize());

    }


}
