package com.jbond.app.galileo.storage.entities;

import java.util.List;

public class GalileoIncomingPackageService {
    GalileoIncomingPackageDAO packageDAO = new GalileoIncomingPackageDAOImpl();

    public GalileoIncomingPackageService() {
    }

    public GalileoPackage findById(long id) {
        return packageDAO.findById(id);
    }

    public void savePackage(GalileoPackage galileoPkg) {
        packageDAO.save(galileoPkg);
    }

    public void deletePackage(GalileoPackage galileoPkg) {
        packageDAO.delete(galileoPkg);
    }

    public List<GalileoPackage> selectGalileoPkg(int rowCount) {
        return packageDAO.selectGalileoPkg(rowCount);
    }

}
