package BD.service.EmployeeService;

import BD.dao.EmployeeDAO.EmployeeDAO;
import BD.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployee() {
        return employeeDAO.getAllEmployee();
    }

    @Override
    @Transactional
    public void saveEmployee(Employee employee) {
        employeeDAO.saveEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployee(int id) {
        return employeeDAO.getEmployee(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeDAO.deleteEmployee(id);
    }
    @Override
    @Transactional
    public int countEmp() {
        return employeeDAO.CountEmployee();
    }

    @Override
    @Transactional
    public int maxSalary() {
        return employeeDAO.maxSalary();
    }

    @Override
    @Transactional
    public int minSalary() {
        return employeeDAO.minSalary();
    }

    @Override
    @Transactional
    public Double avgSalary() {
        return employeeDAO.avgSalary();
    }

    @Override
    @Transactional
    public Long totalSalary() {
        return employeeDAO.totalSalary();
    }

    @Override
    @Transactional
    public List<Employee> getSelectEmployee(Employee employee) {
        return employeeDAO.getSelectEmployee(employee);
    }

}
