public class ArrayStack<T> implements stack<T> {

    // define maximum size of stack
    private int maxSize;
    // notes the top element of the stack
    private int top;
    // the elements that will be in the stack
    private T[] items;

    //constructor
    public ArrayStack(int size) {
        // set the Stack maxsize to the defined user size
        this.maxSize = size;
        // set top to -1 as there are no elements in the stack currently
        this.top = -1;
        // create a list of objects defined by user size
        this.items = (T[]) new Object[maxSize];
    }

    @Override
    // push an element specified to the user to the stack
    public void push(T elem) {
        // if the top of the stack is equal to the maxsize defined by user
        // throw an exception as adding this item would cause a stack overflow
        if (top == maxSize){
            throw new IndexOutOfBoundsException();
        } else {
            // otherwise we add to the stack and add to top
            top++;
            items[top] = elem;
        }
    }

    @Override
    // remove item from stack
    public T pop() {
        // if top == -1 then the stack is empty, we cannot remove any more elements
        // throw an IndexOutOfBoundsException to alert user
        if (top == -1){
            throw new IndexOutOfBoundsException();
        } else {
            // otherwise remove element from stack and top--
            T elem = items[top];
            top--;
            return elem;
        }
    }

    // print all elements of stack
    @Override
    public String toString() {
        String str = "TOP";
        // top represents the top element of the stack so we can user this to get the size
        int counter = top;
        while (counter>=0){
            str+="\n"+items[counter];
            counter--;
        }
        return str+"\nBOTTOM";
    }

    public static void main(String[] args){

        stack<Integer> stack = new ArrayStack<>(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.toString());

    }
}