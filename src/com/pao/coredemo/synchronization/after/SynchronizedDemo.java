package com.pao.coredemo.synchronization.after;

public class SynchronizedDemo {
	
	public static void run() {
		Line obj = new Line();

		// we are creating two threads which share
		// same Object.
		Train train1 = new Train(obj);
		Train train2 = new Train(obj);

		// both threads start executing .
		train1.start();
		train2.start();
	}
}
