package dataStructures;

import java.util.NoSuchElementException;

public interface QueueInterface<E> {
    /**
     * Puts an element into the queue and returns this interface to allow method chaining.
     *
     * @param element
     *            - A generic element to add to the queue
     * @return QueueInterface to allow method chaining.
     */
    QueueInterface<E> add(E element);

    /**
     * Returns the first element in the queue. Throws an exception if there are no elements in the queue.
     *
     * @return The first element in the queue
     * @throws NoSuchElementException
     *             When there are no elements in the queue
     */
    E element() throws NoSuchElementException;

    /**
     * Returns the first element, and removes it from the queue. Throws an exception if there are no elements in the queue.
     *
     * @return The first element in the queue
     * @throws NoSuchElementException
     *             When there are no elements in the queue
     */
    E remove() throws NoSuchElementException;

    /**
     * Attempt to add an element to the queue. Returns true if it was successful.
     *
     * @param element
     *            - A generic element to add to the queue
     * @return true if the element was added to the queue.
     */
    boolean offer(E element);

    /**
     * @return the first element in the queue. Returns null if the queue is empty.
     */
    E peek();

    /**
     * @return the first element and remove it from the queue. Returns null if the queue is empty.
     */
    E poll();
}