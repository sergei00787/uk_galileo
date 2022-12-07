package com.jbond.app.galileo.entities;

public class GalileoIncomingPackageService {
    GalileoIncomingPackageDAO packageDAO = new GalileoIncomingPackageDAOImpl();

    public GalileoIncomingPackageService() {}

    public GalileoPackage findById(long id){
        return packageDAO.findById(id);
    }

    public void savePackage(GalileoPackage galileoPkg){
        packageDAO.save(galileoPkg);
    }

    public void deletePackage(GalileoPackage galileoPkg){
        packageDAO.delete(galileoPkg);
    }

}
