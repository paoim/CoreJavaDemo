package com.pao.design.abstractfactory;

import com.pao.design.factory.Computer;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}
