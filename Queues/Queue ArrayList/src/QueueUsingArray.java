import java.lang.reflect.Array;

public class QueueUsingArray<E> implements Queue<E>
{

    private E elements[];
    private int front, rear;
    private int size, maxQueueSize;

    // constructor
    public QueueUsingArray(Class<E> element, int maxQueueSize)
    {
        front = 0;
        rear = -1;
        size = 0;
        this.maxQueueSize = maxQueueSize;
        elements = (E[])Array.newInstance(element, maxQueueSize);
    }

    @Override
    public void enqueue(E e)
    {
        if (isFull()) {
            System.out.print("We can no longer add elements, the array is full");
            return;
        }
        // moves the queue to the start of the array whenever it reaches the end
        if (rear == maxQueueSize - 1)
        {
            int j = 0;
            for (int i = front; i <= rear; i++)
            {
                elements[j++] = elements[i];
            }
            front = 0;
            rear = size - 1;
        }
        elements[++rear] = e;
        size++;
    }

    @Override
    public E dequeue()
    {
        if (isEmpty()) {
            System.out.print("Nothing to remove, the queue is empty");
            return null;
        }
        E saved = elements[front];
        elements[front] = null;
        front++;
        size--;
        return saved;
    }

    @Override
    public boolean isEmpty()
    {
        return (size == 0);
    }

    @Override
    public boolean isFull()
    {
        return size == maxQueueSize;
    }

    @Override
    public int size()
    {
        return size;
    }
}
