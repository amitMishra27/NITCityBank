package com.nit.in;

import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.in.Controller.PayrollSystemManagement;

@SpringBootApplication
public class SpringProj2DbOperationApplication {

	public static void main(String[] args) {
		ApplicationContext ap=SpringApplication.run(SpringProj2DbOperationApplication.class, args);
		PayrollSystemManagement payrollSystemManagement=ap.getBean("controller",PayrollSystemManagement.class);
		try {
			System.out.println(payrollSystemManagement.gatherEmpsByDesgn("TL", "Dev", "Tester").get(0).toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((ConfigurableApplicationContext) ap).close();
	}

}
