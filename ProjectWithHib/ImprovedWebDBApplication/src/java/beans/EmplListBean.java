package beans;

import dao.EmployeeDAO;
import entity.Employee;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class EmplListBean implements Serializable {
    
    //@ManagedProperty(value = "#{testBeanForInjection}")
    //@ManagedProperty(value = "#{employeeDAOSQLImpl}")
    @ManagedProperty(value = "#{EmployeeDAOHibernateImpl}")
    private EmployeeDAO employeeDaoInjected;

    public List<Employee> getListEmp() {
        return employeeDaoInjected.getAllEmployeesFromDb();
    }
    
    public EmployeeDAO getEmployeeDaoInjected() {
        return employeeDaoInjected;
    }

    public void setEmployeeDaoInjected(EmployeeDAO employeeDaoInjected) {
        this.employeeDaoInjected = employeeDaoInjected;
    }

    public EmployeeDAO getEmployeeDao() {
        return employeeDaoInjected;
    }

    public void setEmployeeDao(EmployeeDAO employeeDao) {
        this.employeeDaoInjected = employeeDao;
    }
}
