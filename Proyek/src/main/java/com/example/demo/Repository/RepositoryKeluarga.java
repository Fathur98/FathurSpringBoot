package com.example.demo.Repository;

import com.example.demo.Model.KeluargaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryKeluarga extends JpaRepository <KeluargaEntity, Integer> {
    KeluargaEntity findBy(int id);
}
