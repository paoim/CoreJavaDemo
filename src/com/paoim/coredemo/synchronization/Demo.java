package com.paoim.coredemo.synchronization;

import com.paoim.coredemo.synchronization.after.SynchronizedDemo;
import com.paoim.coredemo.synchronization.before.UnsynchronizedDemo;

public class Demo {

	public static void main(String[] args) {
		UnsynchronizedDemo.run();
		SynchronizedDemo.run();
	}

}
