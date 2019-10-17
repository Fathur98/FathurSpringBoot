package com.example.demo.Service;

import com.example.demo.Model.KeluargaEntity;
import com.example.demo.Repository.RepositoryKeluarga;

import java.util.ArrayList;
import java.util.List;

public class ServiceKeluarga {
    private final RepositoryKeluarga repositoryKeluarga;

    public ServiceKeluarga(RepositoryKeluarga repositoryKeluarga) {
        this.repositoryKeluarga = repositoryKeluarga;
    }

    public List<KeluargaEntity> panggil2(int id) {
        List <KeluargaEntity> list, listFilter = new ArrayList<>();
        list = repositoryKeluarga.findAll();
        for (KeluargaEntity klg : list){
            if (klg.getIdka()== id){
                listFilter.add(klg);
            }
        }
        return listFilter;
    }
}
