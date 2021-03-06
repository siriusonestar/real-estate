package com.users.dao.impl;

import com.users.dao.interfaces.CustomerDAO;
import com.users.entities.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public class CustomerDAOImpl implements CustomerDAO {


    private SessionFactory sessionFactory;

    public CustomerDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public List<Customer> findAll() {
        return null;
    }

    @Override
    public Customer findById(Long aLong) {
        Session session = sessionFactory.getCurrentSession();
        Customer customer = session.load(Customer.class, aLong);
        return customer;
    }


    public Customer save(Customer object) {
        Session session = sessionFactory.getCurrentSession();
        session.save(object);
        return object;
    }

    @Override
    public void delete(Customer object) {

    }
}
