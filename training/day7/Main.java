package com.company.day7;

import com.company.day8.Car2;
import com.company.assessment2.Question3.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
//      Person person = new Person(1, "name-1", "address-1");
//        Car car = new Car(2, "bmw", 50);
        Car2 car2 = new Car2(101,150.0,"Audi R8",150.5f,'A',true,125678l);
        Configuration configuration = new Configuration();
        configuration.configure();
//      configuration.addAnnotatedClass(Person.class);
        configuration.addAnnotatedClass(Car2.class);
//      configuration.addResource("Person.hbm.xml");
        configuration.addResource("Car2.hbm.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(car2);
//        for (int i = 0; i<=5; i++) {
//            session.persist(new Student("Abhishek", 00+i, "Medi-Caps"));
//        }
        transaction.commit();
        session.close();

    }
}
