package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public interface ParkingSpotService {

    ParkingSpotModel salvar(ParkingSpotModel bean);

    Optional<ParkingSpotModel> getById(UUID id);

    ParkingSpotModel atualizar(ParkingSpotModel bean);

    void deletar(UUID id);

    Page<ParkingSpotModel> getAll(Pageable pageable);

    Boolean existsByParkingSpotNumber(String parkingSpotNumber);

    Boolean existsByApartmentAndBlock(String apartment, String block);

    Boolean existsByLicensePlateCar(String licensePlateCar);
}
