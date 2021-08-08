package linkedlist;

public class Node<T> {
    T element;
    Node<T> next;

    public Node(T elem) {
        this(elem, null);
    }

    public Node(T elem, Node<T> next) {
        this.element = elem;
        this.next = next;
    }

    public T getData() {
        return element;
    }

    public T setData(T data) {
        return element = data;
    }

    @Override
    public String toString(){
        return element.toString();
    }
}
