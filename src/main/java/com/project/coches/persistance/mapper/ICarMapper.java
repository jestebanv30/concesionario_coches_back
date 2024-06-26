package com.project.coches.persistance.mapper;

import com.project.coches.domain.dto.CarDto;
import com.project.coches.persistance.entity.CarEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper que transforma obj de Coche a Dto o entidades
 */
@Mapper(componentModel = "spring")
public interface ICarMapper {

    @Mapping(source = "carBrandEntity.description", target = "carBrandDescription")
    CarDto toCarDto (CarEntity carEntity);

    @Mapping(target = "carPurchaseEntities", ignore = true)
    @Mapping(target = "carBrandEntity", ignore = true)
    CarEntity toCarEntity (CarDto carDto);

    List<CarDto> toCarsDto (List<CarEntity> carEntityList);
}
