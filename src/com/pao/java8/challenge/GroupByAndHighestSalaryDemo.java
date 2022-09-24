package com.pao.java8.challenge;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class GroupByAndHighestSalaryDemo {

	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(
				new Employee("Jam Smith", "Elastic", 12000),
				new Employee("John Je", "DB", 11500),
				new Employee("Adam Joe", "Elastic", 12600),
				new Employee("Pao Sam", "DB", 13400)
		);

		Map<String, List<Employee>> groupEmployeeByDepartmentMap = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(groupEmployeeByDepartmentMap);

		Map<String, Employee> groupEmployeeByDepartmentAndHighestSalary = employeeList.stream().collect(
				Collectors.groupingBy(
						Employee::getDepartment,//Group by Department
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get))//Find Highest Salary
		);
		System.out.println(groupEmployeeByDepartmentAndHighestSalary);

		employeeList.stream().forEach(e -> System.out.println(e.getName() + " with " + Thread.currentThread().getName()));//Sequential Stream
		employeeList.parallelStream().forEach(e -> System.out.println(e.getName() + " with " + Thread.currentThread().getName()));//Parallel Stream
	}
}
