package com.concesionario.VentaAutos.repository;

import com.concesionario.VentaAutos.model.Coche;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CocheRepository {
    private List<Coche> cocheList;
    private Long id = 8L; // Manejar id's, empieza en 8 debido a la longitud de lo que ya hay insertado

    public CocheRepository(){

        cocheList = new ArrayList<>();

        cocheList.add(new Coche(1L, "Toyota", "Corolla", "50000", 4, 15000.0));
        cocheList.add(new Coche(2L, "Honda", "Civic", "30000", 4, 18000.0));
        cocheList.add(new Coche(3L, "Ford", "Mustang", "20000", 2, 35000.0));
        cocheList.add(new Coche(4L, "BMW", "X5", "10000", 4, 45000.0));
        cocheList.add(new Coche(5L, "Audi", "A4", "40000", 4, 25000.0));
        cocheList.add(new Coche(6L, "Mercedes-Benz", "C-Class", "25000", 4, 30000.0));
        cocheList.add(new Coche(7L, "Volkswagen", "Golf", "35000", 4, 20000.0));
        cocheList.add(new Coche(8L, "Subaru", "Outback", "15000", 4, 28000.0));
    }

    public void insertarCoche(Coche car) {
        car.setId(++id); // incrementar el id
        cocheList.add(car);
    }

    public List<Coche> getCoches() {
        return cocheList;
    }

}
