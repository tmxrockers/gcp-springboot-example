package com.gcp.example.gcpspringexample.entity;

public class EmployeeEntity {

	private int employeeId;
	private String employeeName;
	private int employeeAge;

	public EmployeeEntity(int employeeId, String employeeName, int employeeAge) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
	}

	public int getemployeeId() {
		return employeeId;
	}

	public void setemployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getemployeeName() {
		return employeeName;
	}

	public void setemployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getemployeeAge() {
		return employeeAge;
	}

	public void setemployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

}
