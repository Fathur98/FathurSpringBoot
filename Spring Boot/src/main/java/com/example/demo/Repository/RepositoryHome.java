package com.example.demo.Repository;

import com.example.demo.Model.HomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryHome extends JpaRepository <HomeEntity, Integer> {
    HomeEntity findByIdKaryawan(int idKaryawan);
}
