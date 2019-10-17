package com.example.demo.Repository;

import com.example.demo.Model.KaryawanEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryHome extends JpaRepository <KaryawanEntity, Integer> {
    KaryawanEntity findById(int id);
}
