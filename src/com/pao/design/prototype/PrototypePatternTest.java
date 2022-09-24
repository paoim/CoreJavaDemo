package com.pao.design.prototype;

import java.util.List;

public class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();

		// Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmployeeList();
		list.add("John");
		List<String> list1 = empsNew1.getEmployeeList();
		list1.remove("Pao");

		System.out.println("emps List: " + emps.getEmployeeList());
		System.out.println("empsNew List: " + list);
		System.out.println("empsNew1 List: " + list1);
	}
}

//Reference:
//Browse from: https://www.journaldev.com/1440/prototype-design-pattern-in-java
