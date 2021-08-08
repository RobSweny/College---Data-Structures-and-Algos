package linkedlist;

import java.time.LocalTime;

public class Main {
	  public static void main(String [] args){
		    System.out.println("Started Executing");
		    QueueImplementation<Job> myqueue = new QueueImplementation<>();

		    /* String name; LocalTime arrivalTime; LocalTime completedTime; int burstCycle; */
			Job job1 = new Job("Start Notepad", LocalTime.now(), 0, 4);
			Job job2 = new Job("Exit Notepad", LocalTime.now(), 0, 6);
			Job job3 = new Job("Start Word", LocalTime.now(), 0, 2);
			Job job4 = new Job("Start Excel", LocalTime.now(), 0, 4);
			Job job5 = new Job("Exit Word", LocalTime.now(), 0, 3);

		    myqueue.enqueue(job1);
		  	myqueue.enqueue(job2);
		  	myqueue.enqueue(job3);

		  	System.out.print("Average CPU completion time : " + myqueue.average());

		  	//System.out.print(myqueue.toString());
	  }
}
