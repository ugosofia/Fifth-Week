package com.java.corso.ripasso;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class MainTest {

    private SessionFactory sessionFactory;


    public static void main(String[] args) throws Exception {
        MainTest mainTest = new MainTest();
        mainTest.setUp();
        mainTest.test();
        mainTest.shutDown();
    }

    protected void setUp() throws Exception {
        sessionFactory = new Configuration()
                .configure() // configura la SessionFactory utilizzando l' hibernate.cfg.xml
                .buildSessionFactory();
    }

    protected void shutDown() throws Exception {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }
    public void test() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

       // session.save(new Brano("Thunderstruck", "AC/DC", "Rock","The Razors Edge"));
       // session.save(new Autore("1", "AC/DC"));
       // session.save(new Cd( "AC/DC", "Rock"));
       // session.save(new Archivio());

        session.getTransaction().commit();
        session.close();

    }
}

