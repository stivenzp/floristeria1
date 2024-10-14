package com.floristeria.floristeria.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.floristeria.floristeria.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
