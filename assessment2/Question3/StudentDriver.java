package com.company.assessment2.Question3;

import com.company.assessment2.Question3.Student;
import com.company.utils.Utility;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDriver {
    public static void main(String[] args) {

        //Without annotation
        Session session = Utility.getSession("Student.hmb.xml");
        Transaction transaction = session.beginTransaction();
        session.persist(new Student("qwerty",01, "university"));
        transaction.commit();
        session.close();

        //With annotation
        Session session2 = Utility.getSession();
        Transaction transaction2 = session.beginTransaction();
        session2.persist(new Student("qwerty",01, "university"));
        transaction2.commit();
        session.close();





    }
}
