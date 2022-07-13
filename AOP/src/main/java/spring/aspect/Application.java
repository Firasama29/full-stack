package spring.aspect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import spring.aspect.model.Employee;
import spring.aspect.service.EmployeeService;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);
        EmployeeService service = context.getBean(EmployeeService.class);
        service.addEmployee(new Employee(4L, "Firas", 29L, "developer"));
        service.findEmployees();
        service.findEmployeeById(4L);
    }
}
