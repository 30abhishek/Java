package com.company.assessment2.Question7;

import com.company.utils.Utility;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;
import org.hibernate.id.factory.spi.StandardGenerator;



public class CustomGenerator implements StandardGenerator {
    private final String DEFAULT_SEQUENCE_NAME="my_Seq";
    @Override
    public Object generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        Session session= Utility.getSession();
        Long length = session.createQuery("select count(product_name) from Product",Long.class).getSingleResult();
        return (length+1);
    }
}