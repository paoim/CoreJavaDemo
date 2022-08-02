package com.pao.coredemo.synchronization.before;

public class UnsynchronizedDemo {
	
	public static void run() {
		// Object of Line class that is shared
		// among the threads.
		Line obj = new Line();

		// creating the threads that are
		// sharing the same Object.
		Train train1 = new Train(obj);
		Train train2 = new Train(obj);

		// threads start their execution.
		train1.start();
		train2.start();
	}
}
