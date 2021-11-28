package com.nit.in.Service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.in.Dao.IEmployeeDao;
import com.nit.in.Model.Employee;

@Service("empService")
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService{

	@Autowired
	private IEmployeeDao empDao;
	
	public List<Employee> fetchEmpsByDesgn(String desgn1, String desgn2, String desgn3) throws SQLException {
		
		return empDao.getEmpByDesgns(desgn1, desgn2, desgn3);
	}
	
	
	

}
