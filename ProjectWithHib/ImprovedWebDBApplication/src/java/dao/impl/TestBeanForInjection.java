package dao.impl;

import dao.EmployeeDAO;
import entity.Employee;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class TestBeanForInjection implements EmployeeDAO, Serializable {

    private List<Employee> listEmp;

    @Override
    public List<Employee> getAllEmployeesFromDb() {
        if (listEmp == null) {
            listEmp = new ArrayList<>();
            this.listEmp.add(new Employee(1, "Injected", 22, "Vilnius", "Baubu", 15684));
            this.listEmp.add(new Employee(2, "Jonas", 42, "Kaunas", "Tuju", 54987));
            this.listEmp.add(new Employee(3, "Mikas", 26, "Klaipeda", "Grusiu", 654987));
            this.listEmp.add(new Employee(4, "Tadas", 51, "Kaunas", "Lapiu", 777222));
            this.listEmp.add(new Employee(5, "Artis", 19, "Vilnius", "Pupu", 123321));
            this.listEmp.add(new Employee(6, "Janis", 16, "Kaunas", "Viniu", 785745));
            this.listEmp.add(new Employee(7, "Dima", 18, "Klaipeda", "Grusiu", 654789));
            this.listEmp.add(new Employee(8, "Kiesa", 42, "Kaunas", "Lapiu", 9999999));
            this.listEmp.add(new Employee(9, "Asta", 32, "Vilnius", "Pupu", 555789));
            this.listEmp.add(new Employee(10, "Ana", 55, "Kaunas", "Viniu", 78221122));
        }
        return listEmp;
    }

    @Override
    public void saveEmployee(Employee employee) throws Exception {
        if (employee.getId() == 0) {
            throw new Exception("No id!!!!");
        }
        for (Employee e : getAllEmployeesFromDb()) {
            if (e.getId() == employee.getId()) {
                e.setName(employee.getName());
                e.setTown(employee.getTown());
                return;
            }
        }
        getAllEmployeesFromDb().add(employee);
    }

    @Override
    public Employee load(int id) {
        for (Employee e : getAllEmployeesFromDb()) {
            if (e.getId() == id) {
                return clone(e);
            }
        }
        return null;
    }

    private Employee clone(Employee e) {
        Employee cloned = new Employee();
        cloned.setId(e.getId());
        cloned.setName(e.getName());
        cloned.setTown(e.getTown());
        return cloned;
    }
}
