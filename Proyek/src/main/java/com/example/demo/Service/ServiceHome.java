package com.example.demo.Service;

import com.example.demo.Model.KaryawanEntity;
import com.example.demo.Repository.RepositoryHome;
import com.example.demo.Repository.RepositoryKeluarga;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("ServiceKaryawan")
public class ServiceHome {

    private final RepositoryHome repositoryHome;

    public ServiceHome(RepositoryHome repositoryHome, RepositoryKeluarga repositoryKeluarga) {
        this.repositoryHome = repositoryHome;
    }

    public List<KaryawanEntity> panggil() {
        return repositoryHome.findAll();
    }

    public void simpan(KaryawanEntity karyawanEntity){
        repositoryHome.save(karyawanEntity);
    }

    public void hapus(int id ){
        repositoryHome.deleteById(id);
    }

    public KaryawanEntity cari (int id){
        return repositoryHome.findById(id);
    }

}