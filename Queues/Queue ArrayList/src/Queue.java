interface Queue<E>
{
    void enqueue(E e);
    E dequeue();
    boolean isEmpty();
    boolean isFull();
    int size();
}