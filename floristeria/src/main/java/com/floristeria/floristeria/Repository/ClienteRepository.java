package com.floristeria.floristeria.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.floristeria.floristeria.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
