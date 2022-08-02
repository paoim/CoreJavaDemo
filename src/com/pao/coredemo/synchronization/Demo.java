package com.pao.coredemo.synchronization;

import com.pao.coredemo.synchronization.after.SynchronizedDemo;
import com.pao.coredemo.synchronization.before.UnsynchronizedDemo;

public class Demo {

	public static void main(String[] args) {
		UnsynchronizedDemo.run();
		SynchronizedDemo.run();
	}

}
