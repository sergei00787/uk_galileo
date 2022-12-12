package com.jbond.app.galileo.storage.entities;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

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

    public Long getId() {
        return id;
    }

    public byte[] getPackageData() {
        return PackageData;
    }

    public Date getUpdated() {
        return updated;
    }

    @Override
    public String toString() {
        return "GalileoPackege{" +
                "id=" + id +
                ", PackageData=" + Arrays.toString(PackageData) +
                ", updated=" + updated +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GalileoPackage)) return false;
        GalileoPackage that = (GalileoPackage) o;
        return Objects.equals(id, that.id) && Arrays.equals(PackageData, that.PackageData) && Objects.equals(updated, that.updated);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, updated);
        result = 31 * result + Arrays.hashCode(PackageData);
        return result;
    }
}
