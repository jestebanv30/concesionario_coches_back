package com.project.coches.domain.repository;

import com.project.coches.domain.dto.CarBrandDto;

import java.util.List;
import java.util.Optional;

/**
 * Interfaz de repositorio marca coche
 */
public interface ICarBrandRepository {

    /**
     * Devuelve una lista con todas las marcas de coche
     *
     * @return lista con marcas de coches
     */
    List<CarBrandDto> getAll();

    /**
     * Consulta una marca de coche dada su id
     *
     * @param id parametro id a constultar
     * @return Devuelve una marca de coche
     */
    Optional<CarBrandDto> getCarBrand(Integer id);

    /**
     * Guarda una nueva marca coche
     *
     * @param newCarBrand marca coche a guardar
     * @return marca coche guardada
     */
    CarBrandDto save(CarBrandDto newCarBrand);

    /**
     * Elimina una marca coche dada su ID
     *
     * @param idCarBrand marca coche a eliminar
     */
    void delete(Integer idCarBrand);
}
