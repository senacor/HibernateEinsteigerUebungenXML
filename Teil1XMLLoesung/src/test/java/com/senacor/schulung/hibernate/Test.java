package com.senacor.schulung.hibernate;

import com.senacor.schulung.hibernate.domain.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 * Created by IntelliJ IDEA.
 * Person: mploed
 * Date: 31.08.2010
 * Time: 16:54:19
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    @org.junit.Test
    public void testHibernate() {
        SessionFactory sf = new Configuration()
                .configure().buildSessionFactory();
        Session s = sf.getCurrentSession();
        Person p = new Person();
        p.setVorname("Sepp");
        p.setNachname("Hammer");
        Person p2 = new Person();
        p2.setVorname("Michael");
        p2.setNachname("Plöd");
        Transaction t = s.beginTransaction();
        s.saveOrUpdate(p);
        s.flush();
        t.commit();
    }
}
