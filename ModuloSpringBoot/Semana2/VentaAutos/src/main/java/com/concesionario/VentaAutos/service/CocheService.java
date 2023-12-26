package com.concesionario.VentaAutos.service;

import com.concesionario.VentaAutos.model.Coche;
import com.concesionario.VentaAutos.repository.CocheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Comparator;
import java.util.List;

@Service
public class CocheService implements ICocheService {

    @Autowired
    CocheRepository cocheRepository;

    @Override
    public List<Coche> getCoches() {
        return null;
    }

    @Override
    public void insertarCoche(Coche coche) {
        cocheRepository.insertarCoche(coche);
    }

    @Override
    public List<Coche> getCochesOrdPrecio() {
        return cocheRepository.getCoches().stream()
                .sorted(Comparator.comparing(Coche::getPrice)).toList();
    }

    @Override
    public Coche getCochePorId(Long id) {
        return cocheRepository.getCoches().stream()
                .filter(n -> n.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
