package BD.dao.EmployeeDAO;

import BD.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployee();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);

    int CountEmployee();

    int maxSalary();
    int minSalary();
    Double avgSalary();
    Long totalSalary();
    List<Employee> getSelectEmployee(Employee employee);
}
