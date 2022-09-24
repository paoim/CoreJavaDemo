package com.pao.design.abstractfactory;

import com.pao.design.factory.Computer;

public class TestAbstractFactory {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
		System.out.println("AbstractFactory PC Config::" + pc);
		System.out.println("AbstractFactory Server Config::" + server);
	}
}

//Reference:
//Browse from: https://www.journaldev.com/1418/abstract-factory-design-pattern-in-java
