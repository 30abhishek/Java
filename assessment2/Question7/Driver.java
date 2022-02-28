package com.company.assessment2.Question7;

import com.company.utils.Utility;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Driver {
    public static void main(String[] args) {
        Session  session = Utility.getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(new Product("P-1",1000.0));
        transaction.commit();
        session.close();
    }
}