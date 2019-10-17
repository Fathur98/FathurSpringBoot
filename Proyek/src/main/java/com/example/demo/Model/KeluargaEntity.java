package com.example.demo.Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Keluarga", schema = "dbo", catalog = "aduhai")
public class KeluargaEntity {
    private Integer idka;
    private int idke;
    private String namaKeluarga;
    private String statusKeluarga;

    @Basic
    @Column(name = "Idka")
    public Integer getIdka() {
        return idka;
    }

    public void setIdka(Integer idka) {
        this.idka = idka;
    }

    @Id
    @Column(name = "Idke")
    public int getIdke() {
        return idke;
    }

    public void setIdke(int idke) {
        this.idke = idke;
    }

    @Basic
    @Column(name = "Nama_Keluarga")
    public String getNamaKeluarga() {
        return namaKeluarga;
    }

    public void setNamaKeluarga(String namaKeluarga) {
        this.namaKeluarga = namaKeluarga;
    }

    @Basic
    @Column(name = "Status_Keluarga")
    public String getStatusKeluarga() {
        return statusKeluarga;
    }

    public void setStatusKeluarga(String statusKeluarga) {
        this.statusKeluarga = statusKeluarga;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeluargaEntity that = (KeluargaEntity) o;
        return idke == that.idke &&
                Objects.equals(idka, that.idka) &&
                Objects.equals(namaKeluarga, that.namaKeluarga) &&
                Objects.equals(statusKeluarga, that.statusKeluarga);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idka, idke, namaKeluarga, statusKeluarga);
    }
}
