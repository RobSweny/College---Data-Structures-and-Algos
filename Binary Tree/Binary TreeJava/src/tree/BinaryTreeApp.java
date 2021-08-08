package tree;

public class BinaryTreeApp {

    public static void main(String[] args){
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.insert(5);
        binaryTree.insert(2);
        binaryTree.insert(2);

        binaryTree.inOrder();

    }
}
