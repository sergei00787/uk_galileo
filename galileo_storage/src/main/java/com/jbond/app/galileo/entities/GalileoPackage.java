package com.jbond.app.galileo.entities;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name = "galileo_incoming_package", schema = "public")
public class GalileoPackage {
    public GalileoPackage() {
    }

    public GalileoPackage(byte[] packageData) {
        PackageData = packageData;
        this.updated = new Date();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="package_data")
    private byte[] PackageData;

    @Column(name="updated")
    private Date updated;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "GalileoPackege{" +
                "id=" + id +
                ", PackageData=" + Arrays.toString(PackageData) +
                ", updated=" + updated +
                '}';
    }
}
