package BD.dao.EmployeeDAO;

import BD.entity.Employee;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public List<Employee> getAllEmployee() {
        Session session=sessionFactory.getCurrentSession();
        Query<Employee> queue=session.createQuery("from Employee ", Employee.class);
        List<Employee> employees=queue.getResultList();

        return employees;
    }

    @Override
    public void saveEmployee(Employee employee) {
        Session session=sessionFactory.getCurrentSession();
        session.save(employee);
    }

    @Override
    public Employee getEmployee(int id) {
        Session session=sessionFactory.getCurrentSession();
        Employee employee=session.get(Employee.class,id);

        return employee;
    }

    @Override
    public void deleteEmployee(int id) {
        Session session=sessionFactory.getCurrentSession();
        Query<Employee> queue=session.createQuery("delete from Employee where ID_EMPLOYEE =:employeeId");
        queue.setParameter("employeeId", id);
        queue.executeUpdate();
    }

    @Override
    public int CountEmployee() {
        Session session=sessionFactory.getCurrentSession();
        Query<Employee> queue=session.createQuery("from Employee ", Employee.class);
        List<Employee> employees=queue.getResultList();
        int i=employees.size();
        return i;
    }

    @Override
    public int maxSalary() {
        org.hibernate.cfg.Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Employee.class);
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Criteria geekEmployeeCriteria = session.createCriteria(Employee.class);
            geekEmployeeCriteria.setProjection(
                    Projections.max("SALARY"));
            List<Integer> maxSalary = geekEmployeeCriteria.list();
            return  maxSalary.get(0);

        }
    }
    @Override
    public int minSalary() {
        org.hibernate.cfg.Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Employee.class);
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Criteria geekEmployeeCriteria = session.createCriteria(Employee.class);
            geekEmployeeCriteria.setProjection(
                    Projections.min("SALARY"));
            List<Integer> maxSalary = geekEmployeeCriteria.list();
            return  maxSalary.get(0);

        }
    }

    @Override
    public Double avgSalary() {
        org.hibernate.cfg.Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Employee.class);
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Criteria geekEmployeeCriteria = session.createCriteria(Employee.class);
            geekEmployeeCriteria.setProjection(
                    Projections.avg("SALARY"));
            List<Double> maxSalary = geekEmployeeCriteria.list();
            System.out.println(maxSalary.get(0));
            return  maxSalary.get(0);

        }
    }

    @Override
    public Long totalSalary() {
        org.hibernate.cfg.Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Employee.class);
        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Criteria geekEmployeeCriteria = session.createCriteria(Employee.class);
            geekEmployeeCriteria.setProjection(
                    Projections.sum("SALARY"));
            List<Long> maxSalary = geekEmployeeCriteria.list();
            return maxSalary.get(0);

        }
    }

    @Override
    public List<Employee> getSelectEmployee(Employee employee) {
        org.hibernate.cfg.Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Employee.class);
        Date sqlDate=Date.valueOf("1000-09-09");
        try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            String s = "FROM Employee where ID_EMPLOYEE=:id and FIRST_NAME_EMPLOYEE=:first and  SECOND_NAME_EMPLOYEE=:second" +
                    " and THIRD_NAME_EMPLOYEE=:trird and DATE_BIRTH_EMPLOYEE=:date and  ADDRESS_EMPLOYEE=:address " +
                    "and TELEPHONE_EMPLOYEE=:tel and POST=:post and  SALARY=:salary and EXPERIENCE=:exp and OPERATING_MODE=:op " +
                    "and ALLOWANCE=:all";
            System.out.println(s);
            if (employee.getID_EMPLOYEE() == 1) {
                s = s.replace("ID_EMPLOYEE=:id and ", "");
            }
            System.out.println(s);
            System.out.println(employee);
            System.out.println();
            System.out.println(employee.getFIRST_NAME_EMPLOYEE());
            if (employee.getFIRST_NAME_EMPLOYEE().equals("null")) {
                System.out.println(1111111);
                System.out.println(s);
                s = s.replace("FIRST_NAME_EMPLOYEE=:first and ", "");
            }
            if (employee.getSECOND_NAME_EMPLOYEE().equals("null")) {
                s = s.replace("SECOND_NAME_EMPLOYEE=:second and ", "");
            }
            if (employee.getTHIRD_NAME_EMPLOYEE().equals("null")) {
                s = s.replace("THIRD_NAME_EMPLOYEE=:trird and ", "");
            }

            if (employee.getDATE_BIRTH_EMPLOYEE().equals(sqlDate)) {
                s = s.replace("DATE_BIRTH_EMPLOYEE=:date and ", "");
            }

            if (employee.getADDRESS_EMPLOYEE().equals("null")) {
               // s = s.replace("and FIRST_NAME_EMPLOYEE=:first", "");

                s = s.replace("ADDRESS_EMPLOYEE=:address and ", "");
            }
            if (employee.getTELEPHONE_EMPLOYEE().equals("null")) {
                s = s.replace("TELEPHONE_EMPLOYEE=:tel and ", "");
            }
            if (employee.getPOST().equals("null")) {
                s = s.replace("POST=:post and ", "");
            }
            if (employee.getSALARY() == 0) {
                s = s.replace("SALARY=:salary and ", "");
            }
            if (employee.getEXPERIENCE() == 0) {
                s = s.replace("EXPERIENCE=:exp and ", "");
            }
            if (employee.getOPERATING_MODE().equals("null")) {
                s = s.replace("OPERATING_MODE=:op and ", "");
            }
            if (employee.getALLOWANCE() == 0) {
                s = s.replace("and   ALLOWANCE=:all", "");
                s = s.replace("and    ALLOWANCE=:all", "");

            }
            System.out.println(s);

            Query<Employee> queue = session.createQuery(s, Employee.class);
            if (employee.getID_EMPLOYEE() != 1) {
                queue.setParameter("id", employee.getID_EMPLOYEE());
            }
            if (!employee.getFIRST_NAME_EMPLOYEE().equals("null")) {
                queue.setParameter("first", employee.getFIRST_NAME_EMPLOYEE());
            }
            if (!employee.getSECOND_NAME_EMPLOYEE().equals("null")) {
                queue.setParameter("second", employee.getSECOND_NAME_EMPLOYEE());
            }
            if (!employee.getTHIRD_NAME_EMPLOYEE().equals("null")) {
                queue.setParameter("trird", employee.getTHIRD_NAME_EMPLOYEE());
            }

            if (!employee.getDATE_BIRTH_EMPLOYEE().equals(sqlDate) ) {
                queue.setParameter("date", employee.getDATE_BIRTH_EMPLOYEE());
            }
            if (!employee.getADDRESS_EMPLOYEE().equals("null")) {
                queue.setParameter("address", employee.getADDRESS_EMPLOYEE());
            }
            if (!employee.getTELEPHONE_EMPLOYEE().equals("null")) {
                queue.setParameter("tel", employee.getTELEPHONE_EMPLOYEE());

            }
            if (!employee.getPOST().equals("null")) {
                queue.setParameter("post", employee.getPOST());

            }
            if (employee.getSALARY() != 0) {
                queue.setParameter("salary", employee.getSALARY());
            }
            if (employee.getEXPERIENCE() != 0) {
                queue.setParameter("exp", employee.getEXPERIENCE());
            }
            if (!employee.getOPERATING_MODE().equals("null")) {
                queue.setParameter("op", employee.getOPERATING_MODE());
            }
            if (employee.getALLOWANCE() != 0) {
                queue.setParameter("all", employee.getALLOWANCE());

            }

            List<Employee> employees = queue.getResultList();
            for (Employee employee1 : employees) {
                System.out.println(employee1);
            }
            session.close();
            return employees;
        }
    }

}
