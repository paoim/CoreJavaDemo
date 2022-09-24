package com.pao.design.builder;

public class TestBuilderPattern {

	public static void main(String[] args) {
		Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB", "2.4 GHz")
				.setBluetoothEnabled(true)
				.setGraphicsCardEnabled(true).build();
		System.out.println(computer);
	}
}

//Reference:
//Browse from: https://www.journaldev.com/1425/builder-design-pattern-in-java
