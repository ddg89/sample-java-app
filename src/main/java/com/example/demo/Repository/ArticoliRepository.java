package com.example.demo.Repository;

import com.example.demo.entities.Articoli;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticoliRepository extends JpaRepository<Articoli, String> {
}
