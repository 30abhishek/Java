//package com.company.day8;
//
//import com.company.utils.Utility;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//public class StudentDriver {
//    public static void main(String[] args) {
//
//
//        Session session = Utility.getSession("Student.hmb.xml");
//        Transaction transaction = session.beginTransaction();
//        session.persist(new Student("qwerty",01, "university"));
//        transaction.commit();
//        session.close();
//
//
//
//
//
//    }
//}
