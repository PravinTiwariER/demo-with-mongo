package com.examongo.demowithmongo.service;

import com.examongo.demowithmongo.model.Address;
import com.examongo.demowithmongo.model.Hotels;
import com.examongo.demowithmongo.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
    private HotelRepository repository;

    @Override
    public Hotels createHotel(Hotels hotels) {
        return repository.save(hotels);
    }

    @Override
    public List<Hotels> getAllHotels() {
        return repository.findAll();
    }

    @Override
    public Optional<Hotels> getHotelById(String id) {
        return repository.findById(id);
    }

    @Override
    public Hotels getHotelByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public Hotels updateHotel(Hotels hotel) {

        return repository.save(hotel);
    }

    @Override
    public void deleteHotelById(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Hotels> getHotelsByCity(String city) {
        return repository.findByCity(city);
    }

}
