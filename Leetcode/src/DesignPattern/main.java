package DesignPattern;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class main {

	public static void main(String[] args) {

		SingltonDP s = SingltonDP.getInstance();
		SingltonDP s2 = SingltonDP.getInstance();
		 SingltonDP s3 = SingltonDP.getInstance();
		
		
		/// EXECUTOR SERVICS
		
		int CourOCunt = Runtime.getRuntime().availableProcessors();
		System.out.println(CourOCunt);
		ExecutorService service = Executors.newFixedThreadPool(CourOCunt);
		//service.execute(); ///new tassk

		Stack<Integer> stack = new Stack<>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		stack.add(4);
		
		
		System.out.println(stack.pop());
		
		
		//MIN HEAP
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(20);
		pq.add(10);
		pq.add(60);	
		
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq.peek());
		
		
		PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
		pq2.add(20);
		pq2.add(10);
		pq2.add(60);	
		
		System.out.println(pq2.peek());
		System.out.println(pq2.poll());
		System.out.println(pq2.peek());
		
	}

}
