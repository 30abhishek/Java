package com.company.day9;


import com.company.day7.Person;
import com.company.utils.Utility;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeDriver {
    public static void main(String[] args) {
//        Configuration configuration = new Configuration();
//        configuration.configure();
////        configuration.addAnnotatedClass(AnnotationEx.class);
//        configuration.addAnnotatedClass(Marks.class);
//        SessionFactory sessionFactory = configuration.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
////        session.persist(new AnnotationEx("tty",true ));
//        for (int i = 0; i <=5; i++){
//            session.persist(new Marks((int)(Math.random()*100)));
//        }
//
//        transaction.commit();
//        session.close();
        //        Session session = Utility.getSession("");
//        Transaction transaction = session.beginTransaction();
//        AnnotationEx annotationEx = new AnnotationEx();
//        annotationEx.setId(1);
//        annotationEx.setName("CS");
////        Employee employee = new Employee();
////        employee.setEmployeeId(001);
////        employee.setEmployeeName("qwerty");
////        employee.setDepartment("Computer");
//        session.persist(annotationEx);
//        transaction.commit();
//        session.close();
//        sumOfAllMarks();
        passingMarksNoOfRow();


    }
    private static void sumOfAllMarks() {
        Session session = Utility.getSession();
        System.out.println(session.createQuery("Select sum(marks) from Marks",Long.class).getSingleResult());
    }
    private static void passingMarksNoOfRow() {
        Session session = Utility.getSession();
        System.out.println(session.createQuery("Select count(*) from Marks where marks >40",Long.class).getSingleResult());
    }

}
