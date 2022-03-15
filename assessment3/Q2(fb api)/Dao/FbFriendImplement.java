package com.company.assessment3.FacebookAPI.Dao;

import com.company.assessment3.FacebookAPI.ModelClasses.FbAddFriend;
import com.company.assessment3.FacebookAPI.ModelClasses.FbUser;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FbFriendImplement implements Dao{
    @Autowired
    Session session;
    @Override
    public List<FbAddFriend> readAll() {
        return session.createQuery("from friends", FbAddFriend.class).getResultList();
    }

    @Override
    public void create(Object entity) {
        session.beginTransaction();
        session.persist(entity);
        session.getTransaction().commit();
    }

    @Override
    public Object readById(int id) {
        return null;
    }

    @Override
    public Boolean update(Object entity) {
        return null;
    }

    @Override
    public void delete(Object entity) {

    }

    @Override
    public Object readByEmail(String entity) {
        return null;
    }
}
