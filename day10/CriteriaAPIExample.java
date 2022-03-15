//package com.company.day10;
//import com.company.day9.Driver;
//import com.company.day9.Marks;
//import com.company.day9.Student;
//import jakarta.persistence.Query;
//import jakarta.persistence.criteria.CriteriaBuilder;
//import jakarta.persistence.criteria.CriteriaQuery;
//import jakarta.persistence.criteria.Root;
//import org.hibernate.Session;
//import com.company.utils.Utility;
//
///*
//various ways to fetch data
//(i) session.get(Student.class,1) -> return you the student object
//(ii) HQL -> hibernate query language
//(iii) Hibernate criteria API
//criteria -> marks > 40
// HQL -> from Student
// SQL -> select * from student_records
// aggregate functions, where, groupby -> converted to Java functions.
//Benefit
// */
//public class CriteriaAPIExample {
//    public static void main(String[] args) {
//        Session session = Utility.getSession();
//        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
//        CriteriaQuery<Student> critertiaQuery = criteriaBuilder.createQuery(Student.class);
//        Root<Student> root = critertiaQuery.from(Student.class);
//        /*
//        root is like root of a tree.
//        Binary Trees in algorithm or in general what is a tree in a graph
//         */
//        critertiaQuery.select(root);
//        System.out.println(session.createQuery(critertiaQuery).getResultList());
//    }
//    private static CriteriaQuery<Marks> showname(Session session){
//        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
//        CriteriaQuery criteriaQuery = criteriaBuilder.createQuery(Marks.class);
//        Root<Marks> root = criteriaQuery.from(Marks.class);
//        return criteriaQuery.select(root).where
//
//    }
//}