package com.floristeria.floristeria.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.floristeria.floristeria.Repository.PedidoRepository;
import com.floristeria.floristeria.model.Pedido;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido> getAllPedidos() {
        return pedidoRepository.findAll();
    }

    public Pedido addPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }
}
