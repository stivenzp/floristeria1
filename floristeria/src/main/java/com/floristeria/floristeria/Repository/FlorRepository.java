package com.floristeria.floristeria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.floristeria.floristeria.model.Flor;

public interface FlorRepository extends JpaRepository<Flor, Long> {
}
