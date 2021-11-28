package com.nit.in.Service;

import java.sql.SQLException;
import java.util.List;

import com.nit.in.Model.Employee;

public interface IEmployeeMgmtService {
	
	
	public List<Employee> fetchEmpsByDesgn(String desgn1,String desgn2,String desgn3) throws SQLException;

}
