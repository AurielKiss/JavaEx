package beans;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

public class EmployeeBean implements Serializable {

    //ManagedBean manList;

    private int id;
    private String name;
    private int age;
    private String town;
    private String street;
    private int phone;

    public EmployeeBean(int id, String name, int age, String town, String street, int phone) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.town = town;
        this.street = street;
        this.phone = phone;
    }

    public EmployeeBean() {
    }

//    @PostConstruct
//    public void init() {
//        System.out.println(id);
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
