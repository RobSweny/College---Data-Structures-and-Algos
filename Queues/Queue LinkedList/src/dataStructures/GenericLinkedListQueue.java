package dataStructures;

import java.util.NoSuchElementException;

public class GenericLinkedListQueue<E> implements QueueInterface<E> {
    private Node<E> first, last;

    private static class Node<E> {
        private E data;

        private Node<E> back;

        public Node(E element) {
            data = element;
        }
    }

    @Override
    public QueueInterface<E> add(E element) {
        Node<E> newElement = new Node<E>(element);
        if (first == null) {
            first = newElement;
        } else {
            if (first.back == null) {
                first.back = newElement;
            } else {
                last.back = newElement;
            }

            last = newElement;
        }

        return this;
    }

    @Override
    public E element() throws NoSuchElementException {
        if (first == null) {
            throw new NoSuchElementException("Queue does not contain any items.");
        }

        return first.data;
    }

    @Override
    public E remove() throws NoSuchElementException {
        if (first == null) {
            throw new NoSuchElementException("Queue does not contain any items.");
        }

        E output = first.data;
        first = first.back;
        return output;
    }

    @Override
    public boolean offer(E e) {
        // Only way for the offer to return false is if we run out of VM memory.
        add(e);
        return true;
    }

    @Override
    public E peek() {
        return first == null ? null : first.data;
    }

    @Override
    public E poll() {
        if (first == null) {
            return null;
        }

        E output = first.data;
        first = first.back;

        return output;
    }

}