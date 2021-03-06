package com.new_buildings.dao.impl;

import com.new_buildings.dao.interfaces.ApartmentDAO;
import com.new_buildings.entities.Address;
import com.new_buildings.entities.Apartment;
import org.hibernate.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ApartmentDAOImpl implements ApartmentDAO {
    private Logger logger = LoggerFactory.getLogger(ApartmentDAOImpl.class);
    private final SessionFactory sessionFactory;


    public ApartmentDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public List<Apartment> findAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Apartment> apartments = session.createNativeQuery("select * from apartments", Apartment.class).list();
        return apartments;
    }

    @Transactional
    public Apartment findById(Long aLong) {
        Session session = sessionFactory.getCurrentSession();
        Apartment apartment = session.find(Apartment.class, aLong);
        return apartment;
    }


    @Transactional
    public Apartment save(Apartment object) {
        Session session = sessionFactory.getCurrentSession();
        session.save(object);
        return object;

    }

    @Transactional
    public void delete(Apartment object) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(object);
    }

    @Transactional
    public void deleteById(Long aLong) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(aLong);
    }

    @Transactional
    public List<Apartment> findAllByID(long id) {
        Session session = sessionFactory.getCurrentSession();
        List<Apartment> apartments = session.createNativeQuery("select * from apartments where address_id =" + id, Apartment.class).list();
        return apartments;
    }
}
