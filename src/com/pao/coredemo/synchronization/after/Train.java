package com.pao.coredemo.synchronization.after;

public class Train extends Thread {
	
	// Reference variable of type Line.
	Line line;

	Train(Line line) {
		this.line = line;
	}

	@Override
	public void run() {
		line.printLine();
	}
}
