package com.concesionario.VentaAutos.service;

import com.concesionario.VentaAutos.model.Coche;

import java.util.List;

public interface ICocheService {

    List<Coche> getCoches();

    void insertarCoche(Coche coche);


    List<Coche> getCochesOrdPrecio();

    Coche getCochePorId(Long id);
}
