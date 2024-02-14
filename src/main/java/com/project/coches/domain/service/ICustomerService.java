package com.project.coches.domain.service;

import com.project.coches.domain.dto.CustomerDto;
import com.project.coches.domain.dto.ResponseCurstomerDto;

import java.util.List;
import java.util.Optional;

/**
 * Interfaz de servicio cliente
 */
public interface ICustomerService {


    List<CustomerDto> getAll();

    Optional<CustomerDto> getCustomerDtoById(String cardId);

    Optional<CustomerDto> getCustomerByEmail(String email);

    ResponseCurstomerDto save(CustomerDto newCustomer);

    Optional<CustomerDto> update(CustomerDto newCustomer);

    boolean delete(String idCarBrand);
}
