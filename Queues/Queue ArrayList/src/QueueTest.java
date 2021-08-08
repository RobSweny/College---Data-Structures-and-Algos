public class QueueTest
{
    public static void main(String[] args)
    {
        Queue<Integer> queue = new QueueUsingArray<>(Integer.class, 4);

        queue.enqueue(3);
        queue.enqueue(32);
        queue.enqueue(31);
        queue.enqueue(33);

        System.out.print(queue.dequeue());
        System.out.print(queue.dequeue());
        System.out.print(queue.dequeue());

    }
}
