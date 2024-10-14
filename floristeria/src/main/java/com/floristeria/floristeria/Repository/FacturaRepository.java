package com.floristeria.floristeria.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.floristeria.floristeria.model.Factura;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
}
