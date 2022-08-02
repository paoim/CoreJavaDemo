package com.pao.coredemo.synchronization.before;

public class Line {
	
	// if multiple threads(trains) will try to
	// access this unsynchronized method,
	// they all will get it. So there is chance
	// that Object's  state will be corrupted.
	public void printLine() {
		for (int i =0; i < 3; i++) {
			System.out.println(i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
