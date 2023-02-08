package com.api.parkingcontrol.services.impl;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import com.api.parkingcontrol.services.ParkingSpotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingServiceSpotImpl implements ParkingSpotService {

    @Autowired
    ParkingSpotRepository parkingSpotRepository;

    @Override
    @Transactional
    public ParkingSpotModel salvar(ParkingSpotModel parkingSpotModel) {
        return parkingSpotRepository.save(parkingSpotModel);
    }

    @Override
    public ParkingSpotModel atualizar(ParkingSpotModel bean) {
        return null;
    }

    @Override
    public void deletar(UUID id) {
        parkingSpotRepository.deleteById(id);
    }

    @Override
    public Optional<ParkingSpotModel> getById(UUID id) {
        return parkingSpotRepository.findById(id);
    }

    @Override
    public Page<ParkingSpotModel> getAll(Pageable pageable) {
        return parkingSpotRepository.findAll(pageable);
    }

    @Override
    public Boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    @Override
    public Boolean existsByApartmentAndBlock(String apartment, String block) {
        return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
    }

    @Override
    public Boolean existsByLicensePlateCar(String licensePlateCar) {
        return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    }


}
