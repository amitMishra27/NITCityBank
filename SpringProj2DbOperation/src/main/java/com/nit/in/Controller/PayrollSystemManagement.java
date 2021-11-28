package com.nit.in.Controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.in.Model.Employee;
import com.nit.in.Service.IEmployeeMgmtService;

@Controller("controller")
public class PayrollSystemManagement {
	
	@Autowired
	private IEmployeeMgmtService employeeMgmtService;
	
	public List<Employee> gatherEmpsByDesgn(String desgn1,String desgn2,String desgn3) throws SQLException
	{
		List<Employee> listEmps=employeeMgmtService.fetchEmpsByDesgn(desgn1,desgn2,desgn3);
		return listEmps;
	}
	

}
