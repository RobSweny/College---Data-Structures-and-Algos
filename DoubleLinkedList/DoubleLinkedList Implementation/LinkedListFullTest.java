package linkedlist;

public class LinkedListFullTest {
    public static LinkedListFull ll;

    public static void main(String[] args) {

        // Default constructor - let's put "0" into head element.
        ll = new LinkedListFull();

        // add more elements to LinkedList
        ll.add("1");
        ll.add("2");
        ll.add("3");
        ll.add("4");
        ll.add("5");

        /*
         * Please note that primitive values can not be added into LinkedList directly. They must be converted to their
         * corresponding wrapper class.
         */

        System.out.println("Print: LinkedList: \t\t" + ll);
        System.out.println(".size(): \t\t\t\t" + ll.size());
        System.out.println(".get(3): \t\t\t\t" + ll.get(3) + " (get element at index:3 - list starts from 0)");
        System.out.println(".remove(2): \t\t\t\t" + ll.remove(2) + " (element removed)");
        System.out.println(".get(3): \t\t\t\t" + ll.get(3) + " (get element at index:3 - list starts from 0)");
        System.out.println(".size(): \t\t\t\t" + ll.size());
        System.out.println("Print again: \t" + ll);
    }

}

class LinkedListFull {

    static int counter;
    Node head;

    // Default constructor
    public LinkedListFull() {

    }

    // appends the specified element to the end of this list.
    public void add(Object data) {
        // Initialize Node only while adding 1st element
        if (head == null) {
            head = new Node(data);
        }
        Node lltemp = new Node(data);
        Node llcurrent = head;

        // Let's check for null pointer exception before iterate over llcurrent
        if (llcurrent != null) {
            // Starting at the head node, crawl to the end of the list and then add element after last node
            while (llcurrent.getNext() != null) {
                llcurrent = llcurrent.getNext();
            }
            // the last node's "next" reference set to our new node
            llcurrent.setNext(lltemp);
        }
        // increment the number of elements variable
        incrementCounter();
    }



    private static int getCounter() {
        return counter;
    }

    private static void incrementCounter() {
        counter++;
    }

    private void decrementCounter() {
        counter--;
    }

    // inserts the specified element at the specified position in this list
    public void add(Object data, int index) {
        Node lltemp = new Node(data);
        Node llCurrent = head;

        // Let's check for Null pointer exception before iterate over llcurrent
        if (llCurrent != null) {
            // crawl to the requested index or the last element in the list, whichever comes first
            for (int i = 0; i < index && llCurrent.getNext() != null; i++) {
                llCurrent = llCurrent.getNext();
            }
        }

        // set the new node's next-node reference to this node's next-node reference
        lltemp.setNext(llCurrent.getNext());

        // now set this node's next-node reference to the new node
        llCurrent.setNext(lltemp);

        // increment the number of elements variable
        incrementCounter();
    }

    public Object get(int index)
    // returns the element at the specified position in this list.
    {
        // index must be 1 or higher
        if (index < 0)
            return null;
        Node llCurrent = null;
        if (head != null) {
            llCurrent = head.getNext();
            for (int i = 0; i < index; i++) {
                if (llCurrent.getNext() == null)
                    return null;

                llCurrent = llCurrent.getNext();
            }
            return llCurrent.getData();
        }
        return llCurrent;

    }

    // removes the element at the specified position in this list.
    public boolean remove(int index) {

        // if the index is out of range, exit
        if (index < 1 || index > size())
            return false;

        // llCurrent will be the first element in the LinkedList
        Node llCurrent = head;
        // Check if the LinkedList is empty
        if (head != null) {
            // Iterate through the LinkedList until we get to index
            for (int i = 0; i < index; i++) {
                // If the next element is empty, then we can exit, as we removed the
                // last element in the LinkedList
                if (llCurrent.getNext() == null)
                    return false;
                // if ll.Current.getNext is not null, linkedlistCurrent (llCurrent) becomes the next node
                llCurrent = llCurrent.getNext();
            }
            // Once we get to the node before index, we set the next node as .getNext().getNext()
            // this means we are on the node before the specified index and simply point
            // the next node to be the one after the index.
            // user specified index .remove(2)
            // [0] [1] [X] [3] [4]
            // [0] [1] .getNext() would bring you [X]
            // [0] [1] .getNext().getNext() would bring you [3]
            // [0] [1] .setNext(llCurrent.getNext().getNext()); sets the next node to [3]
            llCurrent.setNext(llCurrent.getNext().getNext());

            // decrement the number of elements variable
            decrementCounter();
            return true;
        }
        return false;
    }



    // Returns the number of elements in this list.
    public int size() {
        return getCounter();
    }

    // iterates through the elements in the linked list and adds them to
    // the string "output"
    public String toString() {
        String output = "";
        // check if the linkedlist is empty
        if (head != null) {
            // iterate through the linked list and assign node value to llCurrent
            Node llCurrent = head.getNext();
            // while llCurrent isn't null, loop
            while (llCurrent != null) {
                // obtain each value with .getData and use the toString method
                output += "[" + llCurrent.getData().toString() + "]";
                // go to next node value
                llCurrent = llCurrent.getNext();
            }
        }
        return output;
    }

    private class Node {
        // Reference to the next node in the chain, or null if there isn't one.
        Node next;
        Node head;

        // Data carried by this node. could be of any type you need.
        Object data;

        // Node constructor
        public Node(Object dataValue) {
            next = null;
            data = dataValue;
        }

        public Node(Object dataValue, Node nextValue) {
            next = nextValue;
            data = dataValue;
        }

        public Object getData() {
            return data;
        }

        @SuppressWarnings("unused")
        public void setData(Object dataValue) {
            data = dataValue;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node nextValue) {
            next = nextValue;
        }

    }
}
