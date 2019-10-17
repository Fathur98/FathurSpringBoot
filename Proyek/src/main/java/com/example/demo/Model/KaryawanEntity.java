package com.example.demo.Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Karyawan", schema = "dbo", catalog = "aduhai")
public class KaryawanEntity {
    private int id;
    private String namaKaryawan;
    private String alamatKaryawan;

    @Id
    @Column(name = "Id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Nama_Karyawan")
    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    @Basic
    @Column(name = "Alamat_Karyawan")
    public String getAlamatKaryawan() {
        return alamatKaryawan;
    }

    public void setAlamatKaryawan(String alamatKaryawan) {
        this.alamatKaryawan = alamatKaryawan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KaryawanEntity that = (KaryawanEntity) o;
        return id == that.id &&
                Objects.equals(namaKaryawan, that.namaKaryawan) &&
                Objects.equals(alamatKaryawan, that.alamatKaryawan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, namaKaryawan, alamatKaryawan);
    }
}
