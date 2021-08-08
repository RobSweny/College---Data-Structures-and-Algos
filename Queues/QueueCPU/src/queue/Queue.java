package queue;

public interface Queue<T>{
	public void enqueue(T elem);
	//The dequeue removes the object from the collection
	public T dequeue();
	public boolean isEmpty();
	// This method simply views the object
	public T peek();
	public int size();
}