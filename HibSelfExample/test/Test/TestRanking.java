/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import POJO.Person;
import POJO.Ranking;
import POJO.Skill;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author AurielKiss
 */
public class TestRanking {

    SessionFactory factory;

    private Person findPerson(Session session, String name) {
        Query query = session.createQuery("from Person p where p.name=:name");
        query.setParameter("name", name);
        Person person = (Person) query.uniqueResult();
        return person;
    }
    
    

    private Person savePerson(Session session, String name) {
        Person person = findPerson(session, name);
        if (person == null) {
            person = new Person();
            person.setName(name);
            session.save(person);
        }
        return person;
    }

    @Test
    public void testSaveRanking() {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Person subject = savePerson(session, "J. C. Smell");
        Person observer = savePerson(session, "Drew Lombardo");
        Skill skill = saveSkill(session, "Java");
        Ranking ranking = new Ranking();
        ranking.setSubject(subject);
        ranking.setObserver(observer);
        ranking.setSkill(skill);
        ranking.setRanking(8);
        session.save(ranking);
        tx.commit();
        session.close();
    }

    @Test
    public void testRankings() {
        populateRankingData();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Query query = session.createQuery("from Ranking r "
                + "where r.subject.name=:name "
                + "and r.skill.name=:skill");
        query.setString("name", "J. C. Smell");
        query.setString("skill", "Java");
        int sum = 0;
        int count = 0;
        for (Ranking r : (List<Ranking>) query.list()) {
            count++;
            sum += r.getRanking();
            System.out.println(r);
        }
        int average = sum / count;
        tx.commit();
        session.close();
        assertEquals(average, 7);
    }

    private void populateRankingData() {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        createData(session, "J. C. Smell", "Gene Showrama", "Java", 6);
        createData(session, "J. C. Smell", "Scottball Most", "Java", 7);
        createData(session, "J. C. Smell", "Drew Lombardo", "Java", 8);
        tx.commit();
        session.close();
    }
}
