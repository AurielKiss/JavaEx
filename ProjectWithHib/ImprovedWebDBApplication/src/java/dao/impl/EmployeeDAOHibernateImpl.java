package dao.impl;

import dao.EmployeeDAO;
import dao.helpers.HibernateUtil;
import entity.Employee;
import java.sql.ResultSet;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.hibernate.Query;
import org.hibernate.Session;

@ManagedBean
@ApplicationScoped
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

    //private List<Employee> listEmp;
    
    @Override
    public void saveEmployee(Employee employee) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Employee load(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Employee> getAllEmployeesFromDb() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query q = session.createQuery("from beans.EmployeeBean");
        List list = q.list();
        return list;
    }

}
