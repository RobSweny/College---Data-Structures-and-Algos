package Tree;

public class Tree<T extends Comparable<T>> implements TreeInterface<T> {
    // declare and initalize root node
    Node<T> root = null;

    /**
     * function to an element to the node
     * @param elem
     */
    @Override
    public void insert(T elem) {
        // if the Binary tree is empty we can insert the element into the root node
        if (isEmpty()) {
            root = new Node<T>(elem);
            System.out.println("Inserted " + ((Food) elem).getName()) ;
        } else {
            // else, from the root node, iterarate through the tree to find the appropriate placement of the element
            insert(elem, root);
        }
    }

    /**
     * Insert into binary tree
     * @param elem
     * @param current
     */
    private void insert(T elem, Node<T> current) {
        // CompareTo gives us -1 if it's less than, 0 if it's equal and 1 if it's greater than
        if (elem.compareTo(current.element) == -1) {
            // if the left child is null, we can add it to the left child node
            if (current.leftChild == null ) {
                current.leftChild = new Node<T>(elem);
                System.out.println("Inserted " + ((Food) elem).getName());
            } else {
                // else, move to the left child Node and recursively call insert again from that new position
                insert(elem, current.leftChild);
            }
        } else {
            // if the right child is null, we can add it to the right child node
            if (current.rightChild == null ) {
                current.rightChild = new Node<T>(elem);
                System.out.println("Inserted " + ((Food) elem).getName());
            } else {
                // else, move to the right child Node and recursively call insert again from that new position
                insert(elem, current.rightChild);
            }
        }
    }

    /**
     * @return if the BinaryTree is Empty
     */
    @Override
    public boolean isEmpty() {
        // return true if the root of the tree is null
        return root == null;
    }

    /**
     * @return count iterating through the tree, starting from the root node
     */
    @Override
    public int count() {
        return (count(root));
    }

    /**
     * @return count of Nodes in the BinaryTree
     */
    private int count(Node<T> current) {
        // if root is null, return 0 elements in tree
        if (isEmpty()) return 0;
        // as the root is not null, start count at 1
        int count = 1;
        // recursively call count iterating through the left childen of the binary tree, adding to count as we hit each node
        if (current.leftChild != null) count += count(current.leftChild);
        // recursively call count iterating through the right childen of the binary tree, adding to count as we hit each node
        if (current.rightChild != null) count += count(current.rightChild);
        // return count
        return count;
    }

    /**
     * @return the node with the highest health index
     */
    @Override
    public void maximumHealthyIndex() {
        int maximumHealthIndex = 10;
        String healthiestfood = "";
        maximumHealthyIndex(maximumHealthIndex, healthiestfood, root);
    }

    /**
     * function to recursively iterate through the nodes in the binary tree and check for the healthiest options
     * @param maximumHealthIndex
     * @param healthiestfood
     * @param current
     */
    private void maximumHealthyIndex(int maximumHealthIndex, String healthiestfood, Node<T> current) {
        // if root is null, return 0 elements in tree
        if (isEmpty()) System.out.println("There are no nodes in this BinaryTree");;
        // as 0 is the healthiest option, we set it to 10, as any nodes will be equal or less than 10

        // As we iterate over the nodes we check if the health index is lower than the current lowest
        // if it is, we retrieve the names and index values for later
        if (((Food) current.getElement()).getHealthIndex() < maximumHealthIndex) {
            maximumHealthIndex = ((Food) current.getElement()).getHealthIndex();
            healthiestfood = ((Food) current.getElement()).getName();
        }
        // recursively iterate through the nodes in the binary tree
        // when we have gone through all the nodes, print the healthiest food
        if (current.leftChild != null) maximumHealthyIndex(maximumHealthIndex, healthiestfood, current.leftChild);
        else if (current.rightChild != null) maximumHealthyIndex(maximumHealthIndex, healthiestfood, current.rightChild);
        else System.out.println("The healthiest food is " + healthiestfood + " at a health index of " + maximumHealthIndex);
    }

    /**
     * @return the node with the highest health index
     */
    @Override
    public void minimumHealthyIndex() {
        int minimumHealthIndex = 0;
        String unhealthiestfood = "";
        minimumHealthyIndex(minimumHealthIndex, unhealthiestfood, root);
    }

    /**
     * function to recursively iterate through the nodes in the binary tree and check for the healthiest options
     * @param minimumHealthIndex
     * @param unhealthiestfood
     * @param current
     */
    private void minimumHealthyIndex(int minimumHealthIndex, String unhealthiestfood, Node<T> current) {
        // if root is null, return 0 elements in tree
        if (isEmpty()) System.out.println("There are no nodes in this BinaryTree");;
        // as 0 is the healthiest option, we set it to 10, as any nodes will be equal or less than 10

        // As we iterate over the nodes we check if the health index is lower than the current lowest
        // if it is, we retrieve the names and index values for later
        if (((Food) current.getElement()).getHealthIndex() > minimumHealthIndex) {
            minimumHealthIndex = ((Food) current.getElement()).getHealthIndex();
            unhealthiestfood = ((Food) current.getElement()).getName();
        }
        // recursively iterate through the nodes in the binary tree
        // when we have gone through all the nodes, print the healthiest food
        if (current.leftChild != null) minimumHealthyIndex(minimumHealthIndex, unhealthiestfood, current.leftChild);
        else if (current.rightChild != null) minimumHealthyIndex(minimumHealthIndex, unhealthiestfood, current.rightChild);
        else System.out.println("The unhealthiest food is " + unhealthiestfood + " at a health index of " + minimumHealthIndex);
    }

    /**
     * @return a representation of the tree
     */
    @Override
    public void printTree() {
        int Binarylevel = 0;
        if (root == null) {
            System.out.println("This is an empty Tree");
        }
        printTree(root, Binarylevel);
    }

    /**
     * function to print the binary tree horizontally using the node and levels
     * @param current
     * @param Binarylevel
     */
    private void printTree(Node<T> current, int Binarylevel) {
        // iterate recursively through the right nodes and print, each time iterating to the next binary level
        if (current.rightChild != null) printTree(current.rightChild, Binarylevel + 1);
        if (Binarylevel != 0){
            for (int i=0; i < Binarylevel-1; i++)
                // create a tab for each level
                System.out.print("| \t");
            // formatting
            System.out.println("|--" + ((Food) current.getElement()).getHealthIndex());
        } else
            System.out.println(((Food) current.getElement()).getHealthIndex());
        // iterate recursively through the left nodes and print, each time iterating to the next binary level
        if (current.leftChild != null) printTree(current.leftChild, Binarylevel + 1);
    }
}
