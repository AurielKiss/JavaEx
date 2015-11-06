package Test;

import POJO.Person;
import org.junit.Test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.junit.After;
import org.junit.Before;

public class PersonTest {

    private static SessionFactory sf;
    private static ServiceRegistry sr;

    @Before
    public void setup() {

        Configuration conf = new AnnotationConfiguration().configure();
        sr = new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
        sf = conf.buildSessionFactory(sr);
    }

    @After
    public void shutdown() {
        sf.close();
    }

    @Test
    public void testSavePerson() {
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Person person = new Person();
        person.setId(1);
        person.setName("Julia");
        session.save(person);
        tx.commit();
        session.close();
    }
}
