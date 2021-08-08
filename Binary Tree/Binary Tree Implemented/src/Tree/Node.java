package Tree;

public class Node<T> {
    protected Node<T> leftChild;
    protected Node<T> rightChild;
    protected T element;

    public Node (T element) {
        this.element = element;
    }

    public String toString() {
        return this.element.toString();
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

}
