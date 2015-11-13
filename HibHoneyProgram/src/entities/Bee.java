package entities;

import java.io.Serializable;
import java.text.MessageFormat;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Entity
public class Bee implements Serializable {

    private static final Logger LOG = LogManager
            .getLogger(Bee.class); // if change name?

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn  // ??
    private Honey honey;

    public Bee() {
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

    public Honey getHoney() {
        return honey;
    }

    public void setHoney(Honey honey) {
        this.honey = honey;
    }

    public String toString() {
        return MessageFormat.format("{0}: id={1}, name={2}", new Object[]{
            getClass().getSimpleName(), id, name});
    }

}
