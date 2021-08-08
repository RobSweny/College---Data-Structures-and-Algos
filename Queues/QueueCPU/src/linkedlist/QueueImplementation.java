package linkedlist;

import queue.Queue;

import java.time.Duration;
import java.time.LocalTime;

public class QueueImplementation<T> implements Queue<T> {
	  //we need some instance variables.
	  // in our queue, we would like to know the first and last objects

	  private Node<T> first;
	  private Node<T> last;
	  private int time;

	  public QueueImplementation(){
	    first = null;
	    last = null;
	    time = 0;
	  }

	  // this method should let me know when the queue is empty
	  public boolean isEmpty(){
	    return first == null;
	  }

	  // This method simply views the object
	  public T peek() {
	    // it should return the first data part without removing the
	    // element from the queue.
	    //it should check if the queue is empty first
	    if(isEmpty()){
	    	throw new QueueException("Queue is empty!");
	    }else{
	      return first.element;
	    }
	  }

	public int average(){
		Node<T> current = first;
		int size = 0;
		int total = 0;
		while(current != null){
			if (((Job) last.getData()).getCompletedTime() != 0) {
				total += ((Job) last.getData()).getCompletedTime();
				size++;
			}
			current = current.next;
		}
		return total / size;
	}


	  // This method should add an element at the end of the queue.
	  public void enqueue(T elem){
	    Node<T> oldLast = last;
	    last = new Node<T>(elem);
	    if(isEmpty()){
	      first = last;
	    }else{
	      oldLast.next = last;
	    }
	    // retrieve data from node and print
		String jobName = ((Job) last.getData()).getName();
	    int cycles = ((Job) last.getData()).getBurstCycle();
	    LocalTime arrival = ((Job) last.getData()).getArrivalTime();
		System.out.println("Time " + time + ": Process " + jobName + " has been sent to CPU and is executed for " + cycles + " time intervals");
		// thread sleep works in milliseconds, so 3 cycles * 1000 will give 3 seconds
		try {
			Thread.sleep(cycles * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// minute arrival time by current time to get the completed time in nanoseconds - 59970600
		LocalTime completedTime = LocalTime.now();
		Duration duration = Duration.between(arrival, completedTime);
		((Job) last.getData()).setCompletedTime(duration.getNano());
		// Time {time}: Process Start Word has been sent to CPU
		// Increase time by number of cycles
	    time += cycles;
	  }

	  //The dequeue removes the object from the collection
	  public T dequeue(){
	    if(isEmpty()){
	      throw new QueueException("Queue is Empty");
	    }else{
	      T found = first.element;
	      first = first.next;
	      if(isEmpty()){
	        last = null;
	      }
	      return found;
	    }
	  }

	  // This method returns the size of the collection
	  public int size(){
	    if(isEmpty()){
	      return 0;
	    }else{
	      int size =1;
	      Node<T> current = first;
	      while(current.next !=null){
	        size++;
	        current = current.next;
	      }
	      return size;
	    }
	  }

	  // this method generates a string representation of the queue.
	  public String toString(){
	    Node<T> current = first;
	    String output = "<Top>\n";
	    while(current !=null){
	      output += current.element + "\n";
	      current = current.next;
	    }
	    output = output+"<Bottom>";
	    return output;
	  }
}