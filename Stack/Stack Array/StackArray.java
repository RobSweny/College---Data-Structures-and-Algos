class Main
{
    public static void main(String args[])
    {
        // create object of Stack class
        Stack<> s = new Stack(5);
        s.push(2);
        s.push(4);
        s.pop();
        s.printStack();
        s.getSize();
    }
}

// Simple implementation of is a linear data structure that follows the LIFO (Last–In, First–Out) principle.
// That means the objects can be inserted or removed only at one end of it, also called a top.
class Stack
{
    // this int will be used to create the max size of the array
    int maxSize = 0;

    // top of stack
    int top;

    // create array of size maxSize
    int array[] = new int[maxSize];

    // constructor to initialize the stack
    Stack(int size)
    {
        array = new int[size];
        maxSize = size;
        top = -1;
    }

    public boolean isEmpty()
    {
        return top == -1 ? false : true;
    }

    // display all element
    public void printStack()
    {
        if (top == -1)
        {
            System.out.println("The Stack is empty");
        } else {
            System.out.println("Printing Stack");
            System.out.println("Top: " + array[top]);
            System.out.print("Full List: ");
            for (int i = 0; i <= top; i++)
            {
                if(i == 1) System.out.print(", ");
                System.out.print(array[i]);
            }
            System.out.println("");
        }
    }

    // push elements to the top of stack
    public void push(int x)
    {
        // check if top is the maximum size of the stack
        if (top == maxSize)
        {
            // if it is the maximum. Throw an errpr
            System.out.println("Stack OverFlow");
            // terminates the program
            System.exit(1);
        }

        // insert element on top of stack
        System.out.println("Inserting " + x);
        // push the user element x to the index of top
        // then increase the size of top by 1 after the push
        array[++top] = x;
    } // end push

    // peek() method in Java is used to retrieve or fetch the first element of the Stack or the element present at the top of the Stack.
    // the element retrieved does not get deleted or removed from the Stack
    public int peek()
    {
        return array[top];
    }

    public void getSize()
    {
        System.out.println("The size of the stack: " + (top + 1));
    }

    // pop element (remove from top of stack)
    public int pop()
    {
        // check for stack underflow
        // user is attempting to pop an empty stack
        if (top == -1)
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }
        System.out.println("Removing " + peek());
        // As the top element has been removed, we reduce top by 1

        return array[top--];
    }

}

