package dao;

import entity.Employee;
import java.util.List;

public interface EmployeeDAO {

    public void saveEmployee(Employee employee) throws Exception;

    public Employee load(int id);

    public List<Employee> getAllEmployeesFromDb();

}
