package com.jbond.app.galileo.storage.entities;

import java.util.List;

public interface GalileoIncomingPackageDAO {
    void save(GalileoPackage galileoPackage);
    GalileoPackage findById(long id);
    void delete(GalileoPackage galileoPackage);
    List<GalileoPackage> selectGalileoPkg(int rowCount);
}
