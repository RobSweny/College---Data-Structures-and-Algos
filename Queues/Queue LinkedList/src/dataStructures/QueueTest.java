package dataStructures;

public class QueueTest {

    public static void main(String[] args) {
        QueueInterface<String> queueTest;

        queueTest = new GenericLinkedListQueue<>();
        // queueTest = new GenericArrayQueue<>();

        queueTest.add("5");
        System.out.println(queueTest.peek());
    }

}
