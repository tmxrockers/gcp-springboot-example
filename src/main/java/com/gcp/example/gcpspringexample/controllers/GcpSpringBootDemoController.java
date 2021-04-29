package com.gcp.example.gcpspringexample.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gcp.example.gcpspringexample.entity.EmployeeEntity;

@RestController
public class GcpSpringBootDemoController {

	@RequestMapping(value="/get/all", method = RequestMethod.GET)
	public List<EmployeeEntity> getMessage() {
		List<EmployeeEntity> list = getEmployeeList();
		return list;
	}

	private List<EmployeeEntity> getEmployeeList() {
		List<EmployeeEntity> list = new ArrayList<>();
		list.add(new EmployeeEntity(1, "Jhon Cena", 24));
		list.add(new EmployeeEntity(2, "Randy Orton", 28));
		list.add(new EmployeeEntity(3, "Shawn Michaels", 29));
		return list;
	}
}
