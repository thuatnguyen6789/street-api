package com.example.streetapispringboot.repository;

import com.example.streetapispringboot.entity.Street;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StreetRepository extends JpaRepository<Street, String> {
}
