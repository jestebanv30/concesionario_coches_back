package com.project.coches.domain.repository;

import com.project.coches.domain.dto.CarBrandDto;

import java.util.List;
import java.util.Optional;

/**
 * Interfaz de marca coche
 */
public interface ICarBrandRepository {

    /**
     * Obtiene lista de marcas coches pojo
     * @return lista de MarcasCochesPojo
     */
    List<CarBrandDto> getAll();

    /**
     * Optional (en caso de encontrar devuelve la MarcaCoche y
     * en caso de que no, evita el null)
     * @param id Marca de coche a buscar
     * @return Marca de coche encontrada
     */
    Optional<CarBrandDto> getCarBrand(Integer id);

    /**
     * Busca una descripción existente de marca coche
     * @param description descripcion a buscar
     * @return descripcion encontrada
     */
    Optional<CarBrandDto> getCarBrandByDescription(String description);
    /**
     * Guarda una marca de coche
     * @param carBrandDtoNew MarcaCochePojo nueva
     * @return Guarda una MarcaCochePojo
     */
    CarBrandDto save(CarBrandDto carBrandDtoNew);

    /**
     * Elimina una marca de coche
     * @param idCarBrand Marca de coche a eliminar
     */
    void delete(Integer idCarBrand);

}
