package BD.service.EmployeeService;

import BD.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee();
    void saveEmployee(Employee employee);
    Employee getEmployee(int id);

    void deleteEmployee(int id);
    int countEmp();
    int maxSalary();
    int minSalary();
    Double avgSalary();
    Long totalSalary();

    List<Employee> getSelectEmployee(Employee employee);

}
