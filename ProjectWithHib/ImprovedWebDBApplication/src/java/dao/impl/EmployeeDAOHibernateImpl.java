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
import org.hibernate.Transaction;

@ManagedBean
@ApplicationScoped
public class EmployeeDAOHibernateImpl implements EmployeeDAO, Serializable {

    List list = null;

    private static final Logger LOG = LogManager
            .getLogger(EmployeeDAOHibernateImpl.class);

    @Override
    public void saveEmployee(Employee employee) throws Exception {

        Session session = null;

        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        try {
            if (employee.getId() == 0) {
                employee.setId(list.size() + 1);
                employee.setStreet("nepasirinkta");
                session.save(employee);
                tx.commit();
                LOG.info("Padarytas naujas irasas");
            } else {

                session.update(employee);
                tx.commit();
            }

        } catch (Exception e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {

            session.close();
        }

    }

    @Override
    public Employee load(int id
    ) {
        Query query = null;
        Session session = null;
        Employee employee = null;
        try {

            session = HibernateUtil.getSessionFactory().openSession();
//            Session session2 = SessionUtil.getSession();
//            Transaction tx = session.beginTransaction();
//            query = session.createQuery("from beans.EmployeeBean where id=" + id);
//            query.setMaxResults(1);
//
            LOG.info("Mano employeris turi but null-> " + employee + " id: " + id);
//            employee = new Employee();
//            employee = (Employee) query.uniqueResult();
//            LOG.info("2  Mano employeris -> " + employee);
            employee = (Employee) session.get(Employee.class, id); //session.get session.load
//            Hibernate.initialize(employee);
//            LOG.info("Before commit-> " + employee);
//            tx.commit();
            if (employee == null) {
                LOG.info("employee not found for id " + id);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            LOG.info("Mano employeris not null -> " + employee);
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

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("from entity.Employee");
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
