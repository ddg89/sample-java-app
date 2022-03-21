package com.example.demo.Repository;

import com.example.demo.entities.Campi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticoliRepository extends JpaRepository<Campi, String> {
}
