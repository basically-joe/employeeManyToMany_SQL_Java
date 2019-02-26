package com.example.employeeMany;

import com.example.employeeMany.models.Department;
import com.example.employeeMany.models.Employee;
import com.example.employeeMany.repositories.DepartmentRepository;
import com.example.employeeMany.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeManyApplicationTests {
	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canAddEmployeesAndDepartmentsToDB(){
		Department department = new Department("IT");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Bob", "McBobface", 213412, department);
		Employee employee2 = new Employee("Bill", "McBillface", 213413, department);
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
	}


}
