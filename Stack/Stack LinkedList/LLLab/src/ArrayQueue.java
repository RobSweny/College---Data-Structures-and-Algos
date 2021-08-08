import java.util.Arrays;

/*
Queue - FIFO
docs - https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Queue.html

         +--+--+--+--+
FRONT -- |  |  |  |  | -- REAR
         +--+--+--+--+

HOW TO INSERT (ENQUEUE) 5
If there is only one element in the arraylist this will be both front and rear
when another element is inserted we will add to rear. rear++
         +--+---+---+---+
FRONT -- |  |   |   | 5 | -- REAR
         +--+---+---+---+
         +--+---+---+---+
FRONT -- |  |   | 5 |   | -- REAR
         +--+---+---+---+
         +--+---+---+---+
FRONT -- |  | 5 |   |   | -- REAR
         +--+---+---+---+
         +---+--+---+---+
FRONT -- | 5 |  |   |   | -- REAR
         +---+--+---+---+
5 Inserted

REMOVE OR DEQUEUE will remove top/front from ArrayList without searching through ArrayList.
When we remove an element from the array we will add to front. front++

Insert - enqueue (data)
Remove - dequeue ()
Size - size ()
 */
public class ArrayQueue
{
    int arrayQueue[] = new int[5];
    int size, front, rear;

    // Add an element to the ArrayQueue
    public void enQueue(int data)
    {
        try
        {
            // Insert the element the user has requested in the arrayQueue at the rear position [Last Position]
            arrayQueue[rear] = data;

            System.out.println("Adding " + data + " to ArrayList");

            // Add to the rear for future reference
            rear++;
            // Increase Size variable to show Size of arrayQueue
            size++;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Attempted to add " + data + ", the arrayQueue is full, we can only remove elements");
        }
    }

    // Print size of the arrayQueue
    public void printSize()
    {
        System.out.println("The size of the array is " + size);
    }

    // Rather then remove an element we can simply point front to the next element in the list
    public void deQueue() {
        try
        {
            System.out.println("Removing  " + arrayQueue[front] + " from ArrayList");
            // First we find the front element of the ArrayList
            int data = arrayQueue[front];
            // Make front the first element in the ArrayQueue
            front++;
            // Reduce size of ArrayQueue as we are no longer reference the value in the 0 position of ArrayQueue
            size--;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("The arrayQueue is empty, we cannot remove any elements");
        }
    }

    public void printAll()
    {
        System.out.print("Elements: ");
        // Loop through elements in ArrayList and print
        for(int i=0; i<size; i++)
        {
            // We can't start from 0 as this index may have been deQueue'd
            System.out.print(arrayQueue[front + i] + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args)
    {
        ArrayQueue arrayqueue = new ArrayQueue();
        arrayqueue.enQueue(5);
        arrayqueue.enQueue(2);
        arrayqueue.enQueue(2);
        arrayqueue.enQueue(2);
        arrayqueue.enQueue(2);

        arrayqueue.printSize();
        arrayqueue.printAll();

        arrayqueue.enQueue(2);
        arrayqueue.deQueue();
        arrayqueue.deQueue();
        arrayqueue.deQueue();
        arrayqueue.deQueue();
        arrayqueue.deQueue();

        arrayqueue.printSize();
        arrayqueue.printAll();

        arrayqueue.deQueue();

    }
}


