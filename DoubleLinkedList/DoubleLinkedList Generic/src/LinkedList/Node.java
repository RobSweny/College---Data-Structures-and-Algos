package LinkedList;

// T is any value of any data type
public class Node <T> {
    T element; // list element
    Node<T> next; //successor link
    Node<T> prev; // previous link only used in doubley linked lists

    // constructor 2 params
    public Node (T elem, Node<T> next, Node<T> prev){
        this.element = elem;
        this.next = next;
        this.prev = prev;
    }

    // contructor 1 param
    public Node(T elem){
        // refers to previous method in first constructor
        this(elem, null, null);
    }

}
