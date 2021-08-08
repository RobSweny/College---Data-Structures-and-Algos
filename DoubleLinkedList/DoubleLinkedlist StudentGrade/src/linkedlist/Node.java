package linkedlist;

public class Node<T> {

    Node<T> previous;
    T element;
    Node<T> next;

    public Node (T elem){
        this (null, elem, null);
    }

    public Node(Node<T> previous, T element, Node<T> next) {
        this.previous = previous;
        this.element = element;
        this.next = next;
    }

    public T getData() {
        return element;
    }

    public void setData(T data) {
        this.element = data;
    }

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "previous=" + previous +
                ", element=" + element +
                ", next=" + next +
                '}';
    }
}
