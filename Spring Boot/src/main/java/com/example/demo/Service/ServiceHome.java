package com.example.demo.Service;

import com.example.demo.Model.HomeEntity;
import com.example.demo.Repository.RepositoryHome;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("serviceHome")
public class ServiceHome {

    private final RepositoryHome repositoryHome;

    public ServiceHome(RepositoryHome repositoryHome) {
        this.repositoryHome = repositoryHome;
    }

    public List<HomeEntity> panggilAllKaryawan() {
        return repositoryHome.findAll();
    }

    public void simpanKaryawan (HomeEntity homeEntity){
        repositoryHome.save(homeEntity);
    }

    public void hapusKaryawan (int idKaryawan){
        repositoryHome.deleteById(idKaryawan);
    }

    public HomeEntity cariKaryawan (int idKaryawan){
        return repositoryHome.findByIdKaryawan(idKaryawan);
    }
}