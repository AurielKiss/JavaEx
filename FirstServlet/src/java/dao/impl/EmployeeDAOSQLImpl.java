package java.dao.impl;
//Aure
import java.dao.EmployeeDAO;
import java.entity.Employee;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class EmployeeDAOSQLImpl implements EmployeeDAO {

    private List<Employee> listEmp;

    @Override
    public void saveEmployee(Employee employee) throws Exception {

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/EmployeeDB", "aure", "demo");
            Statement stmt = con.createStatement();
            
            for (Employee e : getAllEmployeesFromDb()) {
                if (e.getId() == employee.getId()) {
                    stmt.executeUpdate("UPDATE EMPLOYEE SET name='" + employee.getName() + "', age=" + employee.getAge() + ", town='" + employee.getTown() + "', street='" + employee.getStreet() + "', phone=" + employee.getPhone() + " WHERE id=" + employee.getId());
                }
            }
            if (employee.getId()== 0)   {
         stmt.executeUpdate("INSERT INTO EMPLOYEE (id, name, age, town, street, phone) VALUES ("+(listEmp.size()+1)+",'"+employee.getName()+"', "+employee.getAge()+", '"+employee.getTown()+"', '"+employee.getStreet()+"', "+employee.getPhone()+")");
            }
            } catch (SQLException e) {
            System.err.println(e);
        } finally {
//            con.close();
//            stmt.close();
        }

    }

    @Override
    public Employee load(int id) {
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/EmployeeDB", "aure", "demo");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM AURE.EMPLOYEE WHERE ID=" + id);

            if (rs.next()) {

                int id2 = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String town = rs.getString("town");
                String street = rs.getString("street");
                int phone = rs.getInt("phone");
                System.out.println("kasnors");
                return new Employee(id, name, age, town, street, phone);
            }
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
//            con.close();
//            stmt.close();
        }
        return null;
    }

    @Override
    public List<Employee> getAllEmployeesFromDb() {

        listEmp = new ArrayList<>();

        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/EmployeeDB", "aure", "demo");
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM AURE.EMPLOYEE");

            while (rs.next()) {

                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String town = rs.getString("town");
                String street = rs.getString("street");
                int phone = rs.getInt("phone");

                //System.out.println(id + " " + name + " " + age + " " + town + " " + street + " " + phone);
                listEmp.add(new Employee(id, name, age, town, street, phone));
            }
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
//            con.close();
//            stmt.close();
        }
        return listEmp;
    }
}
