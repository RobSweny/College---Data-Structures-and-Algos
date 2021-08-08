package tree;

public class BinaryTreeNode <T>{
    protected T element;
    protected BinaryTreeNode<T> left;
    protected BinaryTreeNode<T> right;

    public BinaryTreeNode (T element) {
        this.element = element;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        String leftValues = (left == null ? "NULL" : left.element.toString());
        String rightValues = (right == null ? "NULL" : right.element.toString());
        return "tree.BinaryTreeNode{" + "element= " + element + ", left= " + leftValues + ", right=" + rightValues + "}";
    }
}
