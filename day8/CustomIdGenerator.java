package com.company.day8;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.factory.spi.StandardGenerator;

import java.util.Random;

public class CustomIdGenerator implements StandardGenerator {

    @Override
    public Object generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        int n = 10000 + new Random().nextInt(90000);
        return n;
    }
}
