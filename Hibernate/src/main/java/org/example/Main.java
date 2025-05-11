package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        //configurare Hibernate
        Configuration config = new Configuration().configure();
        SessionFactory sessionFactory = config.buildSessionFactory();

        // creare obiecte pt DB
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Person person = new Person("Miki Mouse", 90, "miki.hauhau@yahoo.com");
        session.save(person);

        session.getTransaction().commit();

        List<Person> persons = session.createQuery("FROM Person", Person.class).list();
        for (Person p : persons) {
            System.out.println(p.getId() + " | " + p.getName() + " | " + p.getAge());
        }
        sessionFactory.close();
        }
}