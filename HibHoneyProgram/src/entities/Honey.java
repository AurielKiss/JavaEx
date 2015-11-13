package entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Entity
public class Honey implements Serializable {

    private static final Logger LOG = LogManager
            .getLogger(Honey.class);

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @Column
    private String taste;

    @OneToMany(mappedBy = "honey")
    private Set<Bee> bees = new HashSet<Bee>();

    public int getId() {
        return id;
    }

    public Honey(String name, String taste) {
        this.name = name;
        this.taste = taste;
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

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public Set<Bee> getBees() {
        return bees;
    }

    public void setBees(Set<Bee> bees) {
        this.bees = bees;
    }

    public String toString() {
        return "Honey: " + getId() + " Name: " + getName() + " Taste: "
                + getTaste();
    }
}
