package com.floristeria.floristeria.Service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.floristeria.floristeria.Repository.FlorRepository;
import com.floristeria.floristeria.model.Flor;

@Service
public class FlorService {

    @Autowired
    private FlorRepository florRepository;

    public List<Flor> getAllFlores() {
        return florRepository.findAll();
    }

    public Optional<Flor> getFlorById(Long id) {
        return florRepository.findById(id);
    }

    public Flor addFlor(Flor flor) {
        return florRepository.save(flor);
    }

    public Flor updateFlor(Long id, Flor florDetails) {
        Flor flor = florRepository.findById(id).orElseThrow();
        flor.setTipo(florDetails.getTipo());
        flor.setColor(florDetails.getColor());
        flor.setVariedad(florDetails.getVariedad());
        flor.setCantidadDisponible(florDetails.getCantidadDisponible());
        flor.setPrecioCompra(florDetails.getPrecioCompra());
        flor.setPrecioVenta(florDetails.getPrecioVenta());
        return florRepository.save(flor);
    }
}
