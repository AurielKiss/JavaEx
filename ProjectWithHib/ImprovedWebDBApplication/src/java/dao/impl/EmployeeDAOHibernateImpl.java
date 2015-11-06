package dao.impl;

import beans.EmployeeBean;
import dao.EmployeeDAO;
import dao.helpers.HibernateUtil;
import entity.Employee;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;

@ManagedBean
@ApplicationScoped
public class EmployeeDAOHibernateImpl implements EmployeeDAO, Serializable {

    @Override
    public void saveEmployee(Employee employee) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee load(int id) {

        Session session = null;
        Employee employee = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            //session.beginTransaction();
            employee = (Employee) session.get(Employee.class, id); //session.get session.load
            //Hibernate.initialize(employee);
        } catch (Exception e) {
        } finally {
            System.out.print("Mano employeris > "+employee);
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return employee;
    }

    @Override
    public List<Employee> getAllEmployeesFromDb() {
        Session session = null;
        List list = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from beans.EmployeeBean");
            list = query.list();
        } catch (Exception e) {
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return list;
    }
}
