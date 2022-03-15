package com.company.utils;

import com.company.assessment2.Question3.Student;
import com.company.day9.Marks;
import com.company.day9.Tweet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {
    public static Session getSession(String hibernetMappingFileName) {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addResource(hibernetMappingFileName);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session;
    }
    public static Session getSession() {
        Configuration configuration = new Configuration();
        configuration.configure();
        configuration.addAnnotatedClass(Student.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        return session;
    }

}
