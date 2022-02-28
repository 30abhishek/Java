//Ans 4.
//CRUD stands for Create, Read, Update and Delete.
//Create - used to create or insert a new record.
//Read - used to read data from the table.
//Update - used to update the data in the table.
//Delete - used to delete data in the table.
//

package com.company.assessment2.Question4;

import com.company.assessment2.Question3.Student;
import com.company.utils.Utility;
import jdk.jshell.execution.Util;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class Question4Crud {
    public static void main(String[] args) {

    }
    public static void create(){
        Session session = Utility.getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(new Student("qwerty"));
        transaction.commit();
        session.close();

    }

    public static void read(){
        Session session = Utility.getSession();
        List<Student> studentList = session.createQuery("from student", Student.class).getResultList();
        System.out.println(studentList);
        session.close();
    }

    public static void update(){
        Session session = Utility.getSession();
        Transaction transaction = session.beginTransaction();
        Student student = session.get(Student.class,1 );
        student.setName("qwerty2");
        session.persist(student);
        transaction.commit();
        session.close();
    }

    public static void delete(){
        Session session = Utility.getSession();
        Transaction transaction =  session.beginTransaction();
        Student student =  session.get(Student.class,1);
        session.remove(student);
        transaction.commit();
        session.close();
    }
}
