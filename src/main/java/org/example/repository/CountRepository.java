package org.example.repository;

import org.example.model.CountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountRepository extends JpaRepository<CountEntity, Long> { }