package linkedlist;

import List.List;

public class LinkedList<T> implements List<T> {

    private Node<T> first;
    private Node<T> last;

    public LinkedList() {
        first = null;
        last = null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        Node temp = first;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

    @Override
    public void add(T elem) {
        if(isEmpty()){
            first = new Node<T>(elem);
            last = first;
        } else {
            last.next = new Node<T>(elem);
            last = last.next;
        }
    }

    @Override
    public void add(int index, T elem) {

    }
}
