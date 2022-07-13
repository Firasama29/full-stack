package spring.aspect.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import spring.aspect.model.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    Logger LOGGER = LoggerFactory.getLogger(EmployeeService.class);
    List<Employee> employees = new ArrayList<>();

    public List<Employee> findEmployees() {
//        LOGGER.info("list of employees : [{}]", employees);
        return employees;
    }

    public void addEmployee(Employee employee) {
//        LOGGER.info("add employee : [{}]", employee);
        employees.add(employee);
    }

    public Employee findEmployeeById(Long id) {
//        LOGGER.info("find employees by id : [{}]", id);
        for(Employee employee : employees) {
            if(employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    public void updateEmployee(Employee employeeDetails) {
//        LOGGER.info("update employee details with id : [{}]", employeeDetails.getId());
        for(Employee employee : employees) {
            if(employee.getId().equals(employeeDetails.getId())) {
                employees.remove(employee);
                employees.add(employeeDetails);
            }
        }
    }

    public void deleteEmployee(Long id) {
//        LOGGER.info("delete employee with id : [{}]", id);
        employees.removeIf(employee -> employee.getId().equals(id));
    }



}
