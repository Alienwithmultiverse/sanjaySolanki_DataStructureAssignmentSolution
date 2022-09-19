package question1.service;

import java.util.PriorityQueue;
import java.util.Collections;

public class PriorityQueueImpliment {
	
	public static void main(String[] args) {
		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		queue.add(12);
		queue.add(1);
		queue.add(2);
		queue.add(21);
		queue.add(121);
		
		while (!queue.isEmpty()) {
			System.out.print(queue.poll() + " ");
		}
	}

}
