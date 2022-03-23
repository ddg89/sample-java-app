package com.example.demo.repository;

import com.example.demo.entity.Articoli;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticoliRepository extends JpaRepository<Articoli, String> {
}
