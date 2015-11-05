package java.entity;

import java.io.Serializable;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.context.FacesContext;

public class Employee implements Serializable {

    private int id;
    private String name;
    private int age;
    private String town;
    private String street;
    private int phone;

    public Employee(int id, String name, int age, String town, String street, int phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.town = town;
        this.street = street;
        this.phone = phone;
    }
    
    public Employee() {
        System.out.println("CONSTRUCTOR");
    }

    @PostConstruct
    public void init() {
        Map<String, String> params = FacesContext.getCurrentInstance().
                getExternalContext().getRequestParameterMap();
        String p1 = params.get("p1");
        System.out.println("p1 = " + p1);
        this.id = Integer.valueOf(p1);
    }

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
