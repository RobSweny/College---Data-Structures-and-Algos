import java.util.*;

public class LinkedListStack
{

    // the node will contain to values (The data and the reference to the next node)
    class Node
    {
        public int data;
        public Node next;
    }

    // the top node on the stack
    private Node top;

    // constructor - creates an empty stack
    public LinkedListStack()
    {
        top = null;
    }

    // push adds an element to the stack
    public void push(int x)
    {
        // create a new node
        Node n = new Node();
        // set the nodes data to x (user input)
        n.data = x;
        // set the nodes next reference to top
        n.next = top;
        // set top a n.data (user input)
        top = n;
    }

    // check the top element on the stack
    public int peek()
    {
        // if top == null then we have an empty stack
        if (top == null)
        {
            throw new NoSuchElementException();
        }
        // else return the value from the top node on the stack
        else
        {
            return top.data;
        }
    }

    // removes the top element of stack
    public int pop()
    {
        // if top == null then we have an empty stack
        if (top == null)
        {
            throw new NoSuchElementException();
        }
        // else remove the node from the top of the stack
        else
        {
            Node temp = top;
            top = top.next;
            return temp.data;
        }
    }

    public static void main (String[] args)
    {
        LinkedListStack list = new LinkedListStack();
        list.push(1);
        list.push(2);
        list.push(3);

        System.out.print("First peek : " + list.peek());
        System.out.print("\nFirst pop: " + list.pop() + "\nSecond pop: " + list.pop() + "\nThird pop: " + list.pop());
        System.out.print("\n");
    }
}