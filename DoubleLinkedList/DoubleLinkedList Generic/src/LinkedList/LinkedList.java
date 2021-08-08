package LinkedList;

import List.List;

// uses interface List
public class LinkedList <T> implements List<T> {

    // variables
    // uses Node class
    private Node<T> first;
    private Node<T> last;

    // constructor
    public LinkedList(){
        first = null;
        last  = null;
    }

    // checks if the list is empty
    public boolean isEmpty(){
        // first element is a null element
        return first == null;
    }

    // returns size of linkedlist
    @Override
    public int size() {
        if(isEmpty())
        {
            return 0;
        }
        int count = 1;

        Node<T> currentElement = first;
        while (currentElement.next != null)
        {
            count++;
            // once element is not null current element will increase by 1.
            currentElement = currentElement.next;
        }
        // return type int as specific in method
        return count;
    }

    @Override
    public void add(T elem) {

    }

    @Override
    public void add(int index, T elem) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public T remove(T target) {
        return null;
    }

    @Override
    public void addFirst(T elem) {
        if(isEmpty())
        {
            // only one element is present
            first = new Node<T>(elem, null, null);
            last = first;
        }
        else
        {
            first = new Node<T>(elem, first, null);
            first.next.prev = first;
        }

    }

}
