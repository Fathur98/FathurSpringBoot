package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "Karyawan", schema = "dbo", catalog = "FR")
public class HomeEntity {
    private int idKaryawan;
    private String namaKaryawan;
    private String alamatKaryawan;
    private String namaAyah;
    private String namaIbu;
    private String namaSaudara;
    private String namaSaudara2;
    private String namaSaudara3;

    @Id
    @Column(name = "Id_Karyawan")
    public int getIdKaryawan() {
        return idKaryawan;
    }

    public void setIdKaryawan(int idKaryawan) {
        this.idKaryawan = idKaryawan;
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

    @Basic
    @Column(name = "Nama_Ayah")
    public String getNamaAyah() {
        return namaAyah;
    }

    public void setNamaAyah(String namaAyah) {
        this.namaAyah= namaAyah;
    }

    @Basic
    @Column(name = "Nama_Ibu")
    public String getNamaIbu() {
        return namaIbu;
    }

    public void setNamaIbu(String namaIbu) {
        this.namaIbu = namaIbu;
    }

    @Basic
    @Column(name = "Nama_Saudara")
    public String getNamaSaudara() {
        return namaSaudara;
    }

    public void setNamaSaudara(String namaSaudara) {
        this.namaSaudara= namaSaudara;
    }

    @Basic
    @Column(name = "Nama_Saudara_II")
    public String getNamaSaudara2() {
        return namaSaudara2;
    }

    public void setNamaSaudara2(String namaSaudara2) {
        this.namaSaudara2= namaSaudara2;
    }

    @Basic
    @Column(name = "Nama_Saudara_III")
    public String getNamaSaudara3() {
        return namaSaudara3;
    }

    public void setNamaSaudara3(String namaSaudara3) {
        this.namaSaudara3 = namaSaudara3;
    }
}
