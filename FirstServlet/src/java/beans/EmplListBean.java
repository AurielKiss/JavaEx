package java.beans;

import java.dao.EmployeeDAO;
import java.entity.Employee;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class EmplListBean implements Serializable {

    @ManagedProperty(value = "#{employeeDAOSQLImpl}")
    private EmployeeDAO employeeDao;

    public List<Employee> getListEmp() {
        return employeeDao.getAllEmployeesFromDb();
    }

    public EmployeeDAO getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDAO employeeDao) {
        this.employeeDao = employeeDao;
    }
}
