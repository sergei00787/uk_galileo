package com.jbond.app.galileo.entities;

import com.jbond.app.galileo.HibernateSessionFactoryUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class GalileoIncomingPackageDAOImpl implements GalileoIncomingPackageDAO {
    @Override
    public void save(GalileoPackage galileoPackage) {

        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try (session) {
            tx = session.beginTransaction();
            session.persist(galileoPackage);
            tx.commit();
        } catch (Exception ex) {
            System.err.println();
            if (tx != null) tx.rollback();
        }
    }

    @Override
    public GalileoPackage findById(long id) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        GalileoPackage pkg = null;
        try {
            pkg = session.get(GalileoPackage.class, id);
            tx.commit();
        } catch (Exception ex) {
            System.err.println();
            if (tx != null) tx.rollback();
        } finally {
            session.close();
        }
        return pkg;
    }

    @Override
    public void delete(GalileoPackage galileoPackage) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try (session) {
            tx = session.beginTransaction();
            session.remove(galileoPackage);
            tx.commit();
        } catch (Exception ex) {
            System.err.println();
            if (tx != null) tx.rollback();
        }
    }
}
