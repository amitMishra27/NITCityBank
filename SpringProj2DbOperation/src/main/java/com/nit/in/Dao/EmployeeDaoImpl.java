package com.nit.in.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.in.Model.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao {


	@Autowired
	private DataSource ds;
	
	
	public List<Employee> getEmpByDesgns(String desgn1, String desgn2, String desgn3) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn=ds.getConnection();
		
		PreparedStatement ps=conn.prepareStatement("select empno,em"
				+ "pname,empsal,empjob from persons where empjob in (?,?,?)");
		ps.setString(1,desgn1);
		ps.setString(2,desgn2);
		ps.setString(3,desgn3);
		
		System.out.println("===="+ps.toString());
		
		ResultSet rs=ps.executeQuery();
		 
		List<Employee> empList=new ArrayList<Employee>();
		
		while(rs.next())
		{
			Employee e=new Employee();
			e.setEmpno(rs.getInt(1));
			e.setEmpname(rs.getString(2));
			e.setEmpsal(rs.getFloat(3));
			e.setEmpjob(rs.getString(4));
			empList.add(e);
			
		}
		return empList;
		
	}

}
