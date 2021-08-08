public class Node<T> {

    protected  Node<T> left;
    protected  Node<T> right;
    protected T element;

    public Node (T element) {
        this.element = element;
    }

    public String toString() {
        return this.element.toString();
    }
}
