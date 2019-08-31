package co.edureka.collections;

import java.util.PriorityQueue;

public class QueueAPI {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		for(int i=10;i>=1;i--) {
			queue.add(i); // adding data in queue
		}
		
		// We have added data like below:
		// (Head)10 9 8 7 6 5 4 3 2 1(Tail)
		
		// But PriorityQueue shall save the data in ascending arrangement automatically for us. Data will be sorted
		
		// Hence, data shall be stored like below:
		// (Head)1 2 3 4 5 6 7 8 9 10(Tail)
		
		// We shall read Head of Queue
		/*
		int head = queue.peek(); // peek will give us head of queue
		System.out.println(">> head is: "+head);
		System.out.println(">> size of queue after peeking is: "+queue.size());
		
		queue.poll(); // removes the head of queue
		System.out.println(">> size of queue after polling is: "+queue.size());
		
		head = queue.peek(); // peek will give us head of queue
		System.out.println(">> head is: "+head); // 2
		*/
		
		for(int i=0;i<queue.size();i++) {
			System.out.println(">> Head is: "+queue.peek()); // Get Head of Queue
			queue.poll(); // remove head of Queue | size shall reduce :)
		}
		
		
		
	}

}
