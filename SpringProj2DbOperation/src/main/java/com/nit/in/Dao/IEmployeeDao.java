package com.nit.in.Dao;

import java.sql.SQLException;
import java.util.List;

import com.nit.in.Model.Employee;

public interface IEmployeeDao {
	
	public List<Employee> getEmpByDesgns(String desgn1,String desgn2,String desgn3) throws SQLException;

}
