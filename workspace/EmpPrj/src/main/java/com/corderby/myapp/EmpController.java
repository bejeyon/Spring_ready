package com.corderby.myapp;

public class EmpController {
	private IEmpService empService;
	
	public void setEmpService(IEmpService empService) {
		this.empService = empService;
	}

	public void printInfo() {
		int count = empService.getEmpCount(50);
		System.out.println("ėŽėė ė : " + count);
	}
}
