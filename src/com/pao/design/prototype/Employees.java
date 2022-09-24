package com.pao.design.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	private List<String> employeeList;

	public Employees() {
		employeeList = new ArrayList<String>();
	}

	public Employees(List<String> list) {
		this.employeeList = list;
	}

	public void loadData() {
		// read all employees from database and put into the list
		employeeList.add("Pao");
		employeeList.add("Pankaj");
		employeeList.add("Narsa");
		employeeList.add("Zaheer");
	}

	public List<String> getEmployeeList() {
		return employeeList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String s : this.getEmployeeList()) {
			temp.add(s);
		}
		return new Employees(temp);
	}

}
