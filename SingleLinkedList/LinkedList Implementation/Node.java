package linkedlist;

import java.util.LinkedList;

public class Node<T> {

    T element;
    Node<T> next;

    public Node(T elem, Node<T> next) {
        this.element = elem;
        this.next = next;
    }

    public Node(T elem){
        this(elem, null);
    }

    @Override
    public String toString(){
        return "<Element: " + element + ">";
    }


}
