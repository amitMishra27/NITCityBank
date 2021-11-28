package com.nit.in.Model;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;




public class Employee {
	

	
	private Integer empno;
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", empname=" + empname + ", empjob=" + empjob + ", empsal=" + empsal + "]";
	}
	private String empname;
	private String empjob;
	private Float empsal;
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpjob() {
		return empjob;
	}
	public void setEmpjob(String empjob) {
		this.empjob = empjob;
	}
	public Float getEmpsal() {
		return empsal;
	}
	public void setEmpsal(Float empsal) {
		this.empsal = empsal;
	}

}
