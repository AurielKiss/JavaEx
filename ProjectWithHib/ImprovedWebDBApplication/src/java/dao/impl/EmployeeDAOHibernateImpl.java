package dao.impl;

import beans.EmployeeBean;
import dao.EmployeeDAO;
import dao.helpers.HibernateUtil;
import entity.Employee;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;

@ManagedBean
@ApplicationScoped
public class EmployeeDAOHibernateImpl implements EmployeeDAO, Serializable {

    private static final Logger LOG = LogManager
            .getLogger(EmployeeDAOHibernateImpl.class);

    @Override
    public void saveEmployee(Employee employee) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee load(int id) {
        Query query = null;
        Session session = null;
        Employee employee = null;
        try {
            
            session = HibernateUtil.getSessionFactory().openSession();
            //session.beginTransaction();
            query = session.createQuery("from beans.EmployeeBean where id=" + id);
            query.setMaxResults(1);
            LOG.info("1  Mano employeris -> " + employee+" id: "+id);
//            employee = (Employee) query.uniqueResult();
//            LOG.info("2  Mano employeris -> " + employee);
            employee = (Employee) session.get(EmployeeBean.class, id); //session.get session.load
            if (employee == null) {
                LOG.info("employee not found for id " + id);
            }
        } catch (Exception e) {
        } finally {
            LOG.info("Mano employeris -> " + employee);
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        //return query.list();
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
