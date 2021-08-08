package Tree;

public interface TreeInterface<T extends Comparable<T>> {
    /**
     * function to an element to the node
     * @param elem
     */
    public void insert (T elem);

    /**
     * @return if the BinaryTree is Empty
     */
    public boolean isEmpty();

    /**
     * @return count iterating through the tree, starting from the root node
     */
    public int count ();

    /**
     * @return the node with the highest health index
     */
    public void maximumHealthyIndex();

    /**
     * @return the node with the highest health index
     */
    public void minimumHealthyIndex();

    /**
     * @return a representation of the tree
     */
    public void printTree();
}
