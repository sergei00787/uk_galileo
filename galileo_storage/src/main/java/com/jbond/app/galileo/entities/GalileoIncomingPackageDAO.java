package com.jbond.app.galileo.entities;

public interface GalileoIncomingPackageDAO {
    void save(GalileoPackage galileoPackage);
    GalileoPackage findById(long id);
    void delete(GalileoPackage galileoPackage);
}
